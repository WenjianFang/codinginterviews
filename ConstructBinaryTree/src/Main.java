
public class Main {
	public static void main(String[] args){
		int[] preOrder = {1,2,4,7,3,5,6,8};
		int[] inOrder = {4,7,2,1,5,3,8,6};
		
		BTNode root = new Solution().construct(preOrder, inOrder);
		
		traverseBTreePreOrder(root);/*TEST the result*/
	}
	private static void traverseBTreePreOrder(BTNode root){
		if(root==null) return;
//		System.out.print(root.val+" ");
		traverseBTreePreOrder(root.leftChild);
		System.out.print(root.val+" ");
		traverseBTreePreOrder(root.rightChild);
	}
}
