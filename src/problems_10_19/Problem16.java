package problems_10_19;

import java.math.BigInteger;

/**
 * Created by alex on 8/21/16.
 */
public class Problem16 {

    public static void main(String[] args)
    {
        BigInteger two= BigInteger.valueOf(2);
//        BigInteger thousand = BigInteger.valueOf(1000);

        BigInteger result = two.pow(1000);

        String str = result.toString();
        System.out.println("Result: " + str);

        int sum = 0;
        for(int i = 0 ; i < str.length(); i++)
        {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);

    }

}
