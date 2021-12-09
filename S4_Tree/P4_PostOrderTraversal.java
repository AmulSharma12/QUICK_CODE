import java.util.Scanner;
import java.util.Arrays;

// creating a class of a node
class Node
{
	int data;
	Node left;
	Node right;



	// constructor to initialize the values
	public Node(int data)
	{
		this.data = data;
	}

}



public class P4_PostOrderTraversal
{
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);


		postOrder(root);
		// 4 5 2 6 7 3 1
	}



	public static void postOrder(Node node)
	{
		// edge case would be if we not encouter the node then we return from there itself
		if(node == null)
			return ;

		// left->right-> print the data
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
}