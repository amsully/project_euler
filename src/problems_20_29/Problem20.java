package problems_20_29;

import java.math.BigInteger;

/**
 * Created by alex on 8/22/16.
 */
public class Problem20 {
    public static void main(String[] args)
    {
        BigInteger val = new BigInteger("100");

        for(int i = 100; i > 0; i--)
        {
            val = val.multiply(new BigInteger(String.valueOf(i)));
        }

        String l = val.toString();
        System.out.println(l);

        int sum = 0;
        for(int i = 0; i < l.length(); i++)
        {
            sum += (Character.getNumericValue(l.charAt(i)));
        }
        System.out.println(sum);
    }
}
