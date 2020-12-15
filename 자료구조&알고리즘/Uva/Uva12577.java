package chapter1;
import java.util.*;
public class Uva12577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1 ;
		String str = sc.nextLine();
		while(!str.equals("*")){
			
			if(str.contains("Hajj")) System.out.println("Case "+count+": Hajj-e-Akbar");
			else System.out.println("Case "+count+": Hajj-e-Asghar");
			
			count++ ;
			str = sc.nextLine();
		}
	}

}
