package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class StackArrayListTest {

	@Test
	void PushEmptyListtest() {
		StackArrayList<String> testList = new StackArrayList<String>();
		testList.push("Hola mundo");
		assertEquals(testList.isEmpty(), false);
	}
	
	@Test
	void PeekListtest() {
		StackArrayList<String> testList = new StackArrayList<String>();
		testList.push("Hola mundo");
		assertEquals(testList.peek(), "Hola mundo");
	}
	
	@Test
	void PullListtest() {
		StackArrayList<String> testList = new StackArrayList<String>();
		testList.push("Hola");
		assertEquals(testList.pull(), "Hola");
	}
	
	@Test
	void CountListtest() {
		StackArrayList<String> testList = new StackArrayList<String>();
		testList.push("Hola");
		testList.push("Adios");
		assertEquals(testList.count(), 2);
	}
	
	@Test
	void IsEmptyListtest() {
		StackArrayList<String> testList = new StackArrayList<String>();
		testList.push("Hola");
		testList.push("Adios");
		assertEquals(testList.isEmpty(), false);
	}

}
