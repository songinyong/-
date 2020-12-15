package chapter1;
import java.util.*;
public class Uva11559 {
// file을 불러와 읽어야 되기 때문에 스캐너로 풀 수 없음 
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			
			int B = sc.nextInt();
			int H = sc.nextInt();
			int W = sc.nextInt();
			int find = B ;
			for(int i=0; i<H; i++) {
				int Hp = sc.nextInt();
				for(int j=0; j<W; j++) {
					int Ab = sc.nextInt();
					if(N<=Ab) {
						if(B > Hp*N && find > Hp*N) find = Hp*N ;};				
				}
			}
			if(find != B) System.out.println(find);
			else System.out.println("stay home");
		}

		
		
	}

}
