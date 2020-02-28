package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {
	//Tests the methods of the SimpleList class
	SimpleList sl;
	@Test
	public void testSimpleList() { //Tests to make sure the constructor makes an object
		//fail("Not yet implemented");
		sl = new SimpleList();
		assertNotNull(sl);
	}
	@Test
	public void testAdd() { //Tests the add method to insure it adds new numbers while pushing the rest back
		//fail("Not yet implemented");
		sl = new SimpleList();
		int[] expected = {4,3,2,1,0,0,0,0,0,0};
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		assertEquals(expected[2], sl.list[2]);
	}
	@Test
	public void testCount() {
		sl = new SimpleList();
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		assertEquals(4, sl.count());
	}
	@Test
	public void testSearchPositive() {//Tests to insure the right index is returned when searched
		sl = new SimpleList();
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		int result = sl.search(3);
		int expected = 1;
		assertEquals(expected, result);
	}
	@Test
	public void testSearchNegative() { //Tests to insure -1 is returned if the index is not found
		sl = new SimpleList();
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		int result = sl.search(8);
		int expected = -1;
		assertEquals(expected, result);
	}

	@Test
	public void testToString() { //Tests the toString method to make sure the string prints only count amount of items
		//fail("Not yet implemented");
		sl = new SimpleList();
		String expected = "4 3 2 1";
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		//sl.remove(1);
		//System.out.print(sl.toString());
		assertEquals(expected, sl.toString());
	}
	@Test
	public void testRemove() { //Tests the remove function to insure it removes entries and pushes everything over to fill the space
		//fail("Not yet implemented");
		sl = new SimpleList();
		String expected = "4 2 1";
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.remove(1);
		assertEquals(expected, sl.toString());
	}
	@Test
	public void testAddFullList() { //Tests the add function with a full list to insure new space is made
		//fail("Not yet implemented");
		sl = new SimpleList();
		String expected = "4 3 2 1 7 6 5 4 3 2 1";
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.add(5);
		sl.add(6);
		sl.add(7);
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		assertEquals(expected, sl.toString());
	}
	public void testSize() { //Tests to make sure the proper amount of size is added when more than 10 ints are added
		//fail("Not yet implemented");
		sl = new SimpleList();
		//String expected = "4 3 2 1 7 6 5 4 3 2 1";
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.add(5);
		sl.add(6);
		sl.add(7);
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		assertEquals(15, sl.size());
	}
	public void testLast() { //Tests to make sure the last is returned
		//fail("Not yet implemented");
		sl = new SimpleList();
		//String expected = "4 3 2 1 7 6 5 4 3 2 1";
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.add(5);
		sl.add(6);
		sl.add(7);
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		assertEquals(1, sl.last());
	}
	public void testFirst() { //Tests to make sure the first is returned
		//fail("Not yet implemented");
		sl = new SimpleList();
		//String expected = "4 3 2 1 7 6 5 4 3 2 1";
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.add(5);
		sl.add(6);
		sl.add(7);
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		assertEquals(4, sl.first());
	}
	public void testAppend() { //Tests to make sure the first is returned
		//fail("Not yet implemented");
		sl = new SimpleList();
		String expected = "4 3 2 1 7 6 5 4 3 2 1 7";
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.add(5);
		sl.add(6);
		sl.add(7);
		sl.add(1);
		sl.add(2);
		sl.add(3);
		sl.add(4);
		sl.add(7);
		assertEquals(expected, sl.toString());
	}
}
