package chapter1;
import java.util.*;
public class Uva00621 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		String str = sc.nextLine();
		for(int i=0; i<testCase; i++) {
			str = sc.nextLine() ;
			String[] check = str.split(""); 
			if(str.equals("1") || str.equals("4") || str.equals("78")) System.out.println("+");
			else if(check[check.length-2].equals("3") && check[check.length-1].equals("5"))System.out.println("-");
			else if(check[0].equals("9") && check[check.length-1].equals("4")) System.out.println("*");
			else System.out.println("?");
		}
	}

}
