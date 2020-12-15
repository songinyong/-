package chapter1;
import java.util.*;
public class Uva11727_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt() ;
		
		for(int i=0; i<testCase; i++) {
			int arr[] = new int[3];
			arr[0] = sc.nextInt() ;
			arr[1] = sc.nextInt() ;
			arr[2] = sc.nextInt();
			Arrays.sort(arr) ;
			System.out.println("Case "+(i+1)+": "+arr[1]);
		}

	}

}
