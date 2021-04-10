package datastructuresdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class LinkedListTest {
	static CustomLinkedList<Integer> linkedList;

	@BeforeEach
	public void initiallize() {
		linkedList = new CustomLinkedList<>();
		linkedList.append(Integer.valueOf(3));
		linkedList.append(Integer.valueOf(4));
		linkedList.append(Integer.valueOf(9));
		linkedList.append(Integer.valueOf(1));
		linkedList.append(Integer.valueOf(5));
		linkedList.append(Integer.valueOf(7));
		linkedList.head();
	}

	@Test
	public void successfullyWalksFromHeadToTail() {
		assertEquals(3, linkedList.getValue());
		linkedList.next();
		assertEquals(4, linkedList.getValue());
		linkedList.next();
		assertEquals(9, linkedList.getValue());
		linkedList.next();
		assertEquals(1, linkedList.getValue());
		linkedList.next();
		assertEquals(5, linkedList.getValue());
		linkedList.next();
		assertEquals(7, linkedList.getValue());

	}

	@Test
	public void successfullyWalksFromTailToHead() {
		linkedList.tail();
		assertEquals(linkedList.getTail(), linkedList.getValue());
		linkedList.prev();
		assertEquals(5, linkedList.getValue());
		linkedList.prev();
		assertEquals(1, linkedList.getValue());
		linkedList.prev();
		assertEquals(9, linkedList.getValue());
		linkedList.prev();
		assertEquals(4, linkedList.getValue());
		linkedList.prev();
		assertEquals(linkedList.getHead(), linkedList.getValue());
	}

	@Test
	public void successfullyAppendsValueToTailOfList() {
		linkedList.append(Integer.valueOf(25));
		assertEquals(25, linkedList.getTail());
	}

}
