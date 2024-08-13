//reverse a linked list through recursive method

package linkedLists;

public class reverseLL2 {
	
	Node head;
	int size;
	
	reverseLL2(){
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
	
	public Node reverseRecursive(Node head)	{
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		
		return newHead;
		
	}
	
	public static void main(String[] args) {
		reverseLL2 list = new reverseLL2();
		
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(4);
		list.addLast(5);
		list.display();
		
		list.head = list.reverseRecursive(list.head);
		System.out.println();
		list.display();
				
	}
}
