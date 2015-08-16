package sorting;

public class InsertLink {
	public ListNode sort(ListNode head){
		if(head==null){
			return head;
		}
		ListNode helper = new ListNode(0);  
	    ListNode pre = helper;  
	    ListNode cur = head;  
	    while(cur!=null)  
	    {  
	        ListNode next = cur.next;  
	        pre = helper;  
	        while(pre.next!=null && pre.next.val<=cur.val)  
	        {  
	            pre = pre.next;  
	        }  
	        cur.next = pre.next;  
	        pre.next = cur;  
	        cur = next;  
	    }  
	    return helper.next; 
	}
	public ListNode sort1(ListNode head){
		if(null==head) return null;
		ListNode re = new ListNode(0);//result head
		ListNode po = head;
		ListNode cu = re;//result point
		while(po!=null){
			ListNode next = po.next;
			while(cu.next!=null&&cu.next.val<po.val){
				cu = cu.next;
			}
			po.next = cu.next;
			cu.next = po;
			po = next;
			cu = re;
		}
		return re.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
