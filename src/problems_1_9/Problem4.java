package problems_1_9;
import java.util.*;
import java.math.*;

public class Problem4 {
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 9; i >= 1; i--)
		{
			for(int j = 9; j >= 0; j--)
			{
				for(int k = 9; k >= 0; k--)
				{
					String testInteger = "" + i + j + k + k + j + i;
					BigInteger testValue = new BigInteger(testInteger);
//					System.out.println(testInteger);
					for(int z = 999; z >= 100; z--)
					{						
						String zString = z +"";
						BigInteger zBig = new BigInteger(zString);
						
						int comparison = testValue.divide(zBig).compareTo(BigInteger.TEN.multiply(BigInteger.TEN));
						
						BigInteger maxComparison = new BigInteger("999");
						
						int other = testValue.divide(zBig).compareTo(maxComparison);
						
						if( testValue.mod(zBig) == BigInteger.ZERO 
								&& (comparison == 1 || comparison == 0 ) && other == -1 )
						{
							System.out.println(testValue + " " + zBig + " " +  testValue.divide(zBig) );
						}
					}
  					
//					System.out.println(testInteger);
				}
			}		
		}
		scan.close();
	}
	
	
}
