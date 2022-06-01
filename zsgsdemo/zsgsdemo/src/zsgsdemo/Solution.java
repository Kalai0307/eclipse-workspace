package zsgsdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

class Result {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result=0;
        int lcm=a.get(0);
        for(Integer Integer:a)
        {
            lcm=getLCM(lcm,Integer);
            
        }
        int gcd=b.get(0);
        for(Integer Integer:b)
        {
            gcd=getGCD(gcd,Integer);
            
        }
        int mul=0;
        while(mul<=gcd)
        {
        	mul=mul+lcm;
        }
        if(gcd % mul==0)
        {
        	result++;
        }
        return result;
    }

	
	}
    

}
public class Solution {

	 
		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		        int n = Integer.parseInt(firstMultipleInput[0]);

		        int m = Integer.parseInt(firstMultipleInput[1]);

		        List<Integer> arr = (List<Integer>) Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
		            .map(Integer::parseInt)
		            .collect(toList());

		        List<Integer> brr = (List<Integer>) Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
		            .map(Integer::parseInt)
		            .collect(toList());

		        int total = Result.getTotalX(arr, brr);

		        bufferedWriter.write(String.valueOf(total));
		        bufferedWriter.newLine();

		        bufferedReader.close();
		        bufferedWriter.close();
		    }

			private static Collector toList() {
				// TODO Auto-generated method stub
				return null;
			}
		}
