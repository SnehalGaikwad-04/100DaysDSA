//Creating Queue using Linked-List
//recommended way
package Queue;

public class Queue2 {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	static class Queue {
		static Node head = null;
		static Node tail = null;

		public static boolean isEmpty() {
			return head == null && tail == null;
		}

		//LL is variable size, hence no need for isFull() function

		// enqueue
		public static void add(int data) {
			Node newNode = new Node(data);
			if(tail == null) {
				tail = head = null;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}

		// dequeue O(1)
		public static int remove() {
			if (isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			
			int top = head.data;
			if(head == tail) {
				tail = null;
			}
			head = head.next;
			return top;
		}

		// peek
		public static int peek() {
			if (isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			return head.data;
		}

	}

	public static void main(String[] args) {
		Queue q = new Queue();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		//System.out.println("\nqueue: ");
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}

