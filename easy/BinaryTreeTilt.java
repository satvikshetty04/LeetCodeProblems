package easy;

import dataStructures.TreeNode;

/*
 * Given a binary tree, return the tilt of the whole tree. 
 * The tilt of a tree node is defined as the absolute difference between the sum of all 
 * left subtree node values and the sum of all right subtree node values. Null node has 
 * tilt 0. The tilt of the whole tree is defined as the sum of all nodes' tilt.
 */
public class BinaryTreeTilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree = new TreeNode(1);
		TreeNode tree1 = new TreeNode(2);
		TreeNode tree2 = new TreeNode(3);
		TreeNode tree3 = new TreeNode(4);
		TreeNode tree4 = new TreeNode(5);
		/*TreeNode tree5 = new TreeNode(10);
		TreeNode tree6 = new TreeNode(14);
		TreeNode tree7 = new TreeNode(13);
		TreeNode tree8 = new TreeNode(15);*/
		
		tree.left = tree1;
		tree.right = tree2;
		tree1.left = tree3;
		tree2.left = tree4;
		/*tree2.left = tree5;
		tree2.right = tree6;
		tree6.left = tree7;
		tree6.right = tree8;*/

		tree.printTreeBF(tree);
		System.out.println();
		System.out.println(findTilt(tree));
	}
	
	public static int findTilt(TreeNode root) {
		if(root == null)
			return 0;
		int l = 0, r = 0;
		if(root.left!=null)
			l += root.left.val + findTilt(root.left);
		if(root.right!=null)
			r += root.right.val + findTilt(root.right);
		return l + r + Math.abs(r-l);
	}

}
