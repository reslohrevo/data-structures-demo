package datastructuresdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {
	private SimpleQueue<Integer> myQueue;

	@BeforeEach
	public void initiallize() throws Exception {
		SimpleQueue<Integer> queueInit = new SimpleQueue<Integer>(99);

		queueInit.add(Integer.valueOf(4));
		queueInit.add(Integer.valueOf(5));
		queueInit.add(Integer.valueOf(6));
		queueInit.add(Integer.valueOf(7));
		queueInit.add(Integer.valueOf(1));
		queueInit.add(Integer.valueOf(2));
		queueInit.add(Integer.valueOf(3));

		myQueue = queueInit;
	}

	@Test
	public void failsIfAFullStackAcceptsANewObject() throws Exception {
		assertThrows(Exception.class, () -> {
			while (true) {
				myQueue.add(Integer.valueOf(3));
			}
		});
	}

	@Test
	public void elementReturnsFirstValueInQueue() {
		assertEquals(4, myQueue.element());
	}

	@Test
	public void removeReturnsValuesInOrder() throws Exception {
		assertEquals(4, myQueue.remove());
		assertEquals(5, myQueue.remove());
		assertEquals(6, myQueue.remove());
	}
}
