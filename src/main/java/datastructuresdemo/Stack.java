package datastructuresdemo;

public interface Stack<T> {
	void push(T object) throws Exception;

	public T peek();

	public T pop() throws Exception;
}
