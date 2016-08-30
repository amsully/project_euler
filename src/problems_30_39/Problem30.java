package problems_30_39;

/**
 * Created by alex on 8/29/16.
 */

public class Problem30 {
    public static void main(String[] args){

        int power = 5;
        double[] vals = new double[10];

        for(int i = 0; i < 10; i++){
            vals[i] = Math.pow(i, power);
        }

        double totSum = 0;
        for(int i = 2; i < 9999999; i++){
            double temp = i;
            double sum = 0;
            while(temp > 0){
                double dig = temp%10;
                sum+=vals[(int)dig];
                temp /= 10;
            }
            if(sum == (long)i){
                System.out.println(i);
                totSum+=sum;
            }
        }

        System.out.println(totSum);

    }
}
