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
        if (Count() == 1) //Si se elimina el único nodo
            {
                Node<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValue();
            }
            else
            {
                Node<T> pretemp = start;
                Node<T> temp = start.getNext();

                //Buscar donde insertar
                while (temp != null)
                {
                    pretemp = temp;
                    temp = temp.getNext();
                }

                //Eliminar el nodo
                end = pretemp;
                end.setNext(null);
                count--;
                return pretemp.getValue();
            }
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