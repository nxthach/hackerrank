package practice;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {

        int numOfAttendeeStudent = 0;

        for (int i = 0; i < a.length; i++) {
            if(numOfAttendeeStudent == k){
                return "NO";
            }

            if(a[i] <= 0){
                numOfAttendeeStudent++;
            }
        }
        return "YES";
    }

}
