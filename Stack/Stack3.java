//Creating stack with collection framework stack java library
package Stack;
import java.util.Stack;

public class Stack3 {
	
	
	
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		System.out.println(stk);
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
	}

}
