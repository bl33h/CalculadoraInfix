public class ListStack <T> extends Stack<T>{
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: ListStack
    @version:
    - Creación: 04/03/2022
    - Última modificación:
    */
    
    private ListStack <T> list;

    public ListStack(int ListOption) {
        super();
		list = new ListStack<T>(ListOption);
	}

    @Override
    public void push(T value) {
    }

    @Override
    public T pull() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }


    @Override
    public int count() {
        return 0;
    }

    @Override
	public boolean isEmpty() {		
		return list.isEmpty();
	}

}

