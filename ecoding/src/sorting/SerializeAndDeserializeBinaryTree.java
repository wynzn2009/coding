/**
 * 
 */
package sorting;

import java.util.LinkedList;

/**
 * @author wyn
 * 297
 */
public class SerializeAndDeserializeBinaryTree {
	// Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
    	LinkedList<TreeNode> list = new LinkedList<TreeNode>();
    	if(root==null){
    		return "";
    	}
    	if(root.left==null&&root.right==null){
    		return String.valueOf(root.val);
    	}
    	StringBuffer sb = new StringBuffer();
		sb.append(root.val);
    	list.offer(root.left);
    	list.offer(root.right);
    	while(!list.isEmpty()){
    		TreeNode node = list.poll();
    		if(null==node){
    			if(!list.isEmpty()){
    				sb.append(",").append("null");
    			}
    		}else{
    			sb.append(",").append(node.val);
    			list.offer(node.left);
    			list.offer(node.right);
    		}
    	}
    	return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        if(data.equals("")){
        	return null;
        }
        String[] arr = data.split(",");
    	if(arr.length==1){
    		return new TreeNode(Integer.valueOf(arr[0]));
    	}
    	TreeNode head = new TreeNode(Integer.valueOf(arr[0]));
    	list.offer(head);
    	for(int i=1;i<arr.length;i++){
    		if(list.isEmpty()){
    			list.offer(new TreeNode(Integer.valueOf(arr[i])));
    		}else if(i%2==1){
    			TreeNode t = list.getFirst();
    			TreeNode node = null;
    			if(!"null".equals(arr[i])){
    				node = new TreeNode(Integer.valueOf(arr[i]));
    				list.offer(node);
    			}
    			t.left = node;
    		}else{
    			TreeNode t = list.pollFirst();
    			TreeNode node = null;
    			if(!"null".equals(arr[i])){
    				node = new TreeNode(Integer.valueOf(arr[i]));
    				list.offer(node);
    			}
    			t.right = node;
    		}
    	}
    	return head;
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
