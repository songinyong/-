package ex5;

public class RedBlackTree<Key extends Comparable<Key>, Value>{
	private static final boolean RED = true ;
	private static final boolean BLACK = false ;
	private Node root ;
	private class Node {
		Key id;
		Value name;
		Node left, right;
		boolean color;
		public Node(Key k, Value v, boolean col) {
			id =k;
			name = v;
			color = col;
			left = right = null ;
		}
	}
	
	private boolean isEmpty() {return root ==null ; }
	private boolean isRed(Node n) {
		if(n == null) return false ;
		return (n.color == RED) ;
	}
	
	public Value get(Key k) { return get(root, k);}
	public Value get(Node n, Key k) {
		if (n==null) return null ;
		int t = n.id.compareTo(k) ;
		if(t >0) return get(n.left, k) ;
		else if (t < 0) return get(n.right, k) ;
		else return(Value) n.name ;
	}
	
	private Node rotateLeft(Node n) {
		Node x = n.right ;
		n.right = x.left ;
		x.left = n;
		x.color = n.color;
		n.color = RED ;
		return x;
	}
	
	private Node rotateRight(Node n) {
		Node x = n.left ;
		n.left = x.right ;
		x.right = n;
		x.color = n.color;
		n.color = RED;
		return x;
	}

	
	private void flipColors(Node n) {
		n.color = !n.color;
		n.left.color = !n.left.color;
		n.right.color= !n.right.color;
	}
	
	public void put(Key k, Value v) {
		root = put(root, k, v);
		root.color = BLACK ;
	}
	
	private Node put(Node n, Key k, Value v) {
		if(n == null) return new Node(k, v, RED);
		int t = k.compareTo(n.id);
		if(t<0) n.left = put(n.left, k, v) ;
		else if(t>0) n.right = put(n.right, k, v) ;
		else  	n.name =v;
		
		if(!isRed(n.left) && isRed(n.right))		n = rotateLeft(n);
		if(isRed(n.left) && isRed(n.left.left)) 	n = rotateRight(n);
		if(isRed(n.left) && isRed(n.right))			flipColors(n);
		return n;
	}
	
	private Node moveRedLeft(Node n) {
		flipColors(n);
		if(isRed(n.right.left)) {
			n.right = rotateRight(n.right);
			n = rotateLeft(n);
			flipColors(n);
		}
		return n ;
	}
	
	public void deleteMin() {
		root = deleteMin(root);
		root.color = BLACK ;
	}
	
	private Node deleteMin(Node n) {
		if(n.left == null) return null ;
		if(!isRed(n.left) && !isRed(n.left.left))
			n = moveRedLeft(n);
		n.left = deleteMin(n.left);
		return fixUp(n);
	}
	
	private Node fixUp(Node n) {
		if(isRed(n.right)) n = rotateLeft(n);
		if(isRed(n.left) && isRed(n.left.left)) n = rotateRight(n) ;
		if(isRed(n.left) && isRed(n.right))  flipColors(n);
		return n ;
	}
	public Key root() {
		return root.id ;
	}
}
