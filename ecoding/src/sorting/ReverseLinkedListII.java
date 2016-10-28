/**
 * 
 */
package sorting;

import java.util.Stack;

/**
 * @author wyn
 * 92
 *
 */
public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		Stack<ListNode> s = new Stack<ListNode>();
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode temp = start;
        ListNode b = null;
        ListNode e = null;
        for(int i=0;i<n+1;i++){
            if(i==m-1){
        		b = temp;
        	}
        	if(i<m){
        		temp = temp.next;
        	}
        	
        	if(i>=m){
        		s.push(temp);
        		temp = temp.next;
        		if(i==n){
        			e = temp;
        		}
        	}
        }
		while(!s.isEmpty()){
			b.next = s.pop();
			b = b.next;
		}
		b.next = e;
		return start.next;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
