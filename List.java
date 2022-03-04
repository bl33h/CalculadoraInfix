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
    @author: José Pablo Kiesling Lange
    Nombre del programa: Node.java
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
