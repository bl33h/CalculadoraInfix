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

public class Calculator {
    /**
    * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
    * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
    Nombre del programa: InfixPostfix.java
    @version: 
        - Creacion: 04/03/2022
        - Última modificacion:04/03/2022

    Clase que calcula la expresion
    */
    //---------------------------PROPIEDADES--------------------------
    private InfixPostfix converter;
    private String[] operands = {"0", "1", "2","3","4","5","6","7","8","9"};
    private String[] operators = {"+","-","*","/"};

    /*****************************************************************
	 * Evaluate: evalua la expresion ingresada y retorna el resultado
	 * @param expresion
	 * @return int
     * @Override
	 */
    public int Evaluate(String expresion, Stack<Integer> stack, Stack<String> stackString, int listOption){
        converter = new InfixPostfix();
        String postfixExpresion = converter.convert(expresion, stackString,listOption);
        System.out.println("Expresion en PostFix: " + postfixExpresion);
        boolean flag = true;
        int num1, num2, result = 0;
        String[] values = postfixExpresion.split(" "); //Separar los valores en la expresión
        
        for(int i = 0; i < values.length && flag; i++){ //Recorrer toda la expresión
                
            if(Arrays.asList(operands).contains(values[i])) //Si es Numero
                stack.push(Integer.parseInt(values[i]));

            else if(Arrays.asList(operators).contains(values[i])){ //Si es Operador
                if (stack.count() >= 2){ //Si hay dos o mas en la pila es porque se pueden hacer operaciones

                    //Sacar los dos ultimos numeros ingresados
                    num2 = stack.pull();
                    num1 = stack.pull();
                    switch(values[i]){
                        case "+": //Suma
                            stack.push(num1 + num2);
                        break;

                        case "-": //Resta
                            stack.push(num1 - num2);
                        break;

                        case "*": //Multiplicacion
                            stack.push(num1 * num2);
                        break;

                        case "/": //Division
                            if (num2 != 0) //Si el segundo numero es distinto de cero se puede hacer la division
                                stack.push(num1 / num2);
                            else{ //Division indefinida
                                stack.push(9999);
                                System.out.println("¡ERROR! División entre cero!");
                                flag = false;
                            }
                        break;

                    }
                }
                else{ //Faltan numeros
                    System.out.println("¡ERROR! Le han faltado operandos!");
                    flag = false;
                }
            }
            else{ //No ingreso numeros ni operadores
                stack.push(9999);
                System.out.println("¡ERROR! Ha ingresado un carácter inválido!");
                flag = false;
            }
        }
        if (stack.count() == 1 && flag) //Si ya solo queda un elemento en la pila
            result = stack.pull();
        else if (!flag) //Si queda mas de un elemento es porque faltaron operadores
            stack.push(9999);
        else {
            System.out.println("¡ERROR! Le han faltado operadores!");
            flag = false;
        }
        if (flag) //Si la operación es valida
            return result;
        else //Existio algun error respecto a la operación (sintaxis o logica)
            return 9999;
    }
    //****************************************************************
}
