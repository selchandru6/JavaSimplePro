package com.chandran.learning;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileReading10GB {

	public static void main(String[] args) throws IOException {
		String path="C:/Chandran/Java/ApplicationLog/mailerlog.txt";
		/*FileInputStream inputStream = null;
		Map<String, Integer> wordCnt = new HashMap<>();
		Scanner sc = null;
		String word=null;
		String path="C:/Chandran/Java/ApplicationLog/mailerlog.txt";
		try {
			inputStream = new FileInputStream(path);
			sc = new Scanner(inputStream, "UTF-8");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				StringTokenizer st =  new StringTokenizer(line);
				while(st.hasMoreTokens()){
					word= st.nextToken();
					if(wordCnt.containsKey(word)){					
						wordCnt.put(word,  wordCnt.get(word)+1);
					}else{
						wordCnt.put(word,1);
					}
				}				
				 System.out.println(line);
			}
			// note that Scanner suppresses exceptions
			if (sc.ioException() != null) {
				throw sc.ioException();
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (sc != null) {
				sc.close();
			}
		}
		System.out.println("The map size : "+wordCnt.size());
		for(Map.Entry<String,Integer> wc : wordCnt.entrySet()){
			System.out.println(wc.getKey()+ " -> "+wc.getValue());
		}*/
		
		
		ExecutorService exec = Executors.newFixedThreadPool(10);
		Map<String, Integer> wordCnt = new ConcurrentHashMap<>();		
		// use RandomAccessFile because it supports readFully()
		RandomAccessFile in = new RandomAccessFile(path, "r");
		in.seek(0L);
		
		
		while (in.getFilePointer() < in.length())
		{
		    int readSize = (int)Math.min(1000000, in.length() - in.getFilePointer());
		    final byte[] data = new byte[readSize];
		    in.readFully(data);
		    exec.execute(new Runnable() 
		    {
		        public void run() 
		        {
		            if(data.length >0){
		            	String words = new String(data);
		            	StringTokenizer st =  new StringTokenizer(words);
		            	System.out.println(words);
		            	
						while(st.hasMoreTokens()){
							String word= st.nextToken();
							if(wordCnt.containsKey(word)){					
								wordCnt.put(word,  wordCnt.get(word)+1);
							}else{
								wordCnt.put(word,1);
							}
						}		
		            	
		            }
		        }
		    });
		}
		System.out.println("The map size : "+wordCnt.size());
		for(Map.Entry<String,Integer> wc : wordCnt.entrySet()){
			System.out.println(wc.getKey()+ " -> "+wc.getValue());
		}
	}

}
