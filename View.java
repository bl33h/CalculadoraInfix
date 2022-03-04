import java.util.Scanner;
public class View{
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: View
    @version:
    - Creación: 04/03/2022
    - Última modificación:
    Clase que sirve como vista hacia el usuario la cual imprimira a pantalla
    */

    //---------------------------PROPIEDADES--------------------------
    private Scanner scan;

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     *
     */
    public void welcome() {
        System.out.println("------------- Bienvenido/bienvenida a su calculadora de archivo infix ---------------- "); // Titulo
        System.out.println("------------- Estamos abriendo su archivo datos.txt ---------------- "); // mensaje
    }
    //****************************************************************

    /*****************************************************************
     *
     */
    public View(){
        scan = new Scanner(System.in); // Scanner
    }
    //****************************************************************

    /*****************************************************************
     * retorna el valor del elemento seleccionado por el usuario
     * @return
     */
    public int menu(){ //Menu principal para que el usuario eliga la opcion a realizar
        String salir = "";
        int numMenu = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un numero del menu
            System.out.println("\n************************* Escoja el stack que desea utilizar ************************************\n");
            System.out.println("1. List");
            System.out.println("2. Vector");
            System.out.println("3. Arraylist");
            System.out.println("4. Salir");
            System.out.println("\n************ Por, favor elija la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();

            // Se verifica que el numero que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu < 1 || numMenu > 4) {
                System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 4");
                tmpTexto = scan.nextLine();
                isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
                numMenu = 0;
                if (isNumeric&&!tmpTexto.isEmpty()){
                    numMenu = Integer.parseInt(tmpTexto);
                    salir = "si";
                    }
                }
            }
        return numMenu;
    }
    //****************************************************************

        /*****************************************************************
     * retorna el valor del elemento seleccionado por el usuario
     * @return
     */
    public int menu2(){ //Menu secundario para que el usuario eliga la opcion a realizar
        String salir = "";
        int numMenu = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un numero del menu
            System.out.println("\n************************* Escoja que tipo de lista que desea utilizar ************************************\n");
            System.out.println("1. DoubleLinkedlist");
            System.out.println("2. SingleLinkedList");
            System.out.println("3. Salir");
            System.out.println("\n************ Por, favor elija la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();

            // Se verifica que el numero que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu < 1 || numMenu > 3) {
                System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 3");
                tmpTexto = scan.nextLine();
                isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
                numMenu = 0;
                if (isNumeric&&!tmpTexto.isEmpty()){
                    numMenu = Integer.parseInt(tmpTexto);
                    salir = "si";
                    }
                }
            }
        return numMenu;
    }
    //****************************************************************

    /*****************************************************************
     * Mensaje que dara al finalizar el programa
     */
    public void end(){
        System.out.println(" ------------ Gracias por utilizar nuestro programa ------------ \n"); // Mensaje que se mostrara al cerrar el programa
        System.exit(0);
        scan.close();
    }
    //****************************************************************

    /*****************************************************************
     * Asigna un valor pasado como parametro
     * @param e
     */
    public void error(String e){
        System.out.println(e); // Mensaje de error
    }
    //****************************************************************

    /*****************************************************************
     * Asigna un mensaje a mostrar en pantalla
     *@param mensaje
     */
    public void output(String mensaje){
        System.out.println(mensaje); //mensaje que se le imprimira al usuario
    }
    //****************************************************************
}
