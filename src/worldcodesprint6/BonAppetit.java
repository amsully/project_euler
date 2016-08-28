package worldcodesprint6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by alex on 8/27/16.
 */
public class BonAppetit {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        int totItems;
        int itemNotAte;
        int charged;

        line = br.readLine();

        String[] split = line.split(" " );

        totItems = Integer.valueOf(split[0]);
        itemNotAte = Integer.valueOf(split[1]);


        int[] items = new int[totItems];
        line = br.readLine();
        split = line.split(" ");
        for(int i = 0; i < split.length; i++)
        {
            items[i] = Integer.valueOf(split[i]);
        }

        line = br.readLine();
        charged = Integer.valueOf(line);


//        System.out.println(totItems +  " " + itemNotAte);
//        System.out.println(Arrays.toString(items));
//        System.out.println(charged);

        int should = 0;;
        for(int i = 0; i < items.length;i++)
        {
            if(i == itemNotAte)
            {
                continue;
            }else
            {
                should += items[i];
            }
        }

        int we = should/2;

        if(we == charged)
        {
            System.out.println("Bon Appetit");
        }else
        {
            System.out.println(charged - we);
        }
    }

}
