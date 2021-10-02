package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueArrayTest {
	Queue_ queue=new Queue_(5);
	@Test
	public void testQueueArr() {
		assertEquals(-1,queue.dequeue());
		queue.enqueue(123);
		queue.enqueue(113);
		queue.enqueue(142);
		queue.enqueue(165);
		queue.enqueue(12);
		queue.enqueue(54);
		assertEquals(123,queue.dequeue());
		assertEquals(113,queue.dequeue());
	}

}
