package practice;

public class UtopianTree {


    static int utopianTree(int n) {

        if (n==0){
            return 1;
        }

        if(n%2 == 0) {// summer
            return utopianTree(n-1)+1;
        } else { // spring
            return utopianTree(n-1)*2;
        }


    }
}
