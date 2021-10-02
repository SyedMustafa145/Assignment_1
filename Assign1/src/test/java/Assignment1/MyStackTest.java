package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {
	MyStack stack= new MyStack(3);
	@Test
	public void testTop() throws Exception {
	
		stack.push(12);
		assertNotNull(stack.arraytostoreStack);
		stack.push(13);
		stack.push(11);
		assertEquals(11, stack.top());
		stack.pop();
		assertEquals(13, stack.top());
		assertEquals(2, stack.size());
	}
	@Test(expected=Exception.class)
	public void testExceptions() throws Exception {
		stack.pop(); 
		stack.top();
		stack.push(12);
		stack.push(13);
		stack.push(11);
		stack.push(33);
	}

	
	
	

}
