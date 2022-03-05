package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListStackTest {

	@Test
	void PushEmptyListtest() {
		ListStack testList = new ListStack(1);
		testList.push("Hola mundo");
		assertEquals(testList.isEmpty(), false);
	}
	
	@Test
	void PeekListtest() {
		ListStack testList = new ListStack(1);
		testList.push("Hola mundo");
		assertEquals(testList.peek(), "Hola mundo");
	}
	
	@Test
	void PullListtest() {
		ListStack testList = new ListStack(1);
		testList.push("Hola");
		assertEquals(testList.pull(), "Hola");
	}
	
	@Test
	void CountListtest() {
		ListStack testList = new ListStack(1);
		testList.push("Hola");
		testList.push("Adios");
		assertEquals(testList.count(), 2);
	}
	
	@Test
	void IsEmptyListtest() {
		ListStack testList = new ListStack(1);
		testList.push("Hola");
		testList.push("Adios");
		assertEquals(testList.isEmpty(), false);
	}
	
}
