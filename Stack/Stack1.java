//creating stack from scratch
package Stack;

public class Stack1 {
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
		
	static class StackClass {
		public static Node head;
		
		public static boolean isEmpty() {
			return head == null;
		}
		
		public static void push(int data){
			 Node newNode = new Node(data);
			 if(isEmpty()) {
				 head = newNode;
				 return;
			 }
			 newNode.next= head;
			 head = newNode;
			}
		
		public static int pop() {
			if(isEmpty()) {
				 return -1;
			 }
			int top = head.data;
			head = head.next;
			return top;
			
		}
		
		public static int peek() {
			if(isEmpty()) {
				 return -1;
			 }
			return head.data;			
		}
	}
	
	public static void main(String[] args) {
		StackClass stk = new StackClass();
		System.out.println(stk);
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
//		System.out.println(stk);
		
		
		System.out.println(stk.pop());
		
		System.out.println(stk.pop());
		
		
		System.out.println("peek:" +stk.peek());
		
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
	}

}
