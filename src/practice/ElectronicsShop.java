package practice;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int moneySpent = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int moneySpentTmp = keyboards[i] + drives[j];

                if(moneySpentTmp > moneySpent && moneySpentTmp <=b){
                    moneySpent = moneySpentTmp;
                }

            }
        }
        return moneySpent;
    }
}
