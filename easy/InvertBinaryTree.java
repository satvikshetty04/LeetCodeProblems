package easy;

import dataStructures.TreeNode;

/*
 * Invert a binary tree. 
 */
public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(10);
		TreeNode tree1 = new TreeNode(6);
		TreeNode tree2 = new TreeNode(12);
		TreeNode tree3 = new TreeNode(1);
		TreeNode tree4 = new TreeNode(8);
		TreeNode tree5 = new TreeNode(10);
		TreeNode tree6 = new TreeNode(14);
		TreeNode tree7 = new TreeNode(13);
		TreeNode tree8 = new TreeNode(15);
		
		tree.left = tree1;
		tree.right = tree2;
		tree1.left = tree3;
		tree1.right = tree4;
		tree2.left = tree5;
		tree2.right = tree6;
		tree6.left = tree7;
		tree6.right = tree8;

		tree.printTreeBF(tree);
		System.out.println();
		TreeNode invertedTree = invertTree(tree);
		invertedTree.printTreeBF(invertedTree);
	}
	
	public static TreeNode invertTree(TreeNode root) {
		if(root == null)
			return null;
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
		
	}

}
