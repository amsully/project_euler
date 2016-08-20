package problems_10_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 8/20/16.
 */

//The following iterative sequence is defined for the set of positive integers:
//
//        n → n/2 (n is even)
//        n → 3n + 1 (n is odd)
//
//        Using the rule above and starting with 13, we generate the following sequence:
//
//        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//        It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//        Which starting number, under one million, produces the longest chain?
//
//        NOTE: Once the chain starts the terms are allowed to go above one million.
public class Problem14 {

    HashMap<Long, Long> mem;
    long longestChainSize;
    long longestChainVal;
    ArrayList<Long> chain;

    public Problem14(){
        mem = new HashMap<Long, Long>();
        longestChainSize = 0;
        longestChainVal = 0;
        chain = new ArrayList<Long>();
    }

    public long solve(int max)
    {
        for(long i = 1; i < max; i++)
        {
            if(!mem.containsKey(i)) {
                solveFor(i);
            }
        }

//        for(Map.Entry<Long, Long> e : mem.entrySet())
//        {
//            System.out.println(e.getKey() + " Chain length: " + e.getValue());
//        }

        System.out.println("Longest chain: " + longestChainSize);
        return longestChainVal;
    }

    private void solveFor(long i) {
        chain.add(i);
        if(i == 1)
        {
            updateMem(1);
            chain.clear();
        }else if(mem.containsKey(i))
        {
            updateMem(mem.get(i));
            chain.clear();
        }else if(i%2 == 0){

            solveFor(i/2);
        }else{
            solveFor((3*i+1));
        }
    }

    private void updateMem(long chainSizeStart)
    {

        for(int i = chain.size()-1; i >= 0; i--)
        {
            mem.put(chain.get(i), chainSizeStart);

            if(chainSizeStart > longestChainSize)
            {
                longestChainSize = chainSizeStart;
                longestChainVal = chain.get(i);
            }

            chainSizeStart++;
        }
    }

    public static void main(String[] args)
    {
        Problem14 prob = new Problem14();
        System.out.println(prob.solve(100000000));
    }
}
