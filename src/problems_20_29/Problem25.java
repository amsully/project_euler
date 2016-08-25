package problems_20_29;

import java.math.BigInteger;

/**
 * Created by alex on 8/23/16.
 */
public class Problem25 {

    public static void main(String args[])
    {
        BigInteger prev = BigInteger.ONE;
        BigInteger prevprev = BigInteger.ONE;

        int index = 2;
        while(prev.toString().length() < 1000)
        {
            index++;
            BigInteger curr = prev.add(prevprev);
            prevprev = prev;
            prev = curr;
        }

        System.out.println(index);
        System.out.println(prev.toString().length());
        System.out.println(prev.toString());
    }

}
