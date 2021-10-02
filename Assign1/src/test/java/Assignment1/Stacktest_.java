package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stacktest_ {
	Stack_ stack=new  Stack_();
	@Test
	public void testTop() throws Exception {
		
		for (int i=0;i<101;i++)
		stack.push(i);
		assertEquals(99, stack.array[stack.addPointer-1]);
		for (int i=0;i<98;i++)
			stack.pop();
		assertEquals(1, stack.array[stack.addPointer-1]);
	}
}
