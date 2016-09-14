/*
 * last element of sequence is the root
 * left subTree < root
 * right subTree > root
 * if NOT satisfy, return false;
 * if satisfy, judge left subTree and right subTree
 */
public class Solution {
	public boolean verifySquenceOfBST(int[] sequence) {
		if(sequence.length==0) return false;
		return verifySqOfBSTInsideRecu(sequence, 0, sequence.length-1);
    }
	
	private boolean verifySqOfBSTInsideRecu(int[] sequence, int start, int end){
		
		/*left subTree*/
		int i=start;
		for(; i<end; i++){
			if(sequence[i]>sequence[end]) break;
		}
		
		/*right subTree*/
		int j=i;
		for(; j<end; j++){
			if(sequence[j]<sequence[end]) return false;
		}
		
		/*is left subTree a BST sequence ?*/
		boolean left = true;
		if(i>start) left = verifySqOfBSTInsideRecu(sequence, start, i-1);
		/*is right subTree a BST sequence ?*/
		boolean right = true;
		if(i<end-1) right = verifySqOfBSTInsideRecu(sequence, i, end-1);
		
		return left&&right;
	}
}
