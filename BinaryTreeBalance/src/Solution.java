/*
 * postOrder traverse
 */
public class Solution {
	public boolean isBalance(TreeNode root){
		if(root == null) return true;
		
		int left = depthOfTree(root.left);
		int right = depthOfTree(root.right);
		int diff = left-right;
		if(diff >= -1 && diff <= 1) return true;
		else return false;
	}
	private int depthOfTree(TreeNode root){
		if(root == null) return 0;
		int leftDepth = depthOfTree(root.left);
		int rightDepth = depthOfTree(root.right);
		
		return (leftDepth > rightDepth)?(leftDepth+1):(rightDepth+1);
	}
}
