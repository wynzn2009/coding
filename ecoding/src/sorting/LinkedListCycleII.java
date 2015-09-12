package sorting;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		if(head==null){
			return null;
		}
		ListNode f = head;
		ListNode s = head;
		boolean flag = false;
		while(f!=null&&f.next!=null){
			s = s.next;
			f = f.next.next;
			if(s==f){
				flag = true;
				break;
			}
		}
		if(!flag){
			return null;
		}else{
			ListNode ss = head;
			while(ss!=s){
				ss = ss.next;
				s = s.next;
			}
			return s;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
