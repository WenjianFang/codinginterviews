
public class Solution {

	public BTNode construct(int[] preOrder, int[] inOrder){
		if((preOrder.length==0)||(inOrder.length==0)) return null;/*NULL return null*/
		/*give the preOrder and inOrder array, and the start and end position*/
		BTNode root =constructRecu(preOrder, inOrder, 0, preOrder.length-1, 0, inOrder.length-1);
		return root;
	}
	private BTNode constructRecu(int[] preOrder, int[] inOrder, 
			int startPreOrder, int endPreOrder, int startInOrder, int endInOrder){
		
		/*Find this subTree's root*/
		BTNode root = new BTNode();
		root.val=preOrder[startPreOrder];
		root.leftChild=null;
		root.rightChild=null;
		
		/*recursively, remain ONE node, return this node. The end condition of recursively*/
		if((startPreOrder==endPreOrder)&&(startInOrder==endInOrder)&&(preOrder[startPreOrder]==inOrder[endInOrder])){
			return root;
		}
		
		/*Find the root in inOrder array*/
		int cursorInOrder = startInOrder;
		while((cursorInOrder<endInOrder)&&(inOrder[cursorInOrder]!=root.val)) cursorInOrder++;
		
		int leftLength = cursorInOrder-startInOrder;/*left subTree's length*/
		/*construct left child*/
		if((leftLength>0)&&(startPreOrder+leftLength<=endPreOrder))
		root.leftChild = constructRecu(preOrder, inOrder, 
				startPreOrder+1, startPreOrder+leftLength,
				startInOrder, startInOrder+leftLength-1);
		/*construct right child*/
		if(leftLength<endPreOrder-startPreOrder)
		root.rightChild = constructRecu(preOrder, inOrder, 
				startPreOrder+leftLength+1, endPreOrder,
				startInOrder+leftLength+1, endInOrder);
		
		return root;
	}
}
