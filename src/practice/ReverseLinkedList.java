package practice;



public class ReverseLinkedList {

    public static ListNode reverseList(ListNode node) {

        ListNode result = null;
        var curr = node;

        while (curr != null){

            var temp = curr.next; // store temp for next curr

            curr.next = result; //set next curr is previous result

            result = curr; // assign result = curr

            curr = temp; // move to next node
        }

        return  result;

    }
    public static ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode reversedHead = reverseList(head);
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

