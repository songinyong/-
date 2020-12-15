package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Uva12157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int NC[] = new int[N]	;
			int Mile = 0 ;
			int Juice = 0 ;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				
			 NC[j] = Integer.parseInt(st.nextToken());
			if(NC[j] <30) Mile +=1;
			else  Mile += (NC[j]/30)+1;
			
			
			if(NC[j] <60) Juice +=1 ;
			else 
				 Juice += (NC[j]/60) +1; 	 
			 
			 
			 
			} // N for문
			
			if(Mile*10 < Juice*15) System.out.printf("Case %d: Mile %d\n",i+1,Mile*10);
			else if(Mile *10 > Juice*15) System.out.printf("Case %d: Juice %d\n",i+1,Juice*15);
			else System.out.printf("Case %d: Mile Juice %d\n",i+1,Juice*15);
		}
		
	}

}
