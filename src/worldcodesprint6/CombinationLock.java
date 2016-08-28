package worldcodesprint6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by alex on 8/27/16.
 */
public class CombinationLock {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;

        int[] start = new int[5];
        int[] end = new int[5];

        line = br.readLine();

        String[] startStr = line.split(" " );

        line = br.readLine();

        String[] endStr = line.split(" " );

        for(int i = 0; i < 5 ; i ++)
        {
            start[i] = Integer.valueOf(startStr[i]);
            end[i] = Integer.valueOf(endStr[i]);
        }

        int steps = 0;

        for(int i = 0; i < 5; i++)
        {
            int naive = Math.abs(start[i] - end[i]);
            steps += (naive < (10-naive)) ? naive : 10-naive;

        }
        System.out.println(steps);
    }

}
