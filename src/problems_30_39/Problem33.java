package problems_30_39;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by alex on 9/5/16.
 */
public class Problem33 {

    public static void main(String[] args){

        for(int i = 1; i < 100; i++){
            for(int j = 1; j < i; j++){
                // j / i

                for(int k = 0; k < (j/2); k++){

                    if(i%k == 0 && j%k == 0){
                        int numerator = j/k;
                        int denominator = i/k;

                        String numStr = String.valueOf(numerator);
                        String denStr = String.valueOf(denominator);


                    }

                }

            }
        }

    }

}
