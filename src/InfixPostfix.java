/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/
import java.util.Arrays;
public class InfixPostfix {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: InfixPostfix.java
    @version: 
        - Creacion: 04/03/2022
        - Ultima modificación: 04/03/2022

    Clase que convierte de infix a postfix
    */
    //---------------------------PROPIEDADES--------------------------
    private String[] operands = {"0", "1", "2","3","4","5","6","7","8","9"};
    private FactoryList<String> fList = new FactoryList<String>();
    private List<String> lst;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     * convierte la expresion infix a postfix
     * @param infixExpresion
     * @return
     */
    public String convert(String infixExpresion, Stack<String> stack, int listOption){
        String postfixExpresion = "";
        lst = fList.newList(listOption);
		boolean valid = false;
		
		//Validacion de parejas completas de parentesis ()
		int incomplete_pairs=0;
		for(int i=0; i<infixExpresion.length();i++) {
			if(infixExpresion.charAt(i)=='(') {
				incomplete_pairs++;
			}else if(infixExpresion.charAt(i)==')'){
				incomplete_pairs--;
			}
		}

        //Parejas completas
		if(incomplete_pairs==0) {
			valid = true;
		}else if (incomplete_pairs>0) {
			valid = false;
		}else if (incomplete_pairs<0) {
			valid = false;
		}
		
		//Se guardan los tokens de la expresion original
		String[] tokens = infixExpresion.split(" ");
		
		//Si se cumple la validacion
		if(valid) {
			for(int i = 0; i < tokens.length ; i++) {
				
				//Numeros del 0 al 9
	            if(Arrays.stream(operands).anyMatch(tokens[i]::equals)){
	                lst.InsertAtEnd(tokens[i]);
	            }
	            //Parentesis (
	            else if(tokens[i].equals("(")) {
	            	stack.push(tokens[i]);
	            }
	            //Parentesis )
	            else if(tokens[i].equals(")")) {
	            	//Hasta encontrar a su pareja
	            	while(!stack.isEmpty() && !stack.peek().equals("(")) {
	            			lst.InsertAtEnd(stack.pull());
	            	}
        			stack.pull();
	            }
	            //Operadores
	            else {
	            	while(!stack.isEmpty() && priorityOperator(stack.peek()) >= priorityOperator(tokens[i])) {
	            		lst.InsertAtEnd(stack.pull());
	            	}
	            	stack.push(tokens[i]);
	            }
			}
			
			while(!stack.isEmpty()){
	            lst.InsertAtEnd(stack.pull());
	        }
			
			//Se pasa de array al String resultado
			for(int i = 0; i < lst.Count() ; i++) {
				postfixExpresion += lst.Get(i) + " ";
			}
			
		}else {
			postfixExpresion = null;
		}
		
		return postfixExpresion;
    }
    //****************************************************************

    /*****************************************************************
     * indica la prioridad del operador (1 si es + o -; 2 si es * o /)
     * @param operator
     * @return
     */
    private int priorityOperator(String operator){
        int resultado = 0;
        if (operator.equals("+") || operator.equals("-"))
            resultado = 1;
        else if (operator.equals("*") || operator.equals("/"))
            resultado = 2;
        return resultado;
    }
    //****************************************************************
    
}
