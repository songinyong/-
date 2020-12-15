package chapter1;
import java.util.Scanner ;
public class Uva11727 { // 틀렸고 비효율적임 ㅋ

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase,a,b,c, ten ,count;
		testCase = sc.nextInt() ;
		count = testCase +1 ;
		while(testCase>0) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			 if(a>b) {
				 ten = b ; b = a; a= ten ;
			 }
			 if(a>c) {
				 ten = c; c = a; a = ten;
			 }
			 if(b>c) {
				 ten = c ; c = b; b = ten;
			 }
			 System.out.printf("Case %d: %d",count-testCase ,b);
			 testCase--;
			
		}
		

	}

}
