package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertion {
	ArrayInsertion obj= new ArrayInsertion();
	@Test
	public void testArrayInsertion() {
		int arrayinsert[]= {20,4,56,21,67,12,6,3,88,10};
		int arrayexpected[]= {20,4,56,-1,67,12,-3,3,88,100};
		obj.insert(arrayinsert, -1, 3);
		obj.insert(arrayinsert, -3, 6);
		obj.insert(arrayinsert, 100, 9);
	
		assertArrayEquals(arrayexpected,arrayinsert);
	}

}
