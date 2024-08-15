//Creating a tree and traversing through preorder traverse.

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

		public static void PreorderTraverse(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			PreorderTraverse(root.left);
			PreorderTraverse(root.right);
		}

	}

	public static void main(String args[]) {
		int[] preorder = { 1, 2, -1, -1, 3, 4, -1, -1, 5, -1, -1 };
		BinaryTree t = new BinaryTree();
		Node root = t.buildTree(preorder);
		t.PreorderTraverse(root);

	}

}
