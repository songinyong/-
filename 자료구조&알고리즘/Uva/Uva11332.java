package chapter1;
import java.util.*;
public class Uva11332 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		while(Integer.parseInt(str) != 0) {
			
			
			System.out.println(recurrence(str));
			
			str = sc.nextLine();
			
			
		}

	}
	
	public static int recurrence(String d) {
		String[] st = d.split("");
		int amount =0 ;
		
		if(st.length <2) return Integer.parseInt(st[0]) ;
		
		for(int i=0; i<st.length; i++) {
			
			amount += Integer.parseInt(st[i]);
		}	
		return recurrence(Integer.toString(amount));
	}

}
