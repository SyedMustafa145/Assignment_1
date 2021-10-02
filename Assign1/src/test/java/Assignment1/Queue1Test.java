package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Queue1Test {

	Queue1 queue=new Queue1(5);
	@Test
	public void testQueueArr() throws Exception {
	
		queue.enqueue(123);
		queue.enqueue(113);
		queue.enqueue(142);
		queue.enqueue(165);
		queue.enqueue(12);
	
		assertEquals(123,queue.dequeue());
		assertEquals(113,queue.dequeue());
		assertEquals(3,queue.sizeofQueue);
	}

	@Test(expected=Exception.class)
	public void testExceptions() throws Exception {
         	queue.dequeue();
         	for (int i=0; i<7; i++){
         		queue.enqueue(i);
         	}
	}
}
