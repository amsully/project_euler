package worldcodesprint6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by alex on 8/27/16.
 */
public class Bonetrousel {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine());

        for(int i = 0; i < t; i++)
        {
            String[] in = br.readLine().split(" " );

            long n = Integer.valueOf(in[0]);
            long k = Integer.valueOf(in[1]);
            long b = Integer.valueOf(in[2]);

            HashSet<Long> res = solve(n,k,b);

            long sum = 0;
            for(long l : res) sum+=l;

            System.out.println(res);

            if(sum != n)
            {
                System.out.println(-1);
            }else {
                System.out.println(sum);
            }
        }
    }

    private static HashSet<Long> solve(long n, long k, long b) {
        long start = n/b;
        long mod = n%b;
        HashSet<Long> sums = new HashSet<Long>();

        if(mod != 0)
        {
            sums.add(mod);
            b-=1;
        }

        long sum = 0;
        while(n != sum) {
            long enterVal = start - (b / 2);
            long oppVal = start + (b / 2);

            sum += enterVal + oppVal;
            sums.add(enterVal);
            sums.add(oppVal);

            b -= 2;

            if (b < 0) {
                sums.clear();
                sums.add((long) -1);
                return sums;
            }
        }

        System.out.println(sums);
        return sums;
    }

//    def nsum(arr, n, val):
//            if arr is None or len(arr) < n:
//            return []
//
//            # first sort the array by indice, so that we can search sequentially
//    # with early stopping
//            sorted_indice = sorted(xrange(len(arr)), key=lambda i: arr[i])
//    size = len(arr)
//
//    def nsum_recursive(arr, prev_indice, prev_sum, result):
//            ''' This is the main algorithm that is a recursive function.
//    Think about the problem as tree search using depth-first search,
//    Each node/state is determined by (prev_indice, prev_sum), where
//    prev_indice is a list of currently explored indice, whose sum is
//    prev_sum. When len(prev_indice)==n, we reach a leaf node. Then we
//    can check whether the sum equals val.
//        '''
//                # termination condition (leaf nodes)
//        if len(prev_indice) == n:
//            if prev_sum == val:
//            result.append(tuple(sorted_indice[i] for i in prev_indice))
//            else:
//    current_count = len(prev_indice)
//            # depth-first search
//            for idx in range(
//                    0 if not prev_indice else prev_indice[-1]+1,
//                    size-(n-current_count-1)):
//    current_sum = prev_sum + arr[sorted_indice[idx]]
//            # early stopping (pruning of branches)
//                if current_sum>val and idx+1<size and arr[sorted_indice[idx+1]]>=0:
//            break
//    nsum_recursive(arr, prev_indice+[idx],
//                   current_sum, result)
//
//    # start DFS from the root node
//    result = []
//    nsum_recursive(arr, [], 0, result)
//    return result

}
