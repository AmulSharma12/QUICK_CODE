// Node representation
class Node
{
	int data;
	Node left;
	Node right;

	public Node(int key)
	{
		this.data = key;
	}
}


public class P1_BinaryTreeRepresentation
{
	public static void main(String[] args)
	{	
		Node root = new Node(4);
		root.left = new Node (5);
		root.right = new Node(6);


		//preorder traversal
		System.out.print("preorder traversal : ");
		preOrder(root);
		System.out.println("");


		//post order traversal
		System.out.print("post order traversal : ");
		postOrder(root);
		System.out.println("");


		// inorder traversal
		System.out.print("inorder traversal : ");
		inOrder(root);
		System.out.println("");

	}


	// preOrder Function
	public static void preOrder(Node node)
	{
		if(node == null)
			return;

		System.out.print( node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}


	// postOrder Function
	public static void postOrder(Node node)
	{
		if(node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}


	// inOrder Function
	public static void inOrder(Node node)
	{
		if(node == null)
			return;

		inOrder(node.left);
		System.out.print(node.data  + " ");
		inOrder(node.right);
	}
}