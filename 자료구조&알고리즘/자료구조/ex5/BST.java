package ex5;

public class BST<Key extends Comparable<Key>, Value> {
	public Node root ;
	public Node getRoot() { return root;}
	public BST(Key newId, Value newName) {
		root = new Node(newId, newName);
	}
	
	public Value get(Key k) {return get(root,k);}
	public Value get(Node n, Key k) {
		if(n == null) return null ;
		int t = n.getKey().compareTo(k);
		if(t>0) return get(n.getLeft(), k) ;
		else if(t <0) return get(n.getRight(), k) ;
		else return (Value) n.getValue();
	}
	
	public void put(Key k ,Value v) {root = put(root, k, v);}
	public Node put(Node n, Key k, Value v) {
		if(n == null) return new Node(k,v);
		int t = n.getKey().compareTo(k) ;
		if(t >0) n.setLeft(put(n.getLeft(), k, v));
		else if (t <0) n.setRight(put(n.getRight(), k, v));
		else n.setValue(v);
		return n;
	}
	
	public Key min() {
		if(root == null) return null ;
		return (Key) min(root).getKey();}
	private Node min(Node n) {
		if(n.getLeft()== null) return n;
		return min(n.getLeft());
	}
	
	public void deleteMin() {
		if(root == null) System.out.println("empty 트리");
		root = deleteMin(root);}
	public Node deleteMin(Node n) {
		if(n.getLeft() == null) return n.getRight();
		n.setLeft(deleteMin(n.getLeft()));
		return n;
	}
	
	public void deleteMax() {
		if(root == null) System.out.println("empty 트리");
		root = deleteMax(root);}
	
	public Node deleteMax(Node n) {
		if(n.getRight() == null) return n.getLeft();
		n.setRight(deleteMax(n.getRight()));
		return n;
	}
	
	public void delete(Key k) {root = delete(root, k); }
	public Node delete(Node n, Key k) {
		if(n ==null) return null ;
		int t = n.getKey().compareTo(k);
		if (t >0) n.setLeft(delete(n.getLeft(), k));
		else if (t <0) n.setRight(delete(n.getRight(), k));
		else {
			if (n.getRight() ==null) return n.getLeft();
			if (n.getLeft() == null) return n.getRight();
			Node target = n ;
			n = min(target.getRight());
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		
		return n;
	}
	
	public Node kthSmallest(int k) {
		
		return kthSmallest(root, k);
		
	}
	private Node kthSmallest(Node n, int count) {
		Key d = min() ;
		Node ksmall ;
		if(n.getKey() != d) return kthSmallest(n.getLeft(), count) ;
	
		else {
			count-- ;
			if(count ==1) {
				ksmall = n ;
				return ksmall ;
			}
			else {
				if (n.getRight() ==null) return n.getLeft();
				if (n.getLeft() == null) return n.getRight();
				return kthSmallest(n.getRight(), count--) ;
			}
		}
		
	}
	
	
}
