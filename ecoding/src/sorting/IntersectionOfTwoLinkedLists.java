package sorting;

import java.util.LinkedList;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        LinkedList a = new LinkedList();
        LinkedList v = new LinkedList();
        while(headA!=null){
        	a.push(headA);
        	headA = headA.next;
        }
        while(headB!=null){
        	v.push(headB);
        	headB = headB.next;
        }
        ListNode re = null;
        while(!a.isEmpty()&&!v.isEmpty()){
        	if(a.peek()==v.peek()){
        		re = (ListNode) a.pop();
        		v.pop();
        	}else{
        		break;
        	}
        }
        return re;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
