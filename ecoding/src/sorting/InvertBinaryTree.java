package sorting;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if(root==null){
        	return null;
        }
        TreeNode t = root.right;
        root.right = root.left;
        root.left = t;
        invertTree(root.right);
        invertTree(root.left);
		return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
