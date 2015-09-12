package sorting;

public class KthSmallestElementInABST {
	private int count = 0;
	private int re = 0;
	public int kthSmallest(TreeNode root, int k) {
        p(root,k);
        return re;
    }
	private void p(TreeNode root,int k){
		if(root.left!=null){
			p(root.left,k);
		}
		count++;
		if(count == k){
			re = root.val;
			return;
		}
		if(root.right!=null){
			p(root.right,k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
