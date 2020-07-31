package practice;

public class RepeatIncrement {

    public static void main(String[] args) {
        String s = "aaaeeebbbzzz";
        System.out.println(repeatIncrement(s));
    }

    public static String repeatIncrement(String str){
        char [] arrString = str.toCharArray();
        int len = arrString.length;
        int index = 1;
        int same = 0;
        char before = arrString[0];
        while (index < len){

            char current = arrString[index];
            if (current == before){

                same++;
                arrString[index] = getNextChar(arrString[index], same);

            } else {
                before = arrString[index];
                same=0;
            }

            index++;
        }

        return new String(arrString);
    }

    static char getNextChar(char c, int k){
        return (char)( (c + k - 'a') % ('z' - 'a' + 1) + 'a' );
    }

}
