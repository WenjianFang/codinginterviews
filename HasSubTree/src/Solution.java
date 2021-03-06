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
public class Solution {
    public boolean hasSubTree(TreeNode root1,TreeNode root2) {
        boolean result = false;
    	if(root1 != null && root2 != null){
    		if(root1.val == root2.val){
    			result = doesTree1HasTree2(root1, root2);/*if the root value equal, judge two trees*/
    		}
    		if(!result){
    			result = hasSubTree(root1.left, root2);/*judge left subTree and tree2*/
    		}
    		if(!result){
    			result = hasSubTree(root1.right, root2);/*judge right subTree and tree2*/
    		}
    	}
    	return result;
    }
    private boolean doesTree1HasTree2(TreeNode root1, TreeNode root2){
    	/*if root2 null, return true, here NOT root1==null return false
    	 * because root1==null and root2==null, it is true
    	 */
    	if(root2 == null) return true;
    	if(root1 == null) return false;
    	
    	if(root1.val != root2.val) return false;
    	/*root1.val == root2.val
    	 * true if root1.left has root2.left and root1.right has root2.right
    	 */
    	return doesTree1HasTree2(root1.left, root2.left) && doesTree1HasTree2(root1.right, root2.right);
    }
}
