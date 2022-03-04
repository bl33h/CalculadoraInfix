public class ListStack <T> extends Stack<T>{
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: ListStack
    @version:
    - Creación: 04/03/2022
    - Última modificación:
    */
    
    private List <T> list = null;

    public ListStack(int listOption) {
        super();
		if (listOption == 1)
            list = new SingleLinkedList<T>();
        else if (listOption == 2)
            list = new DoubleLinkedList<T>();
	}

    @Override
    public void push(T value) {
        list.InsertAtEnd(value);
    }

    @Override
    public T pull() {
        return list.DeleteAtEnd();
    }

    @Override
    public T peek() {
        return list.Get(count()-1);
    }


    @Override
    public int count() {
        return list.Count();
    }

    @Override
	public boolean isEmpty() {		
		return list.IsEmpty();
	}

}

