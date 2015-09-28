package problems_1_9;
import java.math.*;
import java.util.*;


public class Problem3 {
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		String answer = "";
		for(int trial = 0; trial < trials; trial++)
		{
			String n = scan.next();
			BigInteger nB = new BigInteger(n);
	//		long n = 600851475143;
	//		long n = 13195; 
			BigInteger startIndex = nB.pow(1/2);
			for(BigInteger i = startIndex; i.compareTo(BigInteger.ZERO) == 1; i.subtract(BigInteger.ONE))
			{
				if(isPrime(i) )
				{
					if(nB.mod(i) == BigInteger.ZERO)
					{

						answer += i + "\n";
						break;

					}
				}
			}
			

		}
		System.out.println(answer);
		
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
	
	// WORKING IS PRIME
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
