package com.chandran.learning;

class Node {

	private Node next;
	private Object data;

	public Node(Node nextNode, Object nodeData) {
		next = nextNode;
		data = nodeData;
	}

	public Node(Object nodeData) {
		next = null;
		data = nodeData;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
};

class SimpleLinkedList {

	private static int counter;
	private Node head;

	public SimpleLinkedList() {
	}

	public void add(Object addData) {
		if (null == head) {			
			head = new Node(addData);
			head.setNext(null);
		}

		Node noteTemp = new Node(addData);
		Node headTemp = head;

		if (null != headTemp) {
			while (null != headTemp.getNext()) {
				headTemp = headTemp.getNext();
			}
		}
		headTemp.setNext(noteTemp);
		counter++;
	}
	
	public int size() {
		return counter;
	}

	// returns the element at the specified position in this list.
	public Object get(int index) {
		if (index > 0) {
			Node nodeForIndex = null;
			if (null != head) {
				nodeForIndex = head.getNext();
				for (int i = 0; i < index; i++) {
					if (null == nodeForIndex.getNext()) {
						return null;
					}
					nodeForIndex = nodeForIndex.getNext();
				}
				return nodeForIndex.getNext();
			}
			return nodeForIndex;
		} else {
			return null;
		}
	}
	
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
		// if the index is out of range, exit
		if (index < 1 || index > counter)
			return false;
		Node crunchifyCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getNext() == null)
					return false;
 
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
 
			// decrement the number of elements variable
			counter = counter-1;
			return true; 
		}
		return false;
	}	
};

public class SimpleSLinkedList {
	public static SimpleLinkedList ssList;
	public static void main(String[] args) {
		ssList= new SimpleLinkedList();
		ssList.add(1);
		ssList.add(2);
		ssList.add(3);
		ssList.add(4);
		ssList.add(5);
		System.out.println(" ssList : "+ssList);
		System.out.println(" ssList.size : "+ssList.size());
		
		System.out.println(" ssList 3 : "+ssList.get(5));
		System.out.println(" ssList 3 : "+ ((Node)ssList.get(5)).getData());
		
		

	}

}
