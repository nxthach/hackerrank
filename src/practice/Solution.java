package practice;

public class Solution {

    public static void main(String[] args) {
        String a = "Thach";

        System.out.println(a == "Thach");
    }

    static class Customer {

        private String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            String temp = this.name;
            this.name = "xxx";
            return temp;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}



