package sorting;

public class BinaryTreeMaximumPathSum {
	public int maxPathSum(TreeNode root) {
		int[] max = {Integer.MIN_VALUE};
        help(root,max);
        return max[0];
    }
	private int help(TreeNode root,int[] max){
		if(root==null){
			return 0;
		}
		int left = help(root.left,max);
		int right = help(root.right,max);
		int c = Math.max(root.val, Math.max(root.val+left,root.val+right));
		max[0] = Math.max(max[0],Math.max(c, left + root.val + right));
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
