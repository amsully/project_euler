package problems_20_29;

import java.util.HashSet;

/**
 * Created by alex on 8/24/16.
 */

// A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:
//
//        1/2	= 	0.5
//        1/3	= 	0.(3)
//        1/4	= 	0.25
//        1/5	= 	0.2
//        1/6	= 	0.1(6)
//        1/7	= 	0.(142857)
//        1/8	= 	0.125
//        1/9	= 	0.(1)
//        1/10	= 	0.1
//        Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.
//
//        Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.

public class Problem26 {

    public static void main(String[] args)
    {
        int maxRepeatingDecimal = 0;
        int d = -1;
        for(int i = 1; i < 1000; i++)
        {

            int repeatingDecimalLength = calculateLengthOfRepeatingDecimal(i);

            if(repeatingDecimalLength > maxRepeatingDecimal)
            {
                d = i;
                maxRepeatingDecimal = repeatingDecimalLength;
            }
        }

        System.out.println(maxRepeatingDecimal);
        System.out.println(d);
    }

    private static int calculateLengthOfRepeatingDecimal(int i) {

        int numerator = 1;

        HashSet<Integer> previousValues = new HashSet<Integer>();

        int length = 0;

        while(numerator != 0 && !previousValues.contains(numerator)) {
            previousValues.add(numerator);

            while (numerator < i) {
                numerator *= 10;
            }

            int res = numerator / i;
            res = res * i;
            numerator = numerator - res;

            length++;
        }

        if(numerator == 0)
        {
            return 0;
        }else
        {
            return length;
        }
    }


}
