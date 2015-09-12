package sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root==null){
			return list;
		}
		LinkedList<List<Integer>> list1 = new LinkedList<List<Integer>>();
		LinkedList<TreeNode> l = new LinkedList<TreeNode>();
		l.offer(root);
		while(!l.isEmpty()){
			LinkedList<Integer> ln = new LinkedList<Integer>();
			LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
			while(!l.isEmpty()){
				ln.add(l.peek().val);
				if(l.peek().left!=null){
					ll.add(l.peek().left);
				}
				if(l.peek().right!=null){
					ll.add(l.peek().right);
				}
				l.poll();
			}
			l = ll;
			list1.push(new ArrayList<Integer>(ln));
		}
		while(!list1.isEmpty()){
			list.add(list1.pop());
		}
		return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
