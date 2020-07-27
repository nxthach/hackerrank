package practice;

public class PageCount {

    public static void main(String[] args) {
        //System.out.println(pageCount(6,2));
        //System.out.println(pageCount(6,5));


        System.out.println(pageCount(10,7));
//        System.out.println(pageCount(6,4));
//        System.out.println(pageCount(15600,1560));
//        System.out.println(pageCount(83246 ,78132));
    }

    static int pageCount(int n, int p) {

        int mid = n/2;
        int nturn;

        if(p <= mid){
            int distance = p-1;

            if(distance % 2 == 0){
                nturn = distance/2;
            } else {
                nturn = distance/2 + 1;
            }

        }else {
            int distance = n - p;

            if (n % 2 == 0) {
                if (distance % 2 == 0) {
                    nturn = distance / 2;
                } else {
                    nturn = distance / 2 + 1;
                }

            } else {
                nturn = distance / 2;
            }
        }

        return nturn;
    }

    static int pageCount2(int n, int p) {

       return Math.min(p / 2, n/2 - p/2);
    }

}
