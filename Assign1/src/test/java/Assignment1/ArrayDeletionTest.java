package Assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDeletionTest {
	ArrayDeletion obj= new ArrayDeletion ();
	@Test
	public void testArrayDeletion() {
		int arrayinsert[]= {20,4,56,21,67,12,6,3,88,10};
		int arrayexpected[]= {20,4,21,67,12,3,10,-1,-1,-1};
		obj.Calldelete(arrayinsert, 2);
		obj.Calldelete(arrayinsert, 7);
		obj.Calldelete(arrayinsert, 5);
		assertArrayEquals(arrayexpected,arrayinsert);
	}

	}


