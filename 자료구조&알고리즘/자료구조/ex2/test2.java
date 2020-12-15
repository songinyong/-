package ex2;
import java.util.Scanner ;
public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = 0 ;
		int m = 0 ;
		System.out.println("N값을 입력하세요");
		n =  sc.nextInt() ;
		System.out.println("M값을 입력하세요(N값 보다 크면 안됨");
		m =  sc.nextInt() ;
		CList test = new CList();
		Node sd ;
		for(int i=0; i<n; i++) {
			test.insert(n-i);
		}
		
		
		for(int i=0; i<n; i++) {
			sd = test.selectDelete(m);
			System.out.println(sd.getItem()) ;
		}
		
		
	}

}
