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
        - Creacion: 04/03/2022
        - Ultima modificacion: 04/03/2022

    Clase abstracta de listas
    */

    //---------------------------PROPIEDADES--------------------------
    private int count;
    private Node<T> start;
    private Node<T> end;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     * elimina al final
     * @return
     */
    public void InsertAtStart(T value) {
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

    /*****************************************************************
     * elimina al final
     * @return
     */
    public T DeleteAtEnd() {
		if (!IsEmpty()) 
        {

            if (Count() == 1) //Solo hay un elemento
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

                //Buscar donde se elimina
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
        return null;
	}
    //****************************************************************

    /*****************************************************************
     * elimina al final
     * @return
     */
    public T DeleteAtStart() {
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
        else {
            end.setNext(newNode);
            end = newNode;
        }

        count++;
    }
    //****************************************************************

    /*****************************************************************
     * retorna el elemento que se le indica por indice
     * @param index
     * @return
     */
    public T Get(int index) {
	    if (!IsEmpty())
        {
            if (index == 0)
            {
                return start.getValue();
            }
            else if (index == (Count() - 1))
            {
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                Node<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }
        return null;
	}
    //****************************************************************
    
    /*****************************************************************
     * retorna si hay nodos
     * @return
     */
    public boolean IsEmpty() {
		return count == 0;
	}
    //****************************************************************

    /*****************************************************************
     * retorna el número de nodos
     * @return
     */
	public int Count() {
		return count;
	}
    //****************************************************************
}
