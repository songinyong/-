package chapter1;
import java.util.Scanner;
public class Uva11498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t ;
		while((t = sc.nextInt())!= 0) {
			int x = sc.nextInt(), y = sc.nextInt();
			String str ;
			for(int i=0; i<t; i++) {
				int n = sc.nextInt(), v = sc.nextInt() ;
				if(n>x && v>y) str = "NE" ;
				else if(n>x && v<y) str ="SE";
				else if(n<x && v>y) str ="NO";
				else if(n<x && v<y) str = "SO";
				else str = "divisa" ;
				System.out.println(str);
			}
		}
       
		
	}

}
