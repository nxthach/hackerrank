package practice;

public class AddTwoNumber {

    public ListNode createLinkedList(int[] arr) {
        var dummy = new ListNode(0);
        var current = dummy;

        for (int num : arr){
            current.next = new ListNode(num);
            current = current.next;
        }


        return dummy.next;
    }

    // Helper function to print linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumber solution = new AddTwoNumber();

        // Example linked lists
        int[] l1Array = {2, 4, 3};
        int[] l2Array = {5, 6, 4};

        ListNode l1 = solution.createLinkedList(l1Array);
        ListNode l2 = solution.createLinkedList(l2Array);

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        printLinkedList(result);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        var a = l1;
        var b = l2;

        ListNode sum = new ListNode(0);
        ListNode counter = sum;

        var carry = 0;

        while (a != null || b != null) {

            var aValue = a != null ? a.val : 0;
            var bValue = b != null ? b.val : 0;

            var sValue = carry + aValue + bValue;

            carry = sValue / 10;
            counter.next = new ListNode(sValue % 10);


            // move to next value
            a = (a != null) ? a.next : null;
            b = (b != null) ? b.next : null;

            counter = counter.next;
        }

        if(carry > 0){
            counter.next = new ListNode(carry);
        }

        return sum.next;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() { }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
