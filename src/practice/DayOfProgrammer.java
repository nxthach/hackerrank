package practice;

public class DayOfProgrammer {

    static String dayOfProgrammer(int year) {
        String ddmm = "";

        if(year < 1918) {                                                   //Julian check for leap year
            ddmm = year % 4 == 0? "12.09." : "13.09.";

        } else if(year == 1918) {                                           //Special case: transition year
            ddmm = "26.09.";

        } else {                                                            //Gregorian check for leap year
            boolean isLeapYear = (year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0);

            ddmm = isLeapYear ? "12.09." : "13.09.";
        }
        return ddmm + year;
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(2016));
        System.out.println(dayOfProgrammer(2017));
    }

}
