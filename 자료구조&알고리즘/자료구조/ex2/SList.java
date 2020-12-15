/*
 *단순 연결 리스트 구현 연습 
 * */

package ex2;
import java.util.NoSuchElementException; // 리스트가 empty인 상황에서 항목을 읽으려하면 정지시키는 예외처리
public class SList <E>{
	protected Node head ; 
	
	private int size ;
	public SList() {
		head = null ;
		size = 0 ;
		
	}
	
	
	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++ ;
	}
	
	public void deleteFront() {
		if(isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p) {
		if(p ==null) throw new NoSuchElementException();
		Node t = p.getNext() ;
		p.setNext(t.getNext());
		t.setNext(null);
		size-- ;
	}
	
	public SList ex17(SList first, SList Last) {
	 int temp[] = new int[first.size+Last.size];
	 int temp2 ;
	 SList result = new SList();
	 Node next = first.head ;
		for(int i=0; i<first.size; i++) {
			temp[i] = (int)next.getItem() ;
			next = next.getNext() ;
		}
		next = Last.head ;
		for(int i=first.size; i<first.size+Last.size; i++) {
			temp[i] = (int)next.getItem() ;
			next = next.getNext() ;
		}
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp.length; j++) {
				if(temp[i] > temp[j]) {
					temp2 = temp[i];
					temp[i] = temp[j] ;
					temp[j] = temp2 ;
				}
			}
		}
		
		for(int i=0; i<temp.length; i++) {
			result.insertFront(temp[i]);
		}
		return result ;
	}
	


	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
