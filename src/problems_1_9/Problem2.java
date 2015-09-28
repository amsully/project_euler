package problems_1_9;
import java.util.*;


public class Problem2 {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		String answer = "";
		for(int trial = 0; trial < trials; trial++)
		{
			int cap = scan.nextInt();
			
			int previousNumber = 0;
			int fibonacciNumber = 1;
			int total = 0;
			while( fibonacciNumber < cap )
			{
//				System.out.println(fibonacciNumber);
				
				if(fibonacciNumber%2 == 0)
				{
					total += fibonacciNumber;
				}
				
				int temp = previousNumber;
				previousNumber = fibonacciNumber;

				fibonacciNumber = temp + fibonacciNumber;

			}
			answer += total + "\n";		
		}
		System.out.println(answer);
		scan.close();
	}
	
}

