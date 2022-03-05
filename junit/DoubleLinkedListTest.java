package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoubleLinkedListTest {
	@Test
	void InsertAtEndEmptyListtest() {
		DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		assertEquals(testList.Get(0), "Hola");
	}
	
	
	@Test
	void InsertAtEndNonEmptyListtest() {
		DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		testList.InsertAtEnd("Mundo");
		assertEquals(testList.Get(0), "Hola");
		assertEquals(testList.Count(), 2);
		assertEquals(testList.Get(1), "Mundo");
	}
	@Test
	void DeleteAtEndNonEmptyOnlyOneElementListtest() {
		DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		assertEquals(testList.Count(), 1);
		assertEquals(testList.DeleteAtEnd(), "Hola");
		assertEquals(testList.Count(), 0);
	}
		
	@Test
	void DeleteAtEndNonEmptyManyElementsListtest() {
		DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		testList.InsertAtEnd("Mundo");
		assertEquals(testList.Count(), 2);
		assertEquals(testList.DeleteAtEnd(), "Mundo");
		assertEquals(testList.Count(), 1);
		assertEquals(testList.DeleteAtEnd(), "Hola");
		assertEquals(testList.Count(), 0);
	}


}
