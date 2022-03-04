/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class DoubleNode<T> extends Node<T>{
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: DoubleNode.java
    @version: 
        - Creación: 02/03/2022
        - Última modificación: 

    Clase que sirve como nodo en la implementación de listas dobles 
    */ 

    //---------------------------PROPIEDADES--------------------------
    protected Node<T> previous;

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * constructor que asigna el valor del nodo
     * @param value
     */
    public DoubleNode(T value) {
        super(value);
    }
    //****************************************************************

    /*****************************************************************
     * retorna el valor del elemento previo al nodo
     * @return
     */
    public Node<T> getPrevious() {
		return previous;
	}
    //****************************************************************
	
    /*****************************************************************
     * asigna el valor al elemento previo al nodo
     * @param previous
     */
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
    //****************************************************************
}
