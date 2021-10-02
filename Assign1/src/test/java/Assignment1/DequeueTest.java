package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DequeueTest {
	Dequeue dequeue= new Dequeue(5);
	@Test
	public void testDequeue() {
		dequeue.addRight(44);
		dequeue.addRight(21);
		dequeue.addLeft(92);
		dequeue.addLeft(23);
		assertEquals(21,dequeue.array[dequeue.leftPointer]);
		assertEquals(23,dequeue.array[dequeue.rightPointer]);
	}

}
