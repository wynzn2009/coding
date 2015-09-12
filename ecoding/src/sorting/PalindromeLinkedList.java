package sorting;

public class PalindromeLinkedList {
	public static boolean isPalindrome(ListNode head) {
		if(head==null){
			return true;
		}
		if(head.next==null){
			return true;
		}
        ListNode f = head;
        ListNode s = head;
        
        while(f!=null&&f.next!=null){
        	s = s.next;
        	f = f.next.next;
        }
        ListNode h = new ListNode(s.val);
        while(s.next!=null){
        	ListNode u = new ListNode(s.next.val);
        	s = s.next;
        	u.next = h;
        	h = u;
        }
        while(h!=null&&head!=null){
        	if(h.val==head.val){
        		h = h.next;
        		head = head.next;
        	}else{
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		a.next = new ListNode(0);
		a.next.next = new ListNode(0);
		PalindromeLinkedList.isPalindrome(a);
	}

}
