package datastructuresdemo;

public interface MyList<T> {
	public void insert(T element);
	
	public void append(T element);

	public T remove() throws Exception;

//	public MyList<T> getNext();
//
//	public MyList<T> getPrev();
//	
//	public void setNext(MyList<T> next);
//	
//	public void setPrev(MyList<T> prev);
}
