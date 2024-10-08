// Creating a Binary Tree
// Traversing through  preOrder, inorder and postOrder

//    1
//  2   3
//     4  5

public class Tree1 {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int preorder[]) {
			idx++;
			if (preorder[idx] == -1) {
				return null;
			}

			Node root = new Node(preorder[idx]);
			root.left = buildTree(preorder);
			root.right = buildTree(preorder);
			return root;
		}

		public static void preOrder(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}

		public static void inOrder(Node root) {
			if (root == null) {
				return;
			}
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}

		public static void postOrder(Node root) {
			if (root == null) {
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}

	}

	public static void main(String args[]) {
		int[] nodes = { 1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1 };
		BinaryTree t = new BinaryTree();
		Node root = t.buildTree(nodes);
		t.preOrder(root);
		System.out.println();
		t.inOrder(root);
		System.out.println();
		t.postOrder(root);

	}

}
