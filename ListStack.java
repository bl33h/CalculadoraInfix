public class ListStack <T> extends Stack<T>{
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: ListStack
    @version:
    - Creación: 04/03/2022
    - Última modificación:
    */
    
    private List <T> list = null; // objeto

    /*****************************************************************
     * instancia la opcion de lista.
     * @param listOption
     */
    public ListStack(int listOption) {
        super();
		if (listOption == 1)
            list = new SingleLinkedList<T>();
        else if (listOption == 2)
            list = new DoubleLinkedList<T>();
	}
    //****************************************************************


    /*****************************************************************
     * inserta un valor al final.
     * @param value
     */
    @Override
    public void push(T value) {
        list.InsertAtEnd(value);
    }
    //****************************************************************

    /*****************************************************************
     * retorna el último valor ingresado y lo elimina de la pila.
     * @return T
     */
    @Override
    public T pull() {
        return list.DeleteAtEnd();
    }
    //****************************************************************

    /*****************************************************************
     * retorna el último valor de la pila.
     * @return T
     */
    @Override
    public T peek() {
        return list.Get(count()-1);
    }
    //****************************************************************

    /*****************************************************************
     * retorna el número de elementos en la pila.
     * @return int
     */
    @Override
    public int count() {
        return list.Count();
    }
    //****************************************************************

    /*****************************************************************
     * retorna el estado de la pila.
     * @return boolean
     */
    @Override
	public boolean isEmpty() {		
		return list.IsEmpty();
	}
    //****************************************************************

}

