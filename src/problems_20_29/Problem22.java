package problems_20_29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URL;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by alex on 8/22/16.
 */
public class Problem22 {
    public static void main(String[] args) throws Exception
    {
        File file = new File(("/home/alex/IdeaProjects/project_euler/src/problems_20_29/p022_names.txt"));
        BufferedReader br = new BufferedReader(new FileReader( file ) );

        String names = br.readLine();

        String[] arr = names.replace("\"","").split(",");

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        long result= 0;

        for(int i = 0; i < arr.length; i++)
        {
            String curr = arr[i].toUpperCase().replace("\"", "").trim();
            int total = 0;

            for(int j = 0; j < curr.length(); j++)
            {
                total += ((int)curr.charAt(j) - 64); // 'A' ascii is 65.
            }


            System.out.println(i + " "  + curr + " " + ((i+1)*total) + " " + total);

            result += ((i+1) * total);

        }

        System.out.println(result);
    }
}
