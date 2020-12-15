package chapter1;
import java.util.*;
public class Uva12289 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt() ;
		 String str = sc.nextLine();
		for(int i=0; i<testCase; i++) {	    
			 str = sc.nextLine() ;
			int count = 0 ;
			if(str.charAt(0) =='o') count++ ;
			if(str.charAt(1) == 'n') count++ ;
			if(str.charAt(2) == 'e') count++ ;
			if(str.length() >3) System.out.println(3);
			else if(count >1) System.out.println(1);
			else System.out.println(2);
			
			
		}

	}

}
