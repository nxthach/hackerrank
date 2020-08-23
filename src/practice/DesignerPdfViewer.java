package practice;

public class DesignerPdfViewer {

    public static void main(String[] args) {
        System.out.println('a'-97);
        System.out.println('b'-97);
    }

    static int designerPdfViewer(int[] h, String word) {
        int charTallest = 0;
        for (int i = 0; i < word.length(); i++) {
            int heightChar = h[word.charAt(i)-'a'];
            if(heightChar > charTallest){
                charTallest = heightChar;
            }
        }

        return charTallest*word.length();
    }

}
