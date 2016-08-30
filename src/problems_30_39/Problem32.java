package problems_30_39;

import java.util.HashSet;

/**
 * Created by alex on 8/29/16.
 */

//We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.
//
//        The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.
//
//        Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
//
//        HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.

public class Problem32 {
//    132456789

    public static void main(String[] args){
        /*
        10 100 1000
         */
        HashSet<Integer> addedVals = new HashSet<Integer>();
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            for(int j = 1; j < 10000; j++){
                int k = i *j;
                HashSet<String> vals = new HashSet<String>();
                String result = i + "" + j + "" + k;

                if(result.length() != 9){
                    continue;
                }else {
                    boolean seenBefore = false;
                    for (int m = 0; m < result.length(); m++) {

                        if(vals.contains(result.charAt(m)+"") || result.charAt(m) == '0'){
                            seenBefore = true;
                            break;
                        }
                        vals.add(result.charAt(m) +"");
                    }

                    if(!seenBefore && vals.size() == 9 ){
                        System.out.println(i + "*" + j + "=" + k);

                        if(!addedVals.contains(k)) {
                            addedVals.add(k);
                            sum += k;
                        }
                    }
                }


            }
        }
        System.out.println(sum);
    }

}