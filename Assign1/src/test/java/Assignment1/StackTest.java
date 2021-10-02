package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	Stack stack= new Stack();
	@Test
	public void testTop() throws Exception {
	
	assertNull(stack.head);
	stack.push(12);
	assertNotNull(stack.head);
	stack.push(11);
	stack.push(45);
	stack.pop();
	stack.push(44);
	stack.pop();
	
	assertEquals(11,stack.top());
	
	}
}
