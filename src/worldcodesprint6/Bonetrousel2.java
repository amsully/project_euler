package worldcodesprint6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Bonetrousel2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine());

        for (int tt = 0; tt < t; tt++) {
            String[] in = br.readLine().split(" ");

            long n = Long.valueOf(in[0]);
            long k = Long.valueOf(in[1]);
            long b = Long.valueOf(in[2]);

            long sum = 0;

            long partition = n/b;
            long remainder = n%b;

//            ArrayList<Long> solution = new ArrayList<Long>();
//            HashSet<Long> vals = new HashSet<Long>();

            ConcurrentHashMap<Long, Integer> map = new ConcurrentHashMap<Long, Integer>();
            map.put(partition, 0);

            if(partition > n || partition > k || partition < 1){
                System.out.println("-1");
                continue;
            }


            for(int i = 0; i < b; i++)
            {
                sum+= partition;
                map.put(partition, map.get(partition)+1);
            }

            boolean possible = true;

            while(remainder != 0)
            {
                long res = remainder + partition;
                if(res > k){

                    if(remainder == res -k){
                        possible = true;
                        break;
                    }else {
                        remainder = res - k;
                    }
                    res = k;
                    k--;
                    map.put(partition, map.get(partition)-1);
                    map.put(res, 1);
                }else{
                    remainder = 0;
                    map.put(partition, map.get(partition) - 1);
                    map.put(res, 1);
                }
            }

            if(!possible){
                System.out.println("-1");
                continue;
            }
//            ArrayList<Long> val = new ArrayList<Long>();

            for(Map.Entry<Long, Integer> e : map.entrySet())
            {
                long curr = e.getKey();
                long amt = e.getValue();

                long over = curr;
                long under = curr;
                while(amt  > 1)
                {
                    over = (over+1);
                    under = (under-1);

                    // If we have looped through all possible options.
                    if(over > k || under < 1)
                    {
                        possible = false;
                        break;
                    }else if(!map.containsKey(over) && !map.containsKey(under)){
                        amt = amt-2;
                        map.put(curr, map.get(curr)-2);
                        map.put(over, 1);
                        map.put(under, 1);
//                        val.add(over);
//                        val.add(under);
                    }
                }

                if(!possible)
                    break;
            }

            if(!possible)
            {
                System.out.println("-1");
            }else {
                // PRINT RESULT.
                StringBuilder bldr = new StringBuilder();
                int index = 0;
                for(Map.Entry<Long, Integer> e: map.entrySet())
                {
                    if(e.getValue() == 0) continue;
                    if(index == map.size()-1){
                        bldr.append(e.getKey());
                    }else {
                        bldr.append(e.getKey()).append(" " );
                    }
                    index++;
                }
                if(bldr.length() == 0){
                    System.out.println("-1");
                }else{
                    System.out.println(bldr.toString().trim());
                }            }
        }
    }

}
