package chapter1;
import java.util.* ;
public class Uva12372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt() ;
		
		for(int i=1; i<testCase+1; i++) {
			int L = sc.nextInt() ;
			int W = sc.nextInt() ;
			int H = sc.nextInt() ;
			
			if(L<21&& W <21 && H < 21) System.out.println("Case "+i+": good") ;
			else System.out.println("Case "+i+": bad") ;
		}

	}

}
