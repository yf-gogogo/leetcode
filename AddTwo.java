package leecode;

public class AddTwo {
    //  Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(6);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(9);
        ListNode out = addTwoNumbers(l1,l2);
        while (out!=null){
            System.out.print(out.val);
            out = out.next;
        }

    }
    public static ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        ListNode out = new ListNode(0);
        /***************/
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        int c1 = 0;
        int c2 = 0;
        while (tmp1!=null){
            c1 ++;
            tmp1 = tmp1.next;
        }
        while (tmp2!=null){
            c2 ++;
            tmp2 = tmp2.next;
        }
        if(c1 < c2){
            ListNode tmp = null;
            tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        /****************/
        ListNode m = l1;
        ListNode n = l2;
        ListNode sumList = out;
        int jinwei = 0;
        while (n != null){
            sumList.val = (m.val + n.val + jinwei)%10;
            jinwei = (m.val + n.val + jinwei)/10;
            m = m.next;
            n = n.next;
            if(m!=null){
                sumList.next = new ListNode(0);
                sumList = sumList.next;
            }
        }
        while (m != null){
            sumList.val = (m.val+jinwei)%10;
            jinwei = (m.val+jinwei)/10;
            m = m.next;
            if(m!=null){
                sumList.next = new ListNode(0);
                sumList = sumList.next;
            }
        }
        if (jinwei!=0){
            sumList.next = new ListNode(0);
            sumList = sumList.next;
            sumList.val = jinwei;

        }
        return out;
    }
}


