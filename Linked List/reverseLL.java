//Reverse through iterative method

package linkedLists;

public class reverseLL1 {
	
	Node head;
	int size;
	
	reverseLL1(){
		int size =0;
	}

	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data= data;
			this.next = null; 
			size++;
			}
	}
	
	//adding first number
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
				
	}
	
	//adding to last
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;	
	}
	
	
	//displaying the LL
	public void display() {
		if(head == null) {
			System.out.println("empty Linked-list");
			return;
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}
	
	public void reverseLinkedList()	{
		if(head == null || head.next == null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update pointers
			prevNode= currNode;
			currNode= nextNode;
		}
		head.next = null;
		head = prevNode;
		
	}
	
	public static void main(String[] args) {
		reverseLL1 list = new reverseLL1();
		
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(40);
		list.addLast(50);
		list.display();
		
		list.reverseLinkedList();
		System.out.println();
		list.display();
				
	}
}
