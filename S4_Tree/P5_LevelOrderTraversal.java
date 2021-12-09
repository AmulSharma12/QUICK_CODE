import java.util.Scanner;
import java.util.List;

class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;


	public TreeNode(int data)
	{
		this.val = data;
	}
}

public class P5_LevelOrderTraversal
{
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);


		List<List<Integer>> list  = levelOrder(root);
		System.out.println(list);	
	}


	public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ds  = new LinkedList<List<Integer>>();
        
        if(root == null)
            return ds;
        
        queue.offer(root);
        
        while(! queue.isEmpty())
        {
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            
            for(int i = 0; i<size; i++)
            {
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                
                list.add(queue.poll().val);
                
            }
            
            ds.add(list);
        }
        
        
        return ds;
    }
}