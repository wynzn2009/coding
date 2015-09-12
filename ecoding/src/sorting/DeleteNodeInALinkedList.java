package sorting;

public class DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {
		if(node==null){
			return;
		}
		ListNode d = node;
        while(node.next!=null){
        	node.val = node.next.val;
        	d = node;
        	node = node.next;
        }
        d.next = null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
