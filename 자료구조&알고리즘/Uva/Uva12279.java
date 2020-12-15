package chapter1;
import java.util.*;
public class Uva12279 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt() ;
	int caseCount = 1 ;
	
	while(n != 0) {
		int a[] = new int[n];
		int count = 0 ;
		for(int i=0; i < n; i++) {
			
			a[i] = sc.nextInt() ;
			if(a[i] ==0) count++ ;
		}
		
		System.out.printf("Case %d: %d\n",caseCount++, n-count*2);
		n = sc.nextInt();
		
	}
	
}
}