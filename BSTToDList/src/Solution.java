/*
 * recursively solve the problem
 * every recursively return list's end
 * connect the leftList, root and rightList
 */
public class Solution {
	public TreeNode binarySearchTreeToDList(TreeNode root){
		if(root == null) return null;
		TreeNode pEnd = bSTToDList(root);/*this recursive method return the list's end*/
		TreeNode pHead = pEnd;
		while(pHead.left != null) pHead = pHead.left;/*obtain the double list's head*/
		return pHead;
	}
	
	private TreeNode bSTToDList(TreeNode root){
		if(root == null) return null;
		if((root.left == null)&&(root.right == null)) return root;/*leaf node, return*/
	
		if(root.left != null){/*left subTree*/
			TreeNode leftEnd = bSTToDList(root.left);/*recursively obtain left tree's list's end*/
			leftEnd.right = root;/*connect to the root*/
			root.left = leftEnd;
		}
		if(root.right != null) {
			TreeNode rightEnd = bSTToDList(root.right);/*obtain the right subTree's end*/
			TreeNode rightHead = rightEnd;
			while(rightHead.left != null) rightHead = rightHead.left;/*obtain the right list's head*/
			rightHead.left = root;/*connect to the root*/
			root.right = rightHead;
			
			return rightEnd;/*return end*/
		}
		
		return root;/*if go here, means NOT EXIST right subTree, so return root*/
	}
}
