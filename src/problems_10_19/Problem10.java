package problems_10_19;
import java.math.BigInteger;


public class Problem10 {

	public static void main(String[] args)
	{
		long prime = 2;
		long total = 0;
		
		while(prime < 2000000)
		{
			if(isPrimeClassic(prime))
			{
				System.out.println(prime);
				total += prime;
			}
			prime += 1;
		}
		System.out.println(total);
	}
	
	// WORKING IS PRIME
	public static boolean isPrimeClassic(long bigNum) {
		
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
