package practice;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeSortedLists {

    public static ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the merging process
        ListNode init = new ListNode(0);
        ListNode pointer = init;


        while (l1 != null && l2 != null) {

            //current = current.next;
        }



        // Return the next node of the dummy node
        return init.next;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the merging process
        ListNode init = new ListNode(0);
        ListNode pointer = init;


        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pointer.next = l1; //store next = l1

                pointer = pointer.next; //move pointer to next
                l1 = l1.next; // new l1 is next

            } else {
                pointer.next = l2; //store next = l1

                pointer = pointer.next; //move pointer to next
                l2 = l2.next; // new l1 is next
            }

            //current = current.next;
        }

        if (l1 != null) {
            pointer.next = l1;
        } else if (l2 != null) {
            pointer.next = l2;
        }

        // Return the next node of the dummy node
        return init.next;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the merging process
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Iterate through both lists until one is exhausted
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes of l1 or l2
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }

        // Return the next node of the dummy node
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(l1, l2);
        printList(mergedList); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    }

    public static void printList(ListNode head) {
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
}

