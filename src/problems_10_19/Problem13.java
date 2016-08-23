package problems_10_19;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Problem13 {
	
	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = new FileReader("/home/alex/IdeaProjects/project_euler/src/Problem13_Numbers.txt");

		
		BufferedReader lineReader = new BufferedReader(fileReader);
		
		int numberOfLines = 100;
		
		BigInteger[] numberString = new BigInteger[numberOfLines];
		
		for(int i = 0; i<numberOfLines; i++)
		{
//			System.out.println(lineReader.readLine());
			numberString[i] = new BigInteger(lineReader.readLine());
			
		}
		
		
		System.out.println(Arrays.deepToString(numberString));
		
		BigInteger bigSum = BigInteger.ZERO;
		
		for(BigInteger num : numberString)
		{
			bigSum = bigSum.add(num);
		}
		
		System.out.println(bigSum + " : " + bigSum.toString().substring(0,10));
		
	}
	
}
