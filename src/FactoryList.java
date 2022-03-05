/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class FactoryList<T> {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: FactoryList.java
    @version: 
        - Creacion: 04/03/2022
        - Ultima modificación: 04/03/2022

    Clase que usa el patron Factory para la creacion de la lista
    */

    /*****************************************************************
     * 
     * @param listOption
     * @return
     */
    public List<T> newList(int listOption){
        List<T> list = null;
        if (listOption == 2)
            list = new SingleLinkedList<T>();
        else if (listOption == 1)
            list = new DoubleLinkedList<T>();
        return list;
    }
    //****************************************************************
}
