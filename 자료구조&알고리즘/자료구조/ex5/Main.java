package ex5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedBlackTree tree = new RedBlackTree();
		
		tree.put(5, 4);
		tree.put(40, 5);
		tree.put(30, 6);
		tree.put(90, 7);
		tree.put(70, 8);
		tree.put(60, 1);
		tree.put(20, 2);
		tree.put(10, 3);
		System.out.println(tree.root());
	}

}
