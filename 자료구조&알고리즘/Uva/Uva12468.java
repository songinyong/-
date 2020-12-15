package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uva12468 {
 //tmp[0] 은 현재 채널, tmp[1]은 바꿀려는 채널
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str ;
		while(true) {
			int min = 0 ;
			str = in.readLine() ;
			String[] tmp = str.split(" ");
			
			if(Integer.parseInt(tmp[0])== -1 && Integer.parseInt(tmp[1]) == -1) break ;
			else {
			  min = Math.abs(Integer.parseInt(tmp[1])- Integer.parseInt(tmp[0]));
			  
			  if(min > Math.abs(99 - Integer.parseInt(tmp[1])+Integer.parseInt(tmp[0])+1))   // 0에서 아래를 눌렀을때
			  min = Math.abs(99- Integer.parseInt(tmp[1]) +Integer.parseInt(tmp[0])+1) ; 
			  
			  if(min > Math.abs(99-Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1])+1)) // 99에서 위를 눌렀을때
			  min = Math.abs(Integer.parseInt(tmp[1]) +99-Integer.parseInt(tmp[0])+1) ;
			  
			  
			}
			System.out.println(min);
			
			
			
		}

	}

}
