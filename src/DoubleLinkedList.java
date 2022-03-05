/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class DoubleLinkedList<T> extends List<T>{
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: DoubleLinkedList.java
    @version: 
        - Creación: 02/03/2022
        - Última modificación: 

    Clase abstracta de listas
     */
    
    //---------------------------PROPIEDADES--------------------------
    private DoubleNode<T> start;
	private DoubleNode<T> end;
	private int count;

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * instancia los valores
     */
    public DoubleLinkedList(){
        start = null;
		end = null;
		count = 0;
    }
    //****************************************************************

    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */    
    public void InsertAtStart(T value) {
		DoubleNode<T> newNode = new DoubleNode<T>(value);
		
		if (IsEmpty()) {
		
			start = newNode;
			end = newNode;
			start.setNext(start);
			start.setPrevious(start);
		} else {
			
			newNode.setNext(start);
			start.setPrevious(newNode);
			newNode.setPrevious(end);
			end.setNext(newNode);
			start = newNode;
		}
		
		count++;
	}
    //****************************************************************
    
    /*****************************************************************
     * inserta un elemento al final
     * @param value
     */    
    public void InsertAtEnd(T value) {
		
        DoubleNode<T> newNode = new DoubleNode<T>(value);
            
            if (IsEmpty()) {
            
                start = newNode;
                end = newNode;
                start.setNext(start);
                start.setPrevious(start);
            } else {
                
                newNode.setPrevious(end);
                newNode.setNext(start);
                start.setPrevious(newNode);
                end.setNext(newNode);
                end = newNode;
            }
            
            count++;
            
        }
    //****************************************************************

    /*****************************************************************
     * elimina el elemento al final
     * @return
     */
    public T DeleteAtEnd() {
        return null;
    }
    //****************************************************************

    /*****************************************************************
     * elimina el elemento al final
     * @return
     */
    public T DeleteAtStart() {
		if (!IsEmpty()) {
			
			if (Count() == 1) {
				DoubleNode<T> temp = start;
				start = null;
				end = null;
				count--;
				return temp.getValue();
			} else {
				DoubleNode<T> temp = start;
				end.setNext(temp.getNext());
				temp.getNext().setPrevious(end);
				start = temp.getNext();
				count--;
				return temp.getValue();
			}
			
		} else {
			return null;
		}
	}
    //****************************************************************

    /*****************************************************************
     * retorna el elemento que se le indica por indice
     * @param index
     * @return
     */
    public T Get(int index) {
	    if (!IsEmpty())
        {
            if (index == 0)
            {
                return start.getValue();
            }
            else if (index == (Count() - 1))
            {
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                DoubleNode<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
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
