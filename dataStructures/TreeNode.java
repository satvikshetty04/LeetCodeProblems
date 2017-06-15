package dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
    
    public void printTreeBF(TreeNode tree){
    	if(tree == null)
    		return;
    	Queue<TreeNode> q = new LinkedList<>();
    	q.add(tree);
    	while(!q.isEmpty()){
    		TreeNode temp = q.remove();
    		System.out.print(temp.val +"\t");
    		if(temp.left!=null)
    			q.add(temp.left);
    		if(temp.right!=null)
    			q.add(temp.right);
    	}
    }
}
