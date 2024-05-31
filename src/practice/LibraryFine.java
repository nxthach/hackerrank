package practice;

public class LibraryFine {
    public static void main(String[] args) {

//        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
//
//        System.out.println(libraryFine(9, 6, 2016, 6, 6, 2015));
//
//        System.out.println(libraryFine(9, 8, 2015, 6, 6, 2015));

        //System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));

        System.out.println(libraryFine(28, 2, 2015, 15, 4, 2015));

    }


    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Book returned before or on the expected date
        if (y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 <= d2)) {
            return 0;
        }

        // Book returned after the expected year
        if (y1 > y2) {
            return 10000;
        }

        // Book returned after the expected month
        if (m1 > m2) { //y1 == y2
            return (m1 - m2) * 500;
        }

        // Book returned after the expected day
        if (d1 > d2) { //y1 == y2, m1==m2
            return (d1 - d2) * 15;
        }

        // Default case (should never reach here)
        return 0;
    }


    public static int libraryFine2(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y1 < y2){
            return 0;
        }

        // after the calendar year in which it was expected
        if (y1 > y2) {
            return 10000;
        }

        if(m1 < m2){
            return 0;
        }

        // after the expected return month but still within the same calendar year
        if (m1 > m2) {
            return (m1 - m2) * 500;
        }

        // after the expected return day but still within the same calendar month

        if (d1 > d2) {
            return (d1 - d2) * 15;
        }

        // before the expected return date,
        return 0;
    }
}
