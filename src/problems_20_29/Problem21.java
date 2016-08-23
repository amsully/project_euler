package problems_20_29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by alex on 8/22/16.
 */

//Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
//        If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
//
//        For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
//
//        Evaluate the sum of all the amicable numbers under 10000.

public class Problem21 {

    static HashMap<Integer, Integer> divisorSums = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

        HashMap<Integer, ArrayList<Integer>> amicableVals = new HashMap<Integer, ArrayList<Integer>>();

        int total = 0;
        for(int i = 2; i < 10000; i++)
        {

            HashSet<Integer> divisors = new HashSet<Integer>();

            int sum = getSum(i);
            if(divisorSums.containsKey(i))
            {
                sum = divisorSums.get(i);
            }else {
                for (int k = 2; k <= Math.sqrt(i); k++) {
                    if (i % k == 0) {
                        divisors.add(k);
                        divisors.add(i / k);
                    }
                }
                sum = divisors.stream().mapToInt(Integer::intValue).sum();
                divisorSums.put(i, sum);
            }


            HashSet<Integer> divisors2 = new HashSet<Integer>();
            int sum2 = getSum(sum);

            if(sum2 == i && i < sum){
                System.out.println(i + " " + sum);
                total += i;
                total += sum;
            }


        }

        System.out.println(total);

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
