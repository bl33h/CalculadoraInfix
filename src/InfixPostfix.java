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
        - Creación: 04/03/2022
        - Última modificación: 

    Clase que convierte de infix a postfix
    */

    //---------------------------PROPIEDADES--------------------------
    private String[] operands = {"0", "1", "2","3","4","5","6","7","8","9"};
    private String[] operators = {"+","-","*","/", "(", ")"};

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * convierte la expresión infix a postfix
     * @param infixExpresion
     * @return
     */
    public String convert(String infixExpresion, Stack<String> stack){
        String postfixExpresion = "";
        String[] values = infixExpresion.split(" "); //Separar los valores en la expresión

        for(int i = 0; i < values.length; i++){ //Recorrer toda la expresión
            if(Arrays.asList(operands).contains(values[i])) //Si es Número
                stack.push(values[i]);
            else if(Arrays.asList(operators).contains(values[i])){ //Si es Operador
                switch(values[i]){
                    case "(":
                        stack.push(values[i]);
                    break;
                    case ")":
                        while (!stack.isEmpty()){
                            String value = stack.pull();
                            if(value != "(")
                                postfixExpresion += value;
                            else
                                break;
                        }
                    break;
                    default:
                        if(!stack.isEmpty()){
                            while (!stack.isEmpty()){
                                String value = stack.pull();
                                if(value != "("){
                                    stack.push(value);
                                    break;
                                } else{
                                    if (priorityOperator(values[i]) > priorityOperator(value)){
                                        stack.push(value);
                                        break;
                                    }
                                    else 
                                        postfixExpresion += values[i];
                                }  
                            }
                            stack.push(values[i]);
                        } else
                            stack.push(values[i]);
                }
            }
        }
        while (!stack.isEmpty())
            postfixExpresion += stack.pull();
        
        return postfixExpresion;
    }
    //****************************************************************

    /*****************************************************************
     * indica la prioridad del operador (1 si es + ó -; 2 si es * ó /)
     * @param operator
     * @return
     */
    private int priorityOperator(String operator){
        int resultado = 0;
        if (operator == "+" || operator == "-")
            resultado = 1;
        else if (operator == "*" || operator == "/")
            resultado = 2;
        return resultado;
    }
    //****************************************************************
    
}
