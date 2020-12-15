package ex3;

public class Main {

	public static void main(String[] args) {
		ArrayStack<String> stack = new ArrayStack<String>();
		
		stack.push("apple");
		stack.push("banana");
		
		stack.peek();
		stack.peek();
		stack.peek();
	}

}
