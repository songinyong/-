package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uva12554 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String song[] = {"Happy", "birthday", "to", "you", "Happy", "birthday", "to", "you", "Happy", "birthday", "to", "Rujia","Happy", "birthday", "to", "you"};
		
		String person[] = new String[Integer.parseInt(in.readLine())];
		int check = person.length;
		int sangCheck = 0 ;
		
		for(int i=0; i<person.length; i++) {
			person[i] = in.readLine() ;
		}
		
		
		while(true) {
			
			if(check > 0) {
			for(int i=0; i<song.length; i++) {
				if(sangCheck == person.length) sangCheck =0;
				System.out.println(person[sangCheck]+": "+song[i]);
				check-- ; sangCheck++ ;
				
			}
			} else break ;
			
		}
	}

}
