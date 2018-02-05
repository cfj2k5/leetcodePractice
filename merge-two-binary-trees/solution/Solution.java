package solution;

class Solution{
	public static void main(String[] args){

	}
  
	/* the treenode class was provided */
	public class TreeNode {
      		int val;
      		TreeNode left;
      		TreeNode right;
      		TreeNode(int x) { val = x; }
  	}
 

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null){
			return null;
		}
		TreeNode newNode = null;
		if(t1 != null && t2 == null){
			newNode = new TreeNode(t1.val);
			newNode.left = mergeTrees(t1.left, null);
			newNode.right = mergeTrees(t1.right,null);
		}
		if(t1 == null && t2 != null){
			newNode = new TreeNode(t2.val);
			newNode.left = mergeTrees(null, t2.left);
			newNode.right = mergeTrees(null, t2.right);
		}
		if(t1 != null && t2 != null){
			newNode = new TreeNode(t1.val + t2.val);
			newNode.left = mergeTrees(t1.left, t2.left);
			newNode.right = mergeTrees(t1.right, t2.right);
		}
		return newNode;
	}

	/* used leet codes sample code to add */

}
