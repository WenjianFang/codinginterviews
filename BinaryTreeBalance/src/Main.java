import java.util.*;


public class Main {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,-1,-1,-1,-1,6};
		
		TreeNode root = createBinaryTree(arr);
		
		System.out.print("tree: ");
		traverseTree(root);
		
		System.out.println();
		
		boolean ret = new Solution().isBalance(root);
		System.out.println(ret);
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
			if(tmp == null) continue;
			if(i==array.length-1){
				TreeNode p = new TreeNode(array[i]);
				p.left = null;
				p.right = null;
				tmp.left = p;
				q.add(p);
			}
			else if(i<array.length){
				TreeNode p1;
				if(array[i]==-1) p1 = null;
				else{
					p1 = new TreeNode(array[i]);
					p1.left = null;
					p1.right = null;
				}
				TreeNode p2;
				if(array[i+1]==-1) p2 = null;
				else{
					p2 = new TreeNode(array[i+1]);
				
					p2.left = null;
					p2.right = null;
				}
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
