package com.lams1989.treepreordertraversal;

import java.util.Scanner;


public class TreePreorderTraversal {

	public static void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}


	public static void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
	}
	
	 public static void inOrder(Node root) {
	        if (root == null)
	            return;
	        inOrder(root.left);
	        System.out.print(root.data + " ");
	        inOrder(root.right);
	    }

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		preOrder(root);
	}

}
