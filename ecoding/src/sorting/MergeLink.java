package sorting;

public class MergeLink {
	private ListNode merge(ListNode a,ListNode b){
		ListNode helper = new ListNode(0);
		helper.next = a;
		ListNode pre = helper;
		while(a!=null&&b!=null){
			if(a.val<b.val){
				a = a.next;
			}else{
				ListNode next = b.next;
				b.next = pre.next;
				pre.next = b;
				b = next;
			}
			pre = pre.next;
		}
		if(b!=null){
			pre.next = b;
		}
		return helper.next;
	}
	
	public ListNode sort(ListNode head){
		if(head==null||head.next==null){
			return head;
		}
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next!=null&&fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode head2 = slow.next;
		slow.next = null;
		ListNode head1 = head;
		head1 = this.sort(head1);
		head2 = this.sort(head2);
		return this.merge(head1, head2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
