package problems_10_19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by alex on 8/21/16.
 */
public class Problem18 {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str="";

        ArrayList<Long> row = new ArrayList<Long>();
        ArrayList<Long> newRow = new ArrayList<Long>();

        while((str = br.readLine()) != null)
        {
            if(str.equals(""))
            {
                break;
            }
            String[] arr = str.split(" ");

            if(arr.length == 1)
            {
                Long nodeVal = Long.valueOf(arr[0]);
                row.add(nodeVal);
            }else{
                newRow = new ArrayList<Long>();
                for(int i = 0; i < arr.length; i++)
                {
                    Long currRowVal = Long.valueOf(arr[i]);
                    if(i == 0){
                        currRowVal += row.get(i);
                    }else if(i == arr.length-1){
                        currRowVal += row.get(i-1);
                    }else
                    {
                        if(row.get(i) > row.get(i-1))
                        {
                            currRowVal += row.get(i);
                        }else
                        {
                            currRowVal += row.get(i-1);
                        }
                    }
                    newRow.add(currRowVal);
                }
                row = (ArrayList<Long>) newRow.clone();
            }
        }

        System.out.println(Collections.max(row));
        System.out.println(row.toString());
    }

}
