package problems_20_29;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by alex on 8/28/16.
 */
public class Problem29 {

    public static void main(String[] args) {
        long start = System.nanoTime();

        HashSet<String> set = new HashSet<String>();

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
/*
Results based on number formats. 9183 is the 'sweet spot'. After that rounding errors occur..before that too general.
1 3846
2 8372
3 9089
4 9163
5 9177
6 9183
7 9183
8 9183
9 9183
10 9183
11 9183
12 9183
13 9192
14 9232
15 9240
16 9240
17 9240
18 9240
 */
                DecimalFormat numberFormat = new DecimalFormat("#.00000000000"); // 11
                set.add(numberFormat.format(j * Math.log(i)));
            }
//            System.out.println("Finished: " + i);
        }
        System.out.println(set.size());
        System.out.println("TIME: " + (System.nanoTime()-start)/1000000 + " ms");
    }
}