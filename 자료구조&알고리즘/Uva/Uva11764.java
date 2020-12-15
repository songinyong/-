package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Uva11764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String testCase =br.readLine();
		 for(int i=0; i<Integer.parseInt(testCase); i++) {
			 int HJump = 0, LJump =0;
			 int NW[] = new int[Integer.parseInt(br.readLine())]; // Number of Walls
			 StringTokenizer st=new StringTokenizer(br.readLine());
			 for(int j=0; j<NW.length; j++) {
				 NW[j]= Integer.parseInt(st.nextToken());
			 }
			 
			 for(int j=1; j<NW.length; j++) {
				 if(NW[j] > NW[j-1]) HJump++ ;
				 else if(NW[j] < NW[j-1]) LJump++;
				 else ;
			 }
			 
			 System.out.printf("Case %d: %d %d\n",i+1,HJump,LJump);
		 }
		 
		
	}

}
