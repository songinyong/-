package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uva12503 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
		int T = Integer.parseInt(in.readLine());
		int count = 0 ;
		while(true) {
			int com = Integer.parseInt(in.readLine());
		    int[] stack = new int[com]; 
			for(int i=0; i<com; i++) {
				String str = in.readLine();
				if(str.equals("LEFT")) stack[i] = -1 ;
				else if(str.equals("RIGHT")) stack[i] = 1;
				else {
					stack[i] = stack[Integer.parseInt(str.substring(8))-1];
				}
			}
			int sum = 0 ;
			for(int i=0; i<com; i++) 
				sum +=stack[i];
			System.out.println(sum);
			
			
			count++;
			if(count > T-1) break ;
		}
	}

}
