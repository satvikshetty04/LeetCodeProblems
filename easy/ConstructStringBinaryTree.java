package easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import dataStructures.TreeNode;

/*
 * You need to construct a string consists of parenthesis and integers from a binary 
 * tree with the preorder traversing way. The null node needs to be represented by 
 * empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs 
 * that don't affect the one-to-one mapping relationship between the string and 
 * the original binary tree.
 */
public class ConstructStringBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(1);
		TreeNode tree1 = new TreeNode(2);
		TreeNode tree2 = new TreeNode(3);
		TreeNode tree3 = new TreeNode(4);
		tree.left = tree1;
		tree.right = tree2;
		tree1.right = tree3;
		System.out.println(tree2str(tree));
	}
	
	public static String tree2str(TreeNode t) {
		if(t == null)
			return "";
		if(t.left == null && t.right==null)
			return String.valueOf(t.val);
		StringBuilder sb = new StringBuilder();
		traverse(t, sb);
		return sb.toString();
	}
	
	public static void traverse(TreeNode t, StringBuilder sb){
		if(t!= null){
			sb.append(t.val);	
			if(t.left!= null || t.right!= null){
				sb.append("(");
				traverse(t.left,sb);
				sb.append(")");			
				if(t.right!= null){
					sb.append("(");
					traverse(t.right,sb);
					sb.append(")");
				}
			}
		}
	}

}
