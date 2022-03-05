import java.util.Vector;
public class VectorStack <T> extends Stack <T>{
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: VectorStack
    @version:
    - Creacion: 04/03/2022
    - Ultima modificacion:04/03/2022
    */

    //---------------------------PROPIEDADES--------------------------
    private Vector<T> vector;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     * Stack: instancia el vector
     */
    public VectorStack (){
        vector = new Vector<T>();
    }
    //****************************************************************

    /*****************************************************************
     * push: agrega un elemento genérico
     * @param value 
     */
    @Override
    public void push(T value) {
        vector.add(value);
    }
    //****************************************************************

    /*****************************************************************
     * pull: retorna el ultimo valor ingresado y lo elimina de la pila
     * @return T
     */
    @Override
    public T pull() {
        T value;
        if (isEmpty()) //Si la pila esta vacía
            value = null;
        else{ //Si se tiene algun elemento
            value = peek();
            vector.remove(vector.get(count()-1));
        }
        return value;
    }
    //****************************************************************

    /*****************************************************************
     * peek: retorna el ultimo valor de la pila
     * @return T
     */
    @Override
    public T peek() {
        return vector.lastElement();
    }
    //****************************************************************

    /*****************************************************************
     * count: retorna el numero de elementos en la pila
     * @return int
     */
    @Override
    public int count() {
        return vector.size();
    }
    //****************************************************************

    /*****************************************************************
     * isEmpty: retorna el estado de la pila
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
    //****************************************************************
}
