import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoubleLinkedListTest {

	@Test
	void InsertAtStartEmptyListtest() {
		DoubleLinkedList<Integer> testList = new DoubleLinkedList<Integer>();
		testList.InsertAtEnd(3);
		assertEquals(testList.Get(0), 3);
	}
	
	@Test
	void InsertAtStartNonEmptyListtest() {
		DoubleLinkedList<Integer> testList = new DoubleLinkedList<Integer>();
		testList.InsertAtEnd(3);
		testList.InsertAtEnd(5);
		assertEquals(testList.Get(0), 5);
		assertEquals(testList.Count(), 2);
		assertEquals(testList.Get(1), 3);
	}
	
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
	void InsertAtIndexNonEmptyListtest() {
		DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		testList.InsertAtEnd("Mundo");
		testList.InsertAtEnd("UVG");
		testList.InsertAtEnd("GT");
		
		assertEquals(testList.Count(), 4);
		assertEquals(testList.Get(0), "Hola");
		assertEquals(testList.Get(1), "GT");
		assertEquals(testList.Get(2), "UVG");
		assertEquals(testList.Get(3), "Mundo");
	}
	

	@Test
	void InsertAtIndexEmptyListtest() {
		DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		assertEquals(testList.Count(), 1);
		assertEquals(testList.Get(0), "Hola");
	}
	
	@Test
	void DeleteAtStartNonEmptyOnlyOneElementListtest() {
		DoubleLinkedList<String> testList = new DoubleLinkedList<String>();
		testList.InsertAtEnd("Hola");
		assertEquals(testList.Count(), 1);
		assertEquals(testList.DeleteAtEnd(), "Hola");
		assertEquals(testList.Count(), 0);
	}
	
	@Test
	void DeleteAtStartNonEmptyManyElementsListtest() {
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
