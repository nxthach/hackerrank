package practice;

import java.util.List;

public class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalAmount = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (i == k){
                continue;
            }

            totalAmount += bill.get(i);
        }

        int amountGonaShare = totalAmount/2;
        if(amountGonaShare == b){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(Math.abs(b-amountGonaShare));
        }
    }

}
