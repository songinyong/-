package chapter1;
import java.io.FileNotFoundException;
import java.util.*;
public class Uva10114 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in) ;
		
		while(true) {
			int month = sc.nextInt() ; 
			if(month < 0) break ;
			double downPayment = sc.nextDouble() ; 
			double debt = sc.nextDouble() ; 
			
			int changeCount = sc.nextInt(); 
			int countMonth = 0 ; 
			double carValue = debt + downPayment; 
			
			double installment = debt/month ; 
			
			
			while(true) {
				 
				int counting = 0 ; 
				int[] depMonth = new int[changeCount+1]; 
				double[] depPercentage = new double[changeCount]; 
				
				for(int i=0; i<changeCount; i++) { 
					depMonth[i] = sc.nextInt();
					depPercentage[i] = sc.nextDouble(); 
				}
				 depMonth[changeCount] = month ;
				 carValue = carValue - carValue*depPercentage[counting] ;
				while(true) {
					
					for(int i=1; i<depMonth[counting+1]-depMonth[counting]; i++) {
						carValue = carValue - carValue*depPercentage[counting] ;
						debt -= installment ;
						 countMonth++ ;
						if(debt <carValue) break ;
						}
						counting++ ;
					
					if(debt <carValue) break ;
				}
				
			
			
			if(countMonth <2 ) System.out.println("1 month");
			else System.out.println(countMonth+" months");
			if(debt <carValue) break ;
			
		}

	}

	}}
