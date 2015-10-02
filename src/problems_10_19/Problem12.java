package problems_10_19;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Problem12 {

// 76576500
	
	public static void main(String[] args)
	{
		
		long start = System.nanoTime();
			
		int divisors = 1;
		Integer naturalNumber = 1;
		Integer track = 2;
		while( divisors <= 500 )
		{
			divisors = 1;
			HashMap<Integer, Integer> map = (primeFactorizationMap(naturalNumber));
	
			Collection<Integer> values = map.values();
			
			for(Integer value : values)
			{
				divisors *= (value+1);
			}
			if(divisors >= 500)
			{
				System.out.println(naturalNumber + " " + divisors);
			}
			
			System.out.println(naturalNumber);
			naturalNumber = naturalNumber + track;
			track++;
		}
//		long stop = System.nanoTime();
//		System.out.println(TimeUnit.NANOSECONDS.toMillis(stop - start));
//		System.out.println(track);
		System.out.println(naturalNumber);
		System.out.println(naturalNumber - track);

	}
	
	public static HashMap<Integer,Integer> divisors(int triangle, HashMap<Integer,Integer> map)
	{
		
		for(int i = triangle; i > 0; i-- )
		{
			if(triangle%i == 0)
			{
				if(map.containsKey(i))
				{
					map.put(i, map.get(i)+1);
				}
				else
				{
					map.put(i, 1);	
				}
				
			}
		}
		
		return map;
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
	
	public static ArrayList<Integer> primeFactorization(Integer num)
	{
		ArrayList<Integer> map = new ArrayList<Integer>();
		
		if(num == 1) {
			
			map.add(1);
			return map;
		}
		
		for(int i = (num/2); i >= 1 ; i--)
		{
			if(num%i == 0)
			{
				Integer factorOne = i;
				Integer factorTwo = num/i;
				if( isPrimeClassic(factorOne))
				{
					map.add(factorOne);
				}else
				{
					map.addAll(primeFactorization(factorOne));
				}
				if( isPrimeClassic(factorTwo))
				{
					map.add(factorTwo);
				}else
				{
					map.addAll(primeFactorization(factorTwo));
				}
				return map;
			}
		}
		
		return map;
		
	}
	
	public static HashMap<Integer,Integer> primeFactorizationMap(Integer num)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		if(num == 1) {
			
			map.put(1,1);
			return map;
		}
		
//		for(int i = 2; i <= num/2 ; i++)
		for(int i = num/2; i > 0 ; i--)
		{
			if(num%i == 0)
			{
				if( isPrimeClassic(i))
				{
					addNewPrime(map, i);
				}
				else
				{
					map = putAllIncrement(map, primeFactorizationMap(i));
				}
				if( isPrimeClassic(num/i))
				{
					addNewPrime(map, num/i);
				}
				else
				{
					map = putAllIncrement(map, primeFactorizationMap(num/i));
				}
				return map;
			}
		}
		
		return map;
		
	}
	
	public static HashMap<Integer,Integer> putAllIncrement(HashMap<Integer,Integer> original, HashMap<Integer,Integer> add)
	{

		Collection<Integer> newKeys = add.keySet();		
//		System.out.println(newKeys);
//		System.out.println(original);
		for(Integer value : newKeys)
		{
			if(original.containsKey(value))
				original.put(value, original.get(value) + add.get(value));
			else
				original.put(value, 1);
				
		}
		return original;
	}
	
	public static void addNewPrime(HashMap<Integer,Integer> map, Integer prime)
	{
		if(map.containsKey(prime))
		{
			map.put(prime, map.get(prime)+1);
		}else{
			map.put(prime,1);
		}		
	}
	
	

	
}
