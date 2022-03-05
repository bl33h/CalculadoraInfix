/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Node<T>{
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: Node.java
    @version: 
        - Creacion: 02/03/2022
        - Ultima modificacion: 04/03/2022

    Clase que sirve como nodo en la implementacion de listas y arreglos dinamicos
    */ 

    //---------------------------PROPIEDADES--------------------------
    protected T value;
	protected Node<T> next;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     * constructor que asigna el valor del nodo
     * @param value
     */
    public Node(T value) {
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
    public Node<T> getNext() {
		return next;
	}
    //****************************************************************

    /*****************************************************************
     * asigna el valor del siguiente elemento al nodo
     * @param next
     */
    public void setNext(Node<T> next) {
		this.next = next;
	}
    //****************************************************************
}