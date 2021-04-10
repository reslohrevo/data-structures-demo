package datastructuresdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;


public class StackTest {
	private Stack<String> stack = null;
	
	@BeforeEach
	public void setup() {
		stack = new SimpleStack<>();
	}

	@Test
	@DisplayName("Very cool test")
	public void canPushAndPopString() throws Exception {
		String expected = "Hello World";
		stack.push(expected);
		String actual = stack.pop();

		assertEquals(expected, actual);

	}

	@Test
	@Disabled
	public void popEmptyStackFails() {
		assertThrows(Exception.class, () -> stack.pop());
	}
}
