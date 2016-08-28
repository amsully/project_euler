package worldcodesprint6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by alex on 8/27/16.
 */
public class FlippingTheMatrix {

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfMatrix = Integer.valueOf(br.readLine());

        for(int i = 0; i < numberOfMatrix; i++)
        {

            solve(br);
        }


    }

    private static void solve(BufferedReader br) throws Exception{
        int size = Integer.valueOf(br.readLine());

        int matrixSize = size*2;

        int[][] topLeft = new int[size][size];
        int[][] topRight = new int[size][size];
        int[][] botLeft= new int[size][size];
        int[][] botRight = new int[size][size];

        for(int i = 0; i < matrixSize ; i++)
        {
            String rowStr = br.readLine();
            String[] split = rowStr.split(" " );
            int[] row = new int[split.length];
            for(int l = 0; l < split.length; l++)
            {
                row[l] = Integer.valueOf(split[l]);
            }

            // COLS
            for(int j = 0; j < row.length; j++) {

                int[][] currMatrix;

                int ith = i;
                int jth  =j;

                if(i >= (size)  && j >= (size))
                {
                    currMatrix = botRight;
                    ith -= size;
                    jth -= size;
                }else if(i >= (size)  && j < (size))
                {
                    currMatrix = botLeft;
                    ith -= size;
                }else if(i < (size)  && j < (size))
                {
                    currMatrix = topLeft;

                }else if(i < (size)  && j >= (size))
                {
                    currMatrix = topRight;
                    jth -= size;
                }else{
                    System.out.println("You fucked up");
                    currMatrix = new int[1][1];
                }

                currMatrix[ith][jth] = row[j];
            }

        }

//        int[][] finalSum = new int[matrixSize][matrixSize];
        int sum = 0;
        for(int i = 0; i < size;  i++)
        {
            for(int j = 0; j < size; j++)
            {
                int tl = topLeft[i][j];
                int tr = topRight[i][size-1-j];
                int bl = botLeft[size-1- i][j];
                int bright = botRight[size-1-i][size-1-j];

                int val = Math.max(tl, Math.max(tr, Math.max(bl, (bright))));

                sum += val;
            }
        }

        System.out.println(sum);
    }

}
