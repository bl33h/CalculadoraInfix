/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class SingletonException extends RuntimeException {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: SingletonException.java
    @version: 
        - Creacion: 02/03/2022
        - Última modificacion: 

    Clase que arroja un error de ejecucion
    */

    /*****************************************************************
     * retorna error de ejecucion
     */
	public SingletonException(){
		super();
	}
    //****************************************************************
	
    /*****************************************************************
     * retorna error de ejecucion
     * @param s
     */
	public SingletonException(String s){
		super(s);
	}
    //****************************************************************
}
