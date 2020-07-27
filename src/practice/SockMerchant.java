package practice;

public class SockMerchant {


    static int sockMerchant(int n, int[] ar) {

        int[] arrHashTable = new int[101];

        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            arrHashTable[ar[i]]++;
        }

        for (int i = 0; i < arrHashTable.length; i++) {
            if(arrHashTable[i] > 1){
                count += arrHashTable[i]/2;
            }
        }

        return count;
    }
}
