package easy;

import java.util.LinkedList;
import java.util.Queue;

import dataStructures.TreeNode;

/*
 * Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path 
from the root node down to the farthest leaf node.
 */

public class MaxDepthBinaryTree {

	int max = 0;
	
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
		System.out.println(maxDepth(tree));
	}

	//Iterative solution - BFS
	public static int maxDepth(TreeNode root) {
		if(root == null)
        	return 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int cnt = 0;
		q.add(root);
		while(!q.isEmpty()){
			int q_size = q.size();
			while(q_size > 0){
				TreeNode temp = q.remove();
				if(temp.left!= null)
					q.add(temp.left);
				if(temp.right!= null)
					q.add(temp.right);
				q_size--;
			}
			cnt++;
		}
		return cnt;
	}
	
	/*
	//Recursive solution
	public static int maxDepth(TreeNode root) {
		int l_len = 1, r_len = 1;
		if(root == null)
        	return 0;
        if(root.left != null ){
        	l_len = 1 + maxDepth(root.left);
        }
        if(root.right != null){
        	r_len =  1 + maxDepth(root.right);
        }
        return l_len>r_len ? l_len:r_len;
        //OR
        return root==null? 0: Math.max(1+ maxDepth(root.left), 1+ maxDepth(root.right));
    }*/
}
