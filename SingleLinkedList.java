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
    @author: José Pablo Kiesling Lange
    Nombre del programa: Node.java
    @version: 
        - Creación: 02/03/2022
        - Última modificación: 

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

                //Delete the node
                end = pretemp;
                end.setNext(null);
                count--;
                return temp.getValue();
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
