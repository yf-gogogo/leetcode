package leecode;

public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode tmp = l;
        while (l1!=null||l2!=null){
            if(l1==null){
                tmp.next = l2;
                break;
            }
            if(l2==null){
                tmp.next = l1;
                break;
            }
            if(l1.val<l2.val){
                tmp.next = l1;
                l1 = l1.next;
            }else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        return l.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-2);
        ListNode l2 = new ListNode(6);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);
        ListNode l = mergeTwoLists(l1,l2);
        while (l!=null){
            System.out.print(l.val);
            l=l.next;
        }

    }
}
