package ex4;

import java.util.NoSuchElementException ;


public class Queue <E>{
	private LNode<E> front, rear ;
	private int size;
	public Queue() {
		front = rear = null ;
		size = 0 ;
	}
	
	public int size() {return size;}
	public boolean isEmpty() {return size() == 0 ;}
	
	public void add(E newItem) {
		LNode newNode = new LNode(newItem, null) ;
		if(isEmpty()) front = newNode ; 
		else rear.setNext(newNode);
		rear = newNode ;
		size++ ;
	}
	
	public E remove() {
		if(isEmpty()) throw new NoSuchElementException();
		E frontItem =  front.getItem();
		front = front.getNext();
		if(isEmpty())rear = null ;
		size--;
		return frontItem ;
	}

}