package chapter1;
import java.util.*;
public class Uva10963 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			boolean output = true ;
			int blocks = sc.nextInt() ;
			int north = sc.nextInt() ;
			int south = sc.nextInt() ;
			int gap = north - south;
			for(int j=1; j<blocks; j++) {
				north = sc.nextInt() ;
				south = sc.nextInt() ;
				if(north-south != gap) output = false ;
			}
			
			
			if(output) System.out.println("yes");
			else System.out.println("no");
			if(i<testCase-1 )System.out.println();
			}
			
		}

	}


