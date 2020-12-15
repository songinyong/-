package ex2;

public class Test {

	public static void main(String[] args) {
	SList list = new SList();
	SList list2 = new SList();
	SList result = new SList();
	Node sd ;
	list.insertFront(3);
	list.insertFront(2);
	list.insertFront(7);
	
	
	list2.insertFront(5);
	list2.insertFront(4);
	list2.insertFront(1);
	
	
	result = list.ex17(list, list2) ;
	
	for(int i=0; i<6; i++) {
		System.out.println(result.head.getItem()) ;
		result.head = result.head.getNext() ;
	}

	
	}
	
	

}


