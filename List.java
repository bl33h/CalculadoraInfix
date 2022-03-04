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
        - Creación: 02/03/2022
        - Última modificación: 

    Clase abstracta de listas
    */

    //---------------------------PROPIEDADES--------------------------
    protected Node<T> start;
    protected Node<T> end;
    int count;

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */
    public abstract void InsertAtEnd(T value);
    //****************************************************************

    /*****************************************************************
     * elimina al final
     * @return
     */
    public abstract T DeleteAtEnd();
    //****************************************************************//****************************************************************

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
     * retorna el número de nodos
     * @return
     */
    public int Count() {
		return count;
	}
    //****************************************************************
}
