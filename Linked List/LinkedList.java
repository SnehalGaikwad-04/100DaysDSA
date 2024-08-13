//creating a LL
package linkedLists;

public class LinkedList {
	
	Node head;
	int size;
	
	LinkedList(){
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
	
	//delete first node
	public void deleteFirst() {
		if(head == null) {
			System.out.println("the Linked list is empty already");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delete last node
	public void deleteLast() {
		if(head == null) {
			System.out.println("the Linked list is empty already");
			return;
		}
		size--;
		Node temp1 = head;
		Node temp2 = head.next;
		while(temp2.next != null) {
			temp2= temp2.next;
			temp1 = temp1.next;
		}
		temp1.next = null;
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
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.display();
		System.out.println();
		
		list.addLast(40);
		list.addLast(50);
		list.display();
		System.out.println();
		
		list.deleteFirst();
		list.display();
		System.out.println();
		
		list.deleteLast();
		list.display();
		System.out.println();
		
		System.out.println("size: " +list.getSize());		
	}
}
