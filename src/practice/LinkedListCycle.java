package practice;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);


        LinkedListCycle o = new LinkedListCycle();
        System.out.println(o.hasCycle2(head));


    }

    public static boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false; // List with 0 or 1 node has no cycle
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // Fast pointer reached end, no cycle
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true; // Slow and fast pointers meet, cycle exists
    }

    public boolean hasCycle(ListNode head) {

        var curr = head;
        Set<Integer> set = new HashSet<>();
        set.add(head.val);

        while (curr != null){

            var next = curr.next;

            if(next == null){
                return false;
            }

            if(set.contains(next.val)){
                return true;
            }

            set.add(next.val);

            curr = next;

        }

        return false;

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
