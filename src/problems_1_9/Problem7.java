package problems_1_9;
import java.math.BigInteger;


public class Problem7 {

	public static void main(String[] args)
	{
		int count = 0;
		BigInteger prime = BigInteger.ZERO;
		while(count != 10001)
		{
			
			
			if(isPrime(prime) && isPrimeClassic(prime))
			{

				count++;
				if(count == 10001)
				{
					System.out.println(count + " " + prime);

				}
			}

			prime = prime.add(BigInteger.ONE);
			
		}
		
	}
	
	// BROKEN IS PRIME
	public static boolean isPrime(BigInteger bigNum) {
		
		long num = bigNum.longValue();
		
        if (num == 2 ) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 3; i * i <= num; i += 6)
            if (num % i == 0 || num %(i + 2) == 0) return false;
        return true;
	}
	
	public static boolean isPrimeClassic(BigInteger bigNum) {
		
		long num = bigNum.longValue();
		
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
