import java.util.Scanner;

// create class of a node
class Node
{
	int data;
	Node left;
	Node right;


	// constructor to intialize the data
	public Node(int data)
	{
		this.data = data;
	}
}



public class P3_InOrderTraversal
{
	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left .right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);


		inOrder(root);
	}



	// inOrder function
	public static void inOrder(Node node)
	{
		// edge case would be whenever encounters null just return from here itself
		if(node == null)
			return;

		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
}