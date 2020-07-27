package practice;

public class Kangaroo {

    //        if( (x2-x1) % (v1-v2) == 0){
//            return "NO";
//        }


    public static void main(String[] args) {
        System.out.println(kangaroo(0,5,3,4));

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1 <= v2){
            return "NO";
        }
//        else {
//            while(x2 > x1){
//                x2 = x2 + v2;
//                x1 = x1 + v1;
//
//                if(x1 == x2){
//                    return "YES";
//                }
//            }
//        }

        if( (x2-x1) % (v1-v2) == 0){
            return "YES";
        }

        return "NO";
    }

}
