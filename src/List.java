/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public abstract class List<T> implements IList<T> {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: List.java
    @version: 
        - Creacion: 04/03/2022
        - Ultima modificación:04/03/2022

    Clase abstracta de listas
    */
    //---------------------------PROPIEDADES--------------------------
    private int count;
    private Node<T> start;
    private Node<T> end;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */
    public abstract void InsertAtEnd(T value);
    //****************************************************************

    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */
    public abstract void InsertAtStart(T value);
    //****************************************************************

    /*****************************************************************
     * elimina al final
     * @return
     */
    public abstract T DeleteAtEnd();
    //****************************************************************

    /*****************************************************************
     * elimina al inicio
     * @return
     */
    public abstract T DeleteAtStart();
    //****************************************************************

    /*****************************************************************
     * retorna el elemento que se le indica por indice
     * @param index
     * @return
     */
    public T Get(int index){
        if (!IsEmpty())
        {
            if (index == 0) //Si quiere el primero
                return start.getValue();
            else if (index == (Count() - 1))
                return end.getValue();
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
                    return temp.getValue();
                else
                    return null;
            }
            else
                return null;
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
     * retorna el numero de nodos
     * @return
     */
    public int Count() {
		return count;
	}
    //****************************************************************
}
