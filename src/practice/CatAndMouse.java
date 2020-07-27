package practice;

public class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
        int diffCat1ToMouse = Math.abs(x-z);
        int diffCat2ToMouse = Math.abs(y-z);

        if (diffCat1ToMouse == diffCat2ToMouse){
            return "Mouse C";
        } else if(diffCat1ToMouse > diffCat2ToMouse) {
            return "Cat B";
        }

        return "Cat A";
    }

    public static void main(String[] args) {
        System.out.println(Math.abs(3-7));
    }
}
