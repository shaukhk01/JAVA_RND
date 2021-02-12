package com.DLL;
import com.Node.*;
public class DeleteDLL {

	public Node getNewNode(int data) {

		Node newNode = new Node(data);

		return newNode;
	}


	public Node addNode(Node node,int data) {

		if(node == null)
			return getNewNode(data);

		Node head = node;

		while(node.next !=null) {

			node = node.next;
		}

		Node new_node = getNewNode(data);

		new_node.prev = node;
		node.next = new_node;

		return head;
	}
}
