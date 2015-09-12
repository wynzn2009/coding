package sorting;

public class LowestCommonAncestorOfABinaryTree {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null){
			return null;
		}
		if(root==p||root==q){
			return root;
		}
		TreeNode l = lowestCommonAncestor(root.left,p,q);
		TreeNode r = lowestCommonAncestor(root.right,p,q);
		if(l!=null&&r!=null){
			return root;
		}
		if(l!=null){
			return l;
		}else{
			return r;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, root.left, root.right);
	}

}
