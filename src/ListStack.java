public class ListStack <T> extends Stack<T>{
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: ListStack
    @version:
    - Creacion: 04/03/2022
    - Ultima modificación:04/03/2022
    */
    
    private List<T> list = null; 

    /*****************************************************************
     * instancia la opcion de lista.
     * @param listOption
     */
    public ListStack(int listOption) {
		this.list = (new FactoryList<T>()).newList(listOption);
	}
    //****************************************************************

    /*****************************************************************
     * inserta un valor al final.
     * @param value
     */
    @Override
    public void push(T value) {
        list.InsertAtStart(value);
    }
    //****************************************************************

    /*****************************************************************
     * retorna el ultimo valor ingresado y lo elimina de la pila.
     * @return T
     */
    @Override
    public T pull() {
        return list.DeleteAtStart();
    }
    //****************************************************************

    /*****************************************************************
     * retorna el ultimo valor de la pila.
     * @return T
     */
    @Override
    public T peek() {
        return list.Get(0);
    }
    //****************************************************************

    /*****************************************************************
     * retorna el numero de elementos en la pila.
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

