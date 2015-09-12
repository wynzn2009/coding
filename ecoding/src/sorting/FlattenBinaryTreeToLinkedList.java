package sorting;

public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
		while(root!=null){  
            if(root.left!=null){
                TreeNode pre = root.left;  
                while(pre.right!=null){
                	pre = pre.right;  
                }
                pre.right = root.right;  
                root.right = root.left;  
                root.left = null;  
            }  
            root = root.right;  
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
