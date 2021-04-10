package datastructuresdemo;

public class CustomLinkedList<T> implements MyList<T> {
	private Node<T> head;
	private Node<T> currentNode;
	private Node<T> tail;

	public void insert(T newNodeValue) {
		if (currentNode.next != null) {
			Node<T> newNode = new Node<T>(newNodeValue);
			newNode.prev = currentNode;
			newNode.next = currentNode.next;
			currentNode.next.prev = newNode;
			currentNode.next = newNode;
			currentNode = newNode;
		} else {
			append(newNodeValue);
		}
	}

	public void append(T newNodeValue) {
		Node<T> newNode = new Node<T>(newNodeValue);
		if (head == null && tail == null) {
			head = newNode;
			currentNode = newNode;
			tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}

	@Override
	public T remove() throws Exception {
		return null;
	}

	public T getValue() {
		return currentNode.value;
	}

	public T getNext() {
		return currentNode.next.value;
	}

	public T getPrev() {
		return currentNode.prev.value;
	}

	public T getHead() {
		return head.value;
	}

	public T getTail() {
		return tail.value;
	}

	public void next() {
		currentNode = currentNode.next;
	}

	public void prev() {
		currentNode = currentNode.prev;
	}

	public void head() {
		currentNode = head;
	}

	public void tail() {
		currentNode = tail;
	}

	private static class Node<T> {
		private Node<T> next;
		private Node<T> prev;
		private T value;

		public Node(T data) {
			value = data;
		}
	}

}
