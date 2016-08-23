package problems_10_19;

/**
 * Created by alex on 8/22/16.
 */

//You are given the following information, but you may prefer to do some research for yourself.
//
//        1 Jan 1900 was a Monday.
//        Thirty days has September,
//        April, June and November.
//        All the rest have thirty-one,
//        Saving February alone,
//        Which has twenty-eight, rain or shine.
//        And on leap years, twenty-nine.
//        A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
//        How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?



public class Problem19 {
    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};



    public static void main(String[] args) {
        int startingYear = 1900;
        int day = 0;
        int dayOfWeek = 0;
        int month = 0;
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sundayCount = 0;

        while(startingYear< 2001)
        {
            if(startingYear%4 == 0)
            {
                monthDays[1] = 29;
            }else
            {
                monthDays[1] = 28;
            }

            while(month < 12)
            {

                if(dayOfWeek == 6 && startingYear > 1900)
                {
                    sundayCount += 1;
                }

                while(day < monthDays[month])
                {
                    dayOfWeek = (dayOfWeek+1)%7;
                    day++;
                }

                day = 0;
                month++;
            }
            month = 0;
            startingYear++;
        }
        System.out.println(sundayCount);

    }

}
