package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.SingleLinkedList;

class SingleLinkedListTest {

	@Test
	void InsertAtStartEmptyListtest() {
		SingleLinkedList<Integer> testList = new SingleLinkedList<Integer>();
		testList.InsertAtEnd(3);
		assertEquals(testList.Get(0), 3);
	}
	
	@Test
	void InsertAtStartNonEmptyListtest() {
		SingleLinkedList<Integer> testList = new SingleLinkedList<Integer>();
		testList.InsertAtEnd(3);
		testList.InsertAtEnd(5);
		assertEquals(testList.Get(0), 5);
		assertEquals(testList.Count(), 2);
		assertEquals(testList.Get(1), 3);
	}
	
	@Test
	void InsertAtEndEmptyListtest() {
		SingleLinkedList<String> testList = new SingleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		assertEquals(testList.Get(0), "Hola");
	}
	
	@Test
	void InsertAtEndNonEmptyListtest() {
		SingleLinkedList<String> testList = new SingleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		testList.InsertAtEnd("Mundo");
		assertEquals(testList.Get(0), "Hola");
		assertEquals(testList.Count(), 2);
		assertEquals(testList.Get(1), "Mundo");
	}
	
	@Test
	void InsertAtIndexNonEmptyListtest() {
		SingleLinkedList<String> testList = new SingleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		testList.InsertAtEnd("Mundo");
		
		assertEquals(testList.Count(), 4);
		assertEquals(testList.Get(0), "Hola");
		assertEquals(testList.Get(3), "Mundo");
	}
	

	@Test
	void InsertAtIndexEmptyListtest() {
		SingleLinkedList<String> testList = new SingleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		assertEquals(testList.Count(), 1);
		assertEquals(testList.Get(0), "Hola");
	}

}