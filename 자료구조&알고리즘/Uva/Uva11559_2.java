package chapter1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// uva 문제를 풀때 bufferLeadr를 써야할때와 스캐너를 쓸 수 있을때를 구분할것!
public class Uva11559_2 {

	public static void main(String args[] ) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = in.readLine();
            if(str==null || str.isEmpty()) break;
            String[] temp = str.split(" ");
            int no_of_par = Integer.parseInt(temp[0]);
            int bud = Integer.parseInt(temp[1]);
            int hotels =Integer.parseInt(temp[2]);
            int weeks = Integer.parseInt(temp[3]);
            int[] result = new int[hotels];
            int count = 0;
            for(int i=0;i<hotels;i++)
                  {
                    int price_for_one = Integer.parseInt(in.readLine());
                    String[] beds = in.readLine().split(" ");
                    boolean valid = false;
                    for(int j=0;j<weeks;j++)
                        {
                            if (Integer.parseInt(beds[j]) >= no_of_par )
                                {
                                    if(no_of_par * price_for_one <= bud)
                                    {
                                       result[count] = no_of_par * price_for_one;
                                        count++;
                                       break;
                                    }
                                }
                        }
                  }
            int res =result[0];
            if (count > 0)  {
               for(int i=0;i<count;i++)
                  res = Math.min(res,result[i]);
               System.out.println(res);
            }
            else
                System.out.println("stay home");
            }
        }
}