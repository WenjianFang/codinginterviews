import java.util.*;
public class Solution {
	public ArrayList<Integer> levelTraverse(TreeNode root){
		ArrayList<Integer> result = new ArrayList<>();
		
		if(root==null) return result;/*root is null, just return null*/
		Queue<TreeNode> queue = new LinkedList<>();/*queue to store visited nodes, use linkedlist to implement*/
		TreeNode p = root;
		queue.add(p);/*enQueue the root*/
		TreeNode tmp = p;
		while(!queue.isEmpty()){
			tmp = queue.poll();
			result.add(tmp.val);/*visit this node*/
			if(tmp.left !=null){
				queue.add(tmp.left);/*enQueue left child*/
			}
			if(tmp.right!=null){
				queue.add(tmp.right);/*enQueue right child*/
			}
		}
		return result;
	}
}
