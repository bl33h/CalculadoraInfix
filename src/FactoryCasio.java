/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class FactoryCasio<T> {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: InfixPostfix.java
    @version: 
        - Creacion: 04/03/2022
        - Ultima modificación: 04/03/2022

    Clase que usa el patron Factory para la creacion de la pila
    */

    /*****************************************************************
     * crea una pila generica segun la opcion que se le manda
     * @param stackOption
     * @param listOption
     * @return
     */
    public Stack<T> newCasio(int stackOption, int listOption){
        Stack<T> stack = null;
        if (stackOption == 3)
            stack = new StackArrayList<T>();
        if (stackOption == 2)
            stack = new VectorStack<T>();
        if (stackOption == 1)
            stack = new ListStack<T>(listOption);
        return stack;
    }
    //****************************************************************
}
