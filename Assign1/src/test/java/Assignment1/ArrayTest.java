package Assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
	Array obj=new Array();
	@Before
	public void insertarray() {
		int arrayinsert[]= {20,4,56,21,67,12,6,3,88,10};
		
		for(int i=0;i<10;i++){
			
			obj.insert(arrayinsert[i], i);
		}
	}
	@Test
	public void testDeleteElement() {
			
		int array1[]= {20,4,56,67,12,6,3,88,10};
		obj.delete(3);
		for(int i=0; i<9; i++) {
		assertEquals(array1[i],obj.array[i]);
		}
	}
	
	@Test
	public void testSreach() {
	assertFalse(obj.linearSearch(99));
	assertTrue(obj.linearSearch(12));
	assertTrue(obj.binarySearch(88, 0, obj.size));
	assertFalse(obj.binarySearch(99, 0, obj.size));
	}
	
	private void assertTure(boolean binarySearch) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void TestSorting() {
		int arr[]= {3,4,6,10,12,20,21,56,67,88};
		obj.bubbleSort();
		
		for(int i=0; i<10; i++) {
			assertEquals(arr[i],obj.array[i]);
			}
	}
	
}
	
