package ex4;



public class LNode <E> {
	private E item ;
	private LNode<E> next ;
	
	public LNode(E newItem, LNode<E> node) {
		item = newItem;
		next = node ;
	}
	
	public E getItem( ) {return item;}
	public LNode<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(LNode<E> newNext) {next = newNext ;}
}
