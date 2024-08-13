//Stack with Arraylist
package Stack;
import java.util.ArrayList;


public class Stack2 {
	
	static class StackClass {
		static ArrayList<Integer> list = new ArrayList<>();
		
		public static boolean isEmpty() {
			return list.size() ==0;
		}
		
		//adding element
		public static void push(int data) {
			list.add(data);
		}
		
		//removing element
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
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
		
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
	}

}
