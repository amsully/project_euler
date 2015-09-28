package problems_1_9;
import java.util.*;
import java.math.*;
public class Problem1 {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int trials = scan.nextInt();
		String solution = "";
		for(int i = 0; i < trials; i++)
		{
//			long input = scan.nextInt() - 1;
			long input= scan.nextInt() -1 ;

			long nThree = input/3;
			long a1 = 3;
			long aN = 3*nThree;
			double three = ((double)nThree/2.0)*(a1 + aN);
			
			long nFive = input/5;
			long b1 = 5;
			long bN = 5*nFive;
			double five = ((double)nFive/2.0) * (b1 + bN);
			
			long nFifteen = input/15 ;
			long c1 = 15;
			long cN = 15*nFifteen;
			double fifteen = ((double)nFifteen/2.0)*(c1 + cN);
			
//			System.out.println(three);
//			System.out.println(five);
//			System.out.println(fifteen);
			
//			double total = three + five - fifteen;
						
			int total = (int)three + (int)five - (int)fifteen;
			
			solution +=  total + "\n";
		}
		System.out.println(solution);

		scan.close();
	}

	
}
