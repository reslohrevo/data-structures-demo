package datastructuresdemo;

public interface Queue<T> {
	void add(T object) throws Exception;

	public T element();

	public T remove() throws Exception;
}
