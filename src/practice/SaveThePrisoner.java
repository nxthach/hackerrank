package practice;

public class SaveThePrisoner {
    static int saveThePrisoner(int prisoners, int sweets, int starts) {

        int lastSweets = sweets % prisoners;

        if (lastSweets == 0){
            return prisoners;
        }
        return starts + lastSweets - 1;
    }

}
