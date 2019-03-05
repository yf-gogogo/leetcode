package leecode;

public class AddTwoNumbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode listNode = tmp;
        int carry = 0;
        while(l1!=null||l2!=null){

            int m = l1==null?0:l1.val;
            int n = l2==null?0:l2.val;
            tmp.val = (m+n+carry)%10;
            carry = (m+n+carry)/10;
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
            if(l1!=null||l2!=null||carry>0){
                tmp.next = new ListNode(carry);
                tmp = tmp.next;
            }
        }
        return listNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l1.next = new ListNode(9);
//        l1.next.next = new ListNode(9);
        ListNode l = addTwoNumbers(l1,l2);
        while (l!=null){
            System.out.print(l.val);
            l=l.next;
        }
    }
}
