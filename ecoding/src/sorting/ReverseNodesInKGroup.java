package sorting;

import java.util.LinkedList;

import org.w3c.dom.NodeList;

public class ReverseNodesInKGroup {
	    @SuppressWarnings("unchecked")
		public static ListNode reverseKGroup(ListNode head, int k) {
	    	if(head==null||head.next==null||k<2){
	    		return head;
	    	}
	        LinkedList<ListNode> l = new LinkedList<ListNode>();
	        int count = 0;
	        ListNode pre = new ListNode(0);
	        ListNode temp = pre;
	        while(head!=null){
	        	if(count++<k){
	        		ListNode t = new ListNode(head.val);
	        		l.push(t);
	        		head = head.next;
	        	}
	        	if(count>=k){
	        		count = 0;
	        		while(!l.isEmpty()){
	        			temp.next = l.pop();
	        			temp = temp.next;
	        		}
	        	}
	        }
	        while(!l.isEmpty()){
        		temp.next = l.pollLast();
        		temp = temp.next;
        	}
	        return pre.next;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode b = new ListNode(0);
		ListNode a = b;
		for(int t=1;t<2;t++){
			b.next = new ListNode(t);
			b = b.next;
		}
		ListNode c = ReverseNodesInKGroup.reverseKGroup(a, 3);
	}

}
