package chapter1;
import java.util.*;
public class Uva10300 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int testCase = sc.nextInt();
	
	for(int i=0; i<testCase; i++) {
		int farmer = sc.nextInt() ;
		int output = 0;
		for(int j=0; j<farmer; j++) {
			int farmyard = sc.nextInt();
			int animals = sc.nextInt();
			int enviorment = sc.nextInt() ;
			output +=(farmyard * enviorment) ;
		}
		System.out.println(output);
	}

	}

}
