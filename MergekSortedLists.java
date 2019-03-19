package leecode;

import java.util.List;
import java.util.stream.Stream;

public class MergekSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode l = new ListNode(0);
        ListNode tmp = l;
        boolean f = false;
        do{
            f = false;
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i]==null)continue;
                if(lists[i].val<min){
                    minIndex = i;
                    min = lists[i].val;
                    tmp.next = lists[i];
                    f = true;
                }
            }
            if(f) {
                tmp = tmp.next;
                lists[minIndex] = lists[minIndex].next;
            }
        }while (f);
        return l.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(-2);
        l3.next = new ListNode(4);
        l3.next.next = new ListNode(9);
        ListNode[] lists = {l1,l2,l3};
        ListNode l = mergeKLists(lists);
        while (l!=null){
            System.out.print(l.val);
            l=l.next;
        }
    }
}
