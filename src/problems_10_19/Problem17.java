package problems_10_19;

/**
 * Created by alex on 8/21/16.
 */
public class Problem17 {
    /*
    one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen,
    seventeen, eighteen, nineteen.
    twenty ....
    thirty ....
    forty
    ...
    ninety
    one hundred ...
    ...
    nine hundred
    one thousand
    ...
    nine thousand

    [0-19]
    [20-99]
    [1-9] + ([0-19]+[20-99])*9
    [1-9] + ([1-9] + ([0-19]+[20-99])*9)

     */
    public static void main(String[] args) {
        String oneNine = "onetwothreefourfivesixseveneightnine";
        String tenNineteen = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen";
        String ty = "twentythirtyfortyfiftysixtyseventyeightyninety";
        String and = "and";

        int total = 0;

        total += ((oneNine.length() * 9) + tenNineteen.length() + ty.length()*10)*10 +
                ("onehundred".length()*100 + 3*99) +
                ("twohundred".length()*100 + 3*99) +
                ("threehundred".length()*100 + 3*99) +
                ("fourhundred".length()*100 + 3*99) +
                ("fivehundred".length()*100 + 3*99) +
                ("sixhundred".length()*100 + 3*99) +
                ("sevenhundred".length()*100 + 3*99) +
                ("eighthundred".length()*100 + 3*99) +
                ("ninehundred".length()*100 + 3*99) + "onethousand".length();
        System.out.println("new total: " + total);
    }

}
