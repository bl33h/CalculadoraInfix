/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public interface IList<T> {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: IList.java
    @version: 
        - Creación: 02/03/2022
        - Última modificación: 

    Interfaz de listas
    */

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */
    void InsertAtEnd(T value);
    //****************************************************************

    /*****************************************************************
     * elimina al final
     * @return
     */
    T DeleteAtEnd();
    //****************************************************************

    /*****************************************************************
     * retorna si hay nodos
     * @return
     */
    boolean IsEmpty();
    //****************************************************************
    
    /*****************************************************************
     * retorna el elemento que se le indica por indice
     * @param index
     * @return
     */
    public T Get(int index);
    //****************************************************************

    /*****************************************************************
     * retorna el número de nodos
     * @return
     */
    int Count();
    //****************************************************************
}
