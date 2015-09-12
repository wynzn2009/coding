package sorting;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if(root==null){
        	return l;
        }
        List<Integer> ln = new ArrayList<Integer>();
        ln.add(root.val);
        help(root,sum-root.val,l,ln);
        return l;
    }
	private void help(TreeNode root, int sum,List<List<Integer>> l,List<Integer> ln){
		if(root==null){
			return;
		}
		if(root.right==null&&root.left==null&&sum==0){
			l.add(new ArrayList<Integer>(ln));
		}
		if(root.left!=null){
			ln.add(root.left.val);
			help(root.left,sum-root.left.val,l,ln);
			ln.remove(ln.size()-1);
		}
		if(root.right!=null){
			ln.add(root.right.val);
			help(root.right,sum-root.right.val,l,ln);
			ln.remove(ln.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
