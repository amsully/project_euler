package problems_20_29;

/**
 * Created by alex on 8/23/16.
 */

//A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
//
//        012   021   102   120   201   210
//  021
//  120
//  210
//        What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

public class Problem24 {

    public static void main(String[] args)
    {

        /*
        The idea was start with the largest permutation above 1 milltion (9! * 2) which is 298765430 .. and subtract the approprate values

         */
    }

}


//298765431 = permutation 725760
//312456789 = permutation 725761
//        <274239
//8! * 6 = 241920
//
//379865421 = permutation 967681
//
//381245679 = permutation 967681
//<32319
//7!* 6 = 30240
//
//387965421 = permutation 997921
//389124567 = permutation 997922
//        <2078
//6! * 2 = 1440
//389276541 = permutation 999362
//389214567 = permutation 999363
//        <637
//5! * 5 = 600
//389276541 = permutation 999963
//389412567 = permutation 999964
//        <36
//4! * 1 = 24
//389412765
//
//
//
//x*10! + y*9! +


