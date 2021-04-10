package datastructuresdemo;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueue<T> implements Queue<T> {
	private static final int DEFAULT_QUEUE_SIZE = 10;
	private int queueSize;
	private List<T> queue = new ArrayList<T>();

	public SimpleQueue() {
		queueSize = DEFAULT_QUEUE_SIZE;
	}

	public SimpleQueue(int queueSize) {
		this.queueSize = queueSize;
	}

	@Override
	public void add(T object) throws Exception {
		if (queue.size() == queueSize) {
			throw new Exception("Queue full");
		}
		queue.add(object);
	}

	@Override
	public T element() {
		return queue.get(0);
	}

	@Override
	public T remove() throws Exception {
		if (queue.size() == 0) {
			throw new Exception("Queue full");
		}
		T removed = queue.get(0);
		queue.remove(0);
		return removed;
	}

}
