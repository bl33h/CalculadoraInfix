public class DoubleLinkedList<T> extends List<T> {
    
    //---------------------------PROPIEDADES--------------------------
    protected DoubleNode<T> start;
    protected DoubleNode<T> end;
    int count;

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */    
    public void InsertAtEnd(T value) {
        DoubleNode<T> newNode = new DoubleNode<T>(value);
		
		if (IsEmpty()) {
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} else {
			newNode.setNext(start);
			start.setPrevious(newNode);
			newNode.setPrevious(end);
			end.setNext(newNode);
			start = newNode;
		}
		
		count++;
    }
    //****************************************************************

    
    public T DeleteAtEnd() {
        // TODO Auto-generated method stub
        return null;
    }
    //****************************************************************
    
}
