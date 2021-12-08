 class Node 
 {
 	int data;
 	Node left;
 	Node right;

 	// constructor node
 	public Node(int data)
 	{
 		this.data = data;
 	}
 }

 public class P1_BinaryTreeRepresentation
 {
 	public static void main(String[] args)
 	{
 		Node root = new Node(4);
 		System.out.println(root.data);

 	}
 }