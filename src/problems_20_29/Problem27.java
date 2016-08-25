package problems_20_29;

import java.math.BigInteger;
import java.util.HashSet;

/**
 * Created by alex on 8/24/16.
 */



public class Problem27 {

    public static HashSet<Integer> foundPrimes = new HashSet<Integer>();

    public static void main(String[] args)
    {
        int[] primes = {  2,   3,   5,   7,  11,  13,  17,  19,  23,  29,  31,  37,  41,
                43,  47,  53,  59,  61,  67,  71,  73,  79,  83,  89,  97, 101,

                103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167,
                173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239,

                241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313,
                317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397,

                401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467,
                479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569,

                571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643,
                647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733,

                739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823,
                827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911,

                919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997 };


        System.out.println(consecutivePrimesOf(-79, 1601));

        int maxConsecutivePrimes = 0;
        int aMax = 0;
        int bMax = 0;
        for(int a = -999; a < 1000; a++)
        {
            for(int b = -1000; b <= 1000; b++)
            {
                int num = consecutivePrimesOf(a, b);
//                System.out.println(num);
                if(num >  maxConsecutivePrimes)
                {
                    aMax = a;
                    bMax = b;
                    maxConsecutivePrimes = num;
                }

//                num = consecutivePrimesOf(a, -b);
//                if(num >  maxConsecutivePrimes)
//                {
//                    aMax = a;
//                    bMax = b;
//                    maxConsecutivePrimes = num;
//                }
            }
        }

        System.out.println(aMax + " " + bMax + " " + maxConsecutivePrimes);
        System.out.println(aMax * bMax);
    }

    private static int consecutivePrimesOf(int a, int b) {

        int n = 0;
        while( isPrime((n*n) + (a*n) + b) )
        {
            n++;
        }

        return n;
    }

    private static boolean isPrime(int currResult) {
        if(foundPrimes.contains(currResult))
        {
            return true;
        }else
        {
            if(isPrimeClassic(currResult))
            {
                foundPrimes.add(currResult);
                return true;
            }else
            {
                return false;
            }
        }

    }
    // WORKING IS PRIME
    public static boolean isPrimeClassic(int num) {

        num = Math.abs(num);
//        long num = bigNum.longValue();

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
