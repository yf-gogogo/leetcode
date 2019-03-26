package leecode;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;
        ListNode tmp = head;
        ListNode start = null;
        ListNode last = null;
        int len = 0;
        while (tmp!=null){
            if(tmp.next==null)last=tmp;
            tmp = tmp.next;
            len++;

        }
        int rmove = k%len;
        ListNode tmp1 = head;
        for (int i = 1; i <= len-rmove; i++) {
            if(i==len-rmove){
                start = head.next;
                break;
            }
            head = head.next;
        }
        head = null;
        last.next = tmp1;
        return start;
    }
    public static ListNode rotateRight1(ListNode head, int k) {
        if(head==null||head.next==null||k==0)return head;
        ListNode tmp = head;
        ListNode start = null;
        ListNode last = null;
        List<ListNode> listNodes = new ArrayList<>();
        int len = 0;
        while (tmp!=null){
            ListNode node = tmp;
            listNodes.add(node);
            tmp = tmp.next;
        }
        len = listNodes.size();
        int rmove = k%listNodes.size();
        if(rmove==0)return head;
        tmp = listNodes.get(len-rmove-1);
        tmp.next = null;
        start = listNodes.get(len-rmove);
        last = listNodes.get(len-1);
        last.next = listNodes.get(0);
        return start;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h = head;
        for (int i = 2; i < 6; i++) {
            h.next = new ListNode(i);
            h = h.next;
        }
        h = rotateRight1(head,1);
        for (int i = 1; i < 6; i++) {
            System.out.println(h.val);
            h = h.next;
        }
    }
}
