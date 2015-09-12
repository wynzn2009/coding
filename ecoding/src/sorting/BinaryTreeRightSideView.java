package sorting;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> a = new LinkedList<Integer>();
		if(root==null){
			return a;
		}
		LinkedList<TreeNode> b = new LinkedList<TreeNode>();
		b.push(root);
		while(!b.isEmpty()){
			a.add(b.peek().val);
			LinkedList<TreeNode> c = new LinkedList<TreeNode>();
			while(!b.isEmpty()){
				TreeNode t = b.pop();
				if(t.right!=null){
					c.add(t.right);
				}
				if(t.left!=null){
					c.add(t.left);
				}
			}
			b = c;
		}
        return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
