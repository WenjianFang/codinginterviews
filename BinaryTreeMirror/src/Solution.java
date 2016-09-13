import java.util.Stack;

/*
 * recursively solve the problem
 * just exchange node's left and right child, if this node has child nodes
 */
public class Solution {
	/*recursive method*/
	public void mirrorBinaryTreeRecu(TreeNode root){
		if(root == null) return; /**/
		if((root.left ==null)&&(root.right==null)) return;/*leaf nodes*/
		
		/*exchange the left and right child*/
		TreeNode p = root.left;
		root.left = root.right;
		root.right = p;
		/*mirror left child and right child*/
		if(root.left !=null) mirrorBinaryTreeRecu(root.left);
		if(root.right != null) mirrorBinaryTreeRecu(root.right);
	}
	/*
	 * non recursive method, it is an preOrder traverse binary tree
	 */
	public void mirrorBinaryTreeNonRecu(TreeNode root){
		if(root == null) return;
		if((root.left == null)&&(root.right==null)) return;/*leaf node*/
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = root;
		while(p!=null || !stack.empty()){
			while(p!=null){
				//visit(p);
				/*visit this node change to be exchange this node's left and right child*/
				TreeNode tmp = p.left;
				p.left = p.right;
				p.right = tmp;
				
				stack.push(p);/*push this node to stack*/
				p = p.left; /*go to its left child*/
			}
			/*p == null*/
			if(!stack.empty()){
				p = stack.pop().right;/*go to the parent's right child*/
			}
		}
	}
}
