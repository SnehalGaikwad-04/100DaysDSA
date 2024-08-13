//pushing a element at the bottom of the stack
package Stack;
import java.util.Stack;

public class pushAtBottom {
		
		public static void PB(int data, Stack<Integer>s){
			if(s.isEmpty()) {
				s.push(data);
				return;
			}
			int top = s.pop();
			PB(data, s);
			s.push(top);
		}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		System.out.println(s);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		PB(6,s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
