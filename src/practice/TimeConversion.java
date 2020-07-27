package practice;

public class TimeConversion {


    public static void main(String[] args) {

        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("12:00:00PM"));
    }

    static String timeConversion(String s) {
        String ret;

        if(s.contains("AM")){
            if(s.matches("12:\\d\\d:\\d\\dAM")){
                ret = "00"+s.substring(2, s.length() - 2);
            } else {
                ret = s.substring(0, s.length() - 2);
            }
        } else {
            if(s.matches("12:\\d\\d:\\d\\dPM")){
                ret = "12"+s.substring(2, s.length() - 2);
            } else {
                String hh = s.substring(0, 2);
                int hhInt = Integer.valueOf(hh);
                hhInt = hhInt + 12;

                ret = hhInt + s.substring(2, s.length()-2);
            }
        }

        return ret;
    }

}
