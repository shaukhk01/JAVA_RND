package com.Node;
class Node {

	int data;
	Node next;
	Node prev;

	Node(int data) {
	
		this.data = data;
		this.prev = null;
		this.next = null;
	}

}

/*class DeleteDLL {

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
}*/

class DDeleteLL {

	public Node atFirst(Node node){

		Node t = node;
		 
		t = node.next;
		t.prev = null;

		return t;
	}

	public Node atPos(Node node,int pos) {

		Node t = node;

		for(int i=1;i<pos-1;i++){

			t = t.next;
		}

		Node q = t.next.next;
		t.next = q;
		q= t;
		return node;
	}
}



class PrintDLL{

	public void printDll(Node head) {

		Node dll = head;

		/*while(dll !=null){

			System.out.print(dll.data+" ");
			dll = dll.next;
		}*/

		while(dll.next !=null){

			System.out.print(dll.data+" ");
			dll = dll.next;
		}
		while(dll !=head){

			System.out.print(dll.data+" ");
			dll = dll.prev;
		}
			System.out.print(dll.data+" ");
			
	}
}


/*class Main {

	public static void main(String[]args) {

		DeleteDLL dll = new DeleteDLL();

		Node head = null;

		head = dll.addNode(head,1000);
		head = dll.addNode(head,2000);
		head = dll.addNode(head,3000);
		head = dll.addNode(head,4000);
		head = dll.addNode(head,5000);
		head = dll.addNode(head,6000);

		DDeleteLL ll = new DDeleteLL();

		PrintDLL p = new PrintDLL();
		//p.printDll(head);
		System.out.println();
		head = ll.atPos(head,4);
		p.printDll(head);
		System.out.println();*/

	/*	System.out.println();
		p.printDll(head);
		System.out.println();
		System.out.println();

		DDeleteLL ddll = new DDeleteLL();

		head = ddll.atFirst(head);
		System.out.println();
		System.out.println();
		p.printDll(head);
		System.out.println();
		ddll.atLast(head);
		System.out.println();
		p.printDll(head);
		*/
//	}
}


