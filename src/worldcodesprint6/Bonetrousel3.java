package worldcodesprint6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by alex on 8/28/16.
 */
public class Bonetrousel3 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int trials = Integer.valueOf(br.readLine());
        if(trials > 20 || trials < 1 ){
            System.out.println("-1");
        }else{
            for(int i = 0; i < trials; i++){
                String str[] = br.readLine().split(" " );
                long n = Long.valueOf(str[0]);
                long k = Long.valueOf(str[1]);
                long b = Long.valueOf(str[2]);

                solve(n, k, b);

            }
        }
    }

    private static void solve(long n, long k, long b) {
        ConcurrentHashMap<Long, Long> counts = new ConcurrentHashMap<Long, Long>();

        long partition = n / b;
        long remainder = n % b;
        long diff = b/2;
        boolean possible = true;
        counts.put(partition, b);

        HashSet<Long> set = new HashSet<Long>();

        long under = partition - (diff);
        long over = partition + (diff);

        while(b > 1){
            if(under >= 1 && over <= k && over > under){
                if(!set.contains(over) && !set.contains(under)){
                    set.add(over);
                    set.add(under);
                    b-=2;
                }
            }else{
                possible = false;
                break;
            }
            under++;
            over--;
        }

        if(b == 1) set.add(partition);

        if (!possible) {
            System.out.println("-1");
        } else {
            StringBuilder bldr = new StringBuilder();
            for(Long l : set){
                bldr.append(l).append(" " );
            }
//            for (Map.Entry<Long, Long> e : counts.entrySet()) {
//                if (e.getValue() == 0) continue;
//                bldr.append(e.getKey()).append(" ");
//            }
            if(bldr.length() == 0){
                System.out.println("-1");
            }else{
                System.out.println(bldr.toString().trim());
            }
        }
    }


}
