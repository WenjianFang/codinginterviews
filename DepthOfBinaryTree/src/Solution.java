/*max(leftTree, rightTree)+1*/
public class Solution {
	public int getDepthOfTree(TreeNode root){
		if(root == null) return 0;
		int leftDepth = getDepthOfTree(root.left);
		int rightDepth = getDepthOfTree(root.right);
		
		return (leftDepth > rightDepth) ? (leftDepth+1):(rightDepth+1);
	}
}
