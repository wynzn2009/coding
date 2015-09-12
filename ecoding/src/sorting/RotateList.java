package sorting;

import java.util.ArrayList;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if(head==null||k==0){
			return head;
		}
		int count = 0;
        ArrayList<ListNode> l = new ArrayList<ListNode>();
        ListNode h = head;
        while(h!=null){
        	l.add(h);
        	h = h.next;
        	count++;
        }
        k = k%count;
        if(k==0){
        	return head;
        }
        ListNode r = (ListNode) l.get(count-k);
        ListNode rr = (ListNode) l.get(count-k-1);
        rr.next = null;
        l.get(count-1).next = head;
        return r;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
