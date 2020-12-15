package chapter1;
import java.util.*;
public class Uva12250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine() ;
		int i = 1 ;
		while(str.charAt(0) !='#') {
			System.out.print("Case "+i+": ");
			if(str.equals("HELLO")) System.out.println("ENGLISH");
			else if(str.equals("HOLA")) System.out.println("SPANISH");
			else if(str.equals("HALLO")) System.out.println("GERMAN");
			else if(str.equals("BONJOUR")) System.out.println("FRENCH");
			else if(str.equals("CIAO")) System.out.println("ITALIAN");
			else if(str.equals("ZDRAVSTVUJTE")) System.out.println("RUSSIAN");
			else System.out.println("UNKNOWN");
			i++ ;
			str = sc.nextLine();
			
		}

	}

}
