package problems_20_29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by alex on 8/23/16.
 */

//A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
//
//        A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
//
//        As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
//
//        Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

public class Problem23 {
    // >28123  can be written as a sum of abundant numbers

    public static HashMap<Integer, Integer> divisorSums = new HashMap<Integer, Integer>();

    public static void main(String[] args){
        ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();

        for(int i = 1; i <= 28123; i++) {
            int sum = getSum(i);
            if(sum > i)
            {
                abundantNumbers.add(i);
            }
        }

        HashSet<Integer> sumOfAbundantNumbers = new HashSet<Integer>();
        for(int i = 0; i < abundantNumbers.size(); i++)
        {
            for(int j = 0 ; j < abundantNumbers.size(); j++)
            {
                int val1 = abundantNumbers.get(i);
                int val2 = abundantNumbers.get(j);

                sumOfAbundantNumbers.add(val1 + val2);

            }
        }

        int sum = 0;
        for(int i = 0; i <= 28123;i++)
        {
            if(!sumOfAbundantNumbers.contains(i))
            {
                System.out.println(i);
                sum+=i;
            }
        }

        System.out.println(sum);
    }

    private static int getSum(int i) {

        int sum = 0;
        if(divisorSums.containsKey(i))
        {
            return  divisorSums.get(i);
        }else {

            HashSet<Integer> divisors = new HashSet<Integer>();
            divisors.add(1);

            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    divisors.add(k);
                    divisors.add(i / k);
                }
            }
            sum = divisors.stream().mapToInt(Integer::intValue).sum();
            divisorSums.put(i, sum);
            return sum;
        }
    }

}
