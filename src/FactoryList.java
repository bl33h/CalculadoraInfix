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
        - Creación: 04/03/2022
        - Última modificación: 

    Clase que usa el patrón Factory para la creación de la lista
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
