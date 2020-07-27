package practice;

public class breakingRecord {

    public static void main(String[] args) {

        System.out.println(Math.sqrt(2.0));

        int[] scores = new int[9];
        scores[0] = 10;
        scores[1] = 5;
        scores[2] = 20;
        scores[3] = 20;
        scores[4] = 4;
        scores[5] = 5;
        scores[6] = 2;
        scores[7] = 25;
        scores[8] = 1;

        int []ret = breakingRecords(scores);
        System.out.print(ret[0]);
        System.out.print(ret[1]);
    }

    static int[] breakingRecords(int[] scores) {
        int brokeBestRecord = 0;
        int brokeWorstRecord = 0;

        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {

            // is broke best
            if(scores[i] > max){
                brokeBestRecord++;
                max = scores[i];
            }

            // is broke worst
            if(scores[i] < min){
                brokeWorstRecord++;
                min = scores[i];
            }
        }

        int[] ret = new int[2];
        ret[0] = brokeBestRecord;
        ret[1] = brokeWorstRecord;

        return ret;
    }

}
