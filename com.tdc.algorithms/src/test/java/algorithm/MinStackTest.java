package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinStackTest {

	@Test
	public void test() {
		//19 P 10 P 9 g P 8 g P 7 g P 6 g p g p g p g p g p g
		MinStack stack = new MinStack();
		stack.push(19);
		stack.push(10);
		stack.push(9);
		System.out.println(stack.getMin());
		stack.push(8);
		System.out.println(stack.getMin());
		stack.push(7);
		System.out.println(stack.getMin());
		stack.push(6);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		
		
		
		
	}

}
