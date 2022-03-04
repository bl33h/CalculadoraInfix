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
    @author: José Pablo Kiesling Lange
    Nombre del programa: Node.java
    @version: 
        - Creación: 02/03/2022
        - Última modificación: 

    Interfaz de listas
    */

    void InsertAtEnd(T value);

    T DeleteAtEnd();

    boolean IsEmpty();
    
    int Count();
}
