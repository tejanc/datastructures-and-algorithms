package algorithm;

import java.util.Stack;

public class MinStack {

	Stack<Integer> s = new Stack<Integer>();
	Integer min = -1;

	public void push(int x) {
		if (s.isEmpty()) {
			min = x;
			s.push(x);
			return;
		} 
		else {
			if (x < min) {
				s.push(2*x - min);
				min = x;
			}
			else {
				s.push(x);
			}
		}
	}

	public void pop() {
		if (s.isEmpty()) {
			min = -1;
			return;
		}

		Integer t = s.pop();

		if (t < min) {
			min = 2*min - t;
		} else {
			min = -1;
		}
	}

	public int top() {
		if (s.isEmpty()) {
			return -1;
		}
		int t = s.peek();
		return t;
	}

	public int getMin() {
		return min;
	}

}
