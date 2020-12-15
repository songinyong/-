package chapter1;
import java.util.*;
public class Uva12403 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt() ;
		int Amount = 0 ;
		String str = sc.nextLine();
		for(int i=0; i<testCase; i++) {
			String[] don = new String[2] ; 
			str = sc.nextLine() ;
			if(str.equals("report"))System.out.println(Amount);
			else {
			don = str.split(" ");
			Amount += Integer.parseInt(don[1]);
			}
		}

	}

}
