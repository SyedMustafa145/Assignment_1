package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueneLinklistTest {
		Queue queue= new Queue();
	@Test
	public void testQueue() {
		assertNull(queue.head);
		queue.enqueue(123);
		queue.enqueue(113);
		queue.enqueue(142);
		queue.enqueue(165);
		queue.enqueue(12);
		queue.enqueue(54);
		assertEquals(123,queue.head.key);
		assertEquals(113,queue.head.next.key);
		assertEquals(123,queue.dequeue());
		
	}

}
