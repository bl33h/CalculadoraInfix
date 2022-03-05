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
        - Creacion: 02/03/2022
        - Ultima modificación: 04/03/2022

    Interfaz de listas
    */

    //---------------------------METODOS------------------------------
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
     * retorna el numero de nodos
     * @return
     */
    int Count();
    //****************************************************************
}
