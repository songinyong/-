package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Uva11942 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		System.out.println("Lumberjacks:");
		for(int i=0; i< Integer.parseInt(N); i++ ) {
			boolean desc = true ;
			boolean asc = true ;
			int Lumber[] = new int[10];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j <Lumber.length; j++) {
				Lumber[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=0; j <Lumber.length-1; j++) {
				if(Lumber[j+1] > Lumber[j]) desc = false ;
				
				if(Lumber[j+1] < Lumber[j]) asc = false ;
			}
			
			if(asc == false && desc == false) System.out.println("Unordered");
			else System.out.println("Ordered");
		}
	}

}
