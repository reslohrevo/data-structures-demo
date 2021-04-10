package datastructuresdemo;

import java.util.ArrayList;
import java.util.List;

class SimpleStack<T> implements Stack<T> {
	private List<T> stack = new ArrayList<T>();
	private static final int STACK_SIZE = 10;
	private int stackSize;

	public SimpleStack() {
		stackSize = STACK_SIZE;
	}

	public SimpleStack(int stackSize) {
		this.stackSize = stackSize;
	}

	public void push(T object) throws Exception {
		if (stack.size() == stackSize) {
			throw new Exception("Stack Full");
		}
		stack.add(object);
	}

	public T peek() {
		return stack.get(stack.size() - 1);
	}

	public T pop() throws Exception {
		if (stack.size() == 0) {
			throw new Exception("Stack Empty");
		}
		T pop = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return pop;
	}

}
