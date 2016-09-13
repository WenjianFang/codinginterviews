import java.util.*;


public class Main {
	public static void main(String[] args){
		int[] arr1 = {2,3,2};
		
		TreeNode root = createBinaryTree(arr1);

		System.out.print("origin tree: ");
		traverseTree(root);
		
//		new Solution().mirrorBinaryTreeRecu(root);
//		
//		System.out.print("Recu mirror tree: ");
//		traverseTree(root);
		
		ArrayList<Integer> ret = new Solution().levelTraverse(root);
		
		System.out.print("level traverse tree: "+ret.toString());
		
	}
	
	private static TreeNode createBinaryTree(int[] array){
		if(array.length == 0) return null;
		TreeNode root = new TreeNode(array[0]);
		root.left=null;
		root.right=null;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		TreeNode tmp;
		for(int i=1; i<array.length; i+=2){
			tmp = q.poll();
			if(i==array.length-1){
				TreeNode p = new TreeNode(array[i]);
				p.left = null;
				p.right = null;
				tmp.left = p;
				q.add(p);
			}
			else if(i<array.length){
				TreeNode p1 = new TreeNode(array[i]);
				p1.left = null;
				p1.right = null;
				TreeNode p2 = new TreeNode(array[i+1]);
				p2.left = null;
				p2.right = null;
				tmp.left = p1;
				tmp.right = p2;
				q.add(p1);
				q.add(p2);
			}
		}
		return root;
	}
	private static void traverseTree(TreeNode root){
		if(root == null) return;
		System.out.print(root.val + " ");
		traverseTree(root.left);
		traverseTree(root.right);
	}
}
