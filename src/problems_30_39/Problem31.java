package problems_30_39;

/**
 * Created by alex on 8/29/16.
 */
public class Problem31
{
    public static void main(String[] args){

        int tot = 0;
        for(int p1 = 0; p1 <= 200; p1++){
            int valP1 = 1;

            for(int p2 = 0; p2 <= 100; p2++){
                int valP2 = 2;

                for(int p5 = 0; p5 <= 40; p5++ ){
                    int valP5 = 5;

                    for(int p10 = 0; p10 <= 20; p10++){
                        int valp10 = 10;

                        for(int p20 = 0; p20 <= 10; p20++) {
                            int valP20 = 20;
                            for (int p50 = 0; p50 <= 4; p50++) {
                                int valP50 = 50;

                                for (int e1 = 0; e1 <= 2; e1++) {
                                    int valE1 = 100;

                                    for (int e2 = 0; e2 <= 1; e2++) {

                                        if (200 - (p1 * valP1) - (p2 * valP2) - (p5 * valP5) - (p10 * valp10) - (p20 * valP20) - (p50 * valP50) - (e1 * valE1) - (e2 * 200) == 0){
                                            tot++;
                                        }

                                    }

                                }

                            }
                        }
                    }
                }

            }

            System.out.println("Finished penny: " + p1);
        }
        System.out.println(tot);


    }
}
