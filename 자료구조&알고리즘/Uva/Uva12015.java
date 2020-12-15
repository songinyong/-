package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//By gsphanikumar
public class Uva12015 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine()); //testCase
        String str;
        for(int i=0;i<T;i++)
        {
            int max =0;
            StringBuilder output = new StringBuilder();
            for(int j=0;j<10;j++)
            {
               String[] tmp = in.readLine().split(" ");
               if(Integer.parseInt(tmp[1]) > max){
            	   output = new StringBuilder();
                   output = output.append(tmp[0]);
                   max = Integer.parseInt(tmp[1]);
               }
               else if(Integer.parseInt(tmp[1]) == max) {
                   output.append(",");
                   output.append(tmp[0]);
               }
            }
            String[] res = output.toString().split(",");
            System.out.println("Case #"+(i+1)+":");
            for(int z=0;z<res.length;z++)
                System.out.println(res[z]);
        }
	}

}
