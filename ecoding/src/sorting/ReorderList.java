package sorting;

import java.util.LinkedList;

public class ReorderList {
	public static void reorderList(ListNode head) {
		if(head==null||head.next==null){
			return;
		}
        ListNode f = head;
        ListNode s = head;
        ListNode temp = head;
        ListNode p = temp;
        while(f!=null&&f.next!=null){
        	f = f.next.next;
        	s = s.next;
        }
        if(f!=null){
        	s = s.next;
        }
        LinkedList<ListNode> l = new LinkedList<ListNode>();
        while(s!=null){
        	l.push(s);
        	s = s.next;
        }
		while(!l.isEmpty()){
			p = temp.next;
			temp.next = l.pop();
			temp = temp.next;
			temp.next = p;
			temp = p;
		}
		temp.next = null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = a;
		for(int i=2;i<3;i++){
			a.next = new ListNode(i);
			a = a.next;
		}
		ReorderList.reorderList(b);
	}

}
