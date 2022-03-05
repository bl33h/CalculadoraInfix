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
        - Creación: 04/03/2022
        - Última modificación: 

    Clase que usa el patrón Factory para la creación de la pila
    */

    /*****************************************************************
     * crea una pila genérica según la opción que se le manda
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
