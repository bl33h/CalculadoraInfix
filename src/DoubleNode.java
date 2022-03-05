/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class DoubleNode<T>{
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: DoubleNode.java
    @version: 
        - Creación: 04/03/2022
        - Última modificación:04/03/2022

    Clase que sirve como nodo en la implementacion de listas dobles 
    */ 

    //---------------------------PROPIEDADES--------------------------
    private T value;
	private DoubleNode<T> next;
	private DoubleNode<T> previous;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     * constructor que asigna el valor del nodo
     * @param value
     */
    public DoubleNode(T value) {
        this.setValue(value);
    }
    //****************************************************************

    /*****************************************************************
     * asigna un valor pasado como parametro
     * @param value
     */
    public void setValue(T value) {
		this.value = value;
	}
    //****************************************************************

    /*****************************************************************
     * retorna el valor del nodo
     * @return
     */
    public T getValue(){
        return this.value;
    }
    //****************************************************************

    /*****************************************************************
     * retorna el valor del elemento siguiente al nodo
     * @return
     */
    public DoubleNode<T> getNext() {
		return next;
	}
    //****************************************************************

    /*****************************************************************
     * asigna el valor del siguiente elemento al nodo
     * @param next
     */
    public void setNext(DoubleNode<T> next) {
		this.next = next;
	}
    //****************************************************************

    /*****************************************************************
     * retorna el valor del elemento previo al nodo
     * @return
     */
    public DoubleNode<T> getPrevious() {
		return previous;
	}
    //****************************************************************
	
    /*****************************************************************
     * asigna el valor al elemento previo al nodo
     * @param previous
     */
	public void setPrevious(DoubleNode<T> previous) {
		this.previous = previous;
	}
    //****************************************************************
}
