package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.SingleLinkedList;

class SingleLinkedListTest {

	
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
		assertEquals(testList.Get(0), "Mundo");
		assertEquals(testList.Count(), 2);
		assertEquals(testList.Get(1), "Hola");
	}
	
	@Test
	void DeleteAtEndNonEmptyOnlyOneElementListtest() {
		SingleLinkedList<String> testList = new SingleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		assertEquals(testList.Count(), 1);
		assertEquals(testList.DeleteAtEnd(), "Hola");
		assertEquals(testList.Count(), 0);
	}
	
	@Test
	void DeleteAtEndNonEmptyManyElementsListtest() {
		SingleLinkedList<String> testList = new SingleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		testList.InsertAtEnd("Mundo");
		assertEquals(testList.Count(), 2);
		assertEquals(testList.DeleteAtEnd(), "Mundo");
		assertEquals(testList.Count(), 1);
		assertEquals(testList.DeleteAtEnd(), "Hola");
		assertEquals(testList.Count(), 0);
	}

}