package chapter1;
import java.util.*;
public class Uva11559 {
// file�� �ҷ��� �о�� �Ǳ� ������ ��ĳ�ʷ� Ǯ �� ���� 
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
