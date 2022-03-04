/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class SingleLinkedList<T> extends List<T> {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: SingleLinkedList.java
    @version: 
        - Creacion: 02/03/2022
        - Última modificacion: 

    Clase abstracta de listas
    */

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * elimina al final
     * @return
     */
    public T DeleteAtEnd() {
		if (!IsEmpty())
        {
            Node<T> temp = start;
            start = start.getNext();
            count--;
            return temp.getValue();
        }

        return null;
	}

    //****************************************************************

    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */
    public void InsertAtEnd(T value) {
		Node<T> newNode = new Node<T>(value);

        if (IsEmpty())
        {
            start = newNode;
            end = newNode;
        }
        else
        {
            newNode.setNext(start);
            start = newNode;
        }
        count++;
    }
    //****************************************************************
}
