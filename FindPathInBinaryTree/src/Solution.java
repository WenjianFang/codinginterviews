/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
*/
import java.util.*;
/*
 * 
 * recursively solve problem
 * if(root.val>target) this tree would NOT have solution
 * else target = target-root.val;
 * and recursively solve (root.left, newTarget) and (root.right, newTarget)
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
    	ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();/*arraylist to store all paths*/
    	
    	if(root!=null) findPathRecu(root, target, allPaths, null);
    	return allPaths;
    }
    /**
     * 
     * @param root:this subTree's root
     * @param target:newTarget
     * @param allPaths:
     * @param parentPath:the path from root->its parent
     */
    private void findPathRecu(TreeNode root, int target, 
    		ArrayList<ArrayList<Integer>> allPaths, ArrayList<Integer> parentPath){
    	/*for this subTree, new path and add its parent path to it*/
    	ArrayList<Integer> onePath = new ArrayList<>();
    	if(parentPath != null) onePath.addAll(parentPath);
    	
    	onePath.add(root.val);/*add its root value*/
    	/*leaf node and it is equal to target, bingo!*/
    	if((root.left==null) && (root.right==null) && (root.val == target)){
    		allPaths.add(onePath);/*add to allPaths*/
    		return;
    	}
    	/*root.val>target, this subTree is NOT solution
    	 * but it is NOT TRUE for value < 0.
    	 */
    	/*
    	if(root.val > target) {
    		return;
    	}
    	*/
    	if(root.left != null){/*left subTree, target is newTarget*/
    		findPathRecu(root.left, target-root.val, allPaths, onePath);
    	}
    	if(root.right != null){/*right subTree, target is newTarget*/
    		findPathRecu(root.right, target-root.val, allPaths, onePath);
    	}
    	return;
    	
    }
}
