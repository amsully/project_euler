import java.math.BigInteger;
import java.util.*;

public class Problem12 {

	public static void main(String[] args)
	{
		
		int divisors = 1;
		int n = 0;
		ArrayList<Integer> primeRecurrenceList = new ArrayList<Integer>();

		while(divisors <= 5)
		{
			primeRecurrenceList.clear();
			divisors = 1;
			
			n++;
			
			int i = n;
			while(n != 1)
			{
				if( isPrimeClassic(i) && n%i == 0)
				{

					int divisorTotal = 0;
					while( n%i == 0 )
					{
						divisorTotal++;
						System.out.println(n + " " + i);
						n = n/i;
					}
					
					
					primeRecurrenceList.add(divisorTotal);
				}
				else
				{
					i--;
				}
			}
			
			System.out.println(Arrays.toString(primeRecurrenceList.toArray()));
			for(Integer val : primeRecurrenceList)
			{
				
				divisors *= (val+1);
			}
			System.out.println(divisors);
		}
		
		System.out.println( Arrays.toString(primeRecurrenceList.toArray()));
		
		
		
	}
	
	// WORKING IS PRIME
	public static boolean isPrimeClassic(long bigNum) {
		
//		long num = bigNum.longValue();
		long num = bigNum;
		
        if (num == 2 ) return true;
        if (num == 3 ) return true;
        
        if (num%2 == 0) return false;
        if (num%3 == 0) return false;
        
        long i = 5;
        long w = 2;
        while(i*i <= num)
        {
        	if(num%i == 0) return false;
        	
        	i+= w;
        	w = 6-w;
        }
        return true;

	}
	
}
