package ex5;

public class Main2 {

	public static void main(String[] args) {
		BST bst = new BST(30, 1) ;
		bst.put(20, 2);
		bst.put(30, 3);
		bst.put(50, 4);
		bst.put(40, 5);
		bst.put(60, 6);
		
		System.out.println(bst.kthSmallest(3).getKey());
	}

}
