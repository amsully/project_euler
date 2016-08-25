package problems_20_29;

/**
 * Created by alex on 8/24/16.
 */
public class Problem28 {

    public static void main(String[] args)
    {
        int skip = 4;
        int currVal = 9;

        int sum = 25;
        while(skip < 1001)
        {

            if(skip == 1000)
            {
                System.out.println("HI");
            }

            currVal += (skip);
            sum+= currVal;

            currVal += (skip);
            sum+= currVal;

            currVal += (skip);
            sum+= currVal;

            currVal += (skip);
            sum+= currVal;

            skip +=2;
        }
        System.out.println(sum);
    }

}
