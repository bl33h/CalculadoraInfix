package junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class VectorStackTest{
	@Test
    public void PushTest(){
        VectorStack<String> vector = new VectorStack<String>();
        vector.push("Hola");
        assertEquals("Hola", vector.peek());
        assertEquals(1, vector.count());
        vector.push("Adios");
        assertEquals("Adios", vector.peek());
        assertEquals(2, vector.count());
    }

    @Test
    public void PullTest(){
        VectorStack<Boolean> vector = new VectorStack<Boolean>();
        vector.push(true);
        assertEquals(1, vector.count());
        assertEquals(true, vector.pull());
        assertEquals(0, vector.count());
        assertEquals(null, vector.pull());
    }

    @Test
    public void PeekTest(){
        VectorStack<Integer> vector = new VectorStack<Integer>();
        vector.push(21581);
        assertEquals(1, vector.count());
        assertEquals(21581, vector.peek());
        assertEquals(1, vector.count());
    }

    @Test
    public void CountTest(){
        VectorStack<Double> vector = new VectorStack<Double>();
        assertEquals(0, vector.count());
        vector.push(3.141592653589);
        assertEquals(1, vector.count());
        vector.pull();
        assertEquals(0, vector.count());
    }

    @Test
    public void IsEmpyTest(){
        VectorStack<Object> stack = new VectorStack<Object>();
        assertEquals(true, stack.isEmpty());
        stack.push(stack);
        assertEquals(false, stack.isEmpty());
        stack.pull();
        assertEquals(true, stack.isEmpty());
    }
}
