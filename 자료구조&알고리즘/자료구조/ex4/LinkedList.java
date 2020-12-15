package ex4;

import java.util.NoSuchElementException;



public class LinkedList <E>{

protected LNode head ; 
	
	private int size ;
	public LinkedList() {
		head = null ;
		size = 0 ;
		
	}

	
	
	
	public void insertFront(E newItem) {
		head = new LNode(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, LNode p) {
		p.setNext(new LNode(newItem, p.getNext()));
		size++ ;
	}
	
	public void deleteFront() {
		if(isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(LNode p) {
		if(p ==null) throw new NoSuchElementException();
		LNode t = p.getNext() ;
		p.setNext(t.getNext());
		t.setNext(null);
		size-- ;
	}
	
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
