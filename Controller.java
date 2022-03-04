public class Controller {
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: Controller
    @version:
    - Creación: 04/03/2022
    - Última modificación:
    Clase que sirve como controladora en el programa
    */
    public static void main(String[] args){

        int numMenu;
        int numMenu2;
        View miVista = new View();
        miVista.welcome(); //Despliegue el titulo del programa
        numMenu = -1;
        while(numMenu != 4){ //Despliega el menu principal
            numMenu = miVista.menu();
            numMenu2 = -1;
            switch(numMenu){
                case 1: //List
                while (numMenu2 != 3){
                    numMenu2 = miVista.menu2();
                    switch(numMenu2){
                        case 1:

                        break;
                        case 2:

                        break;
                        case 3:

                        break;
                    }
                }
                break;
                case 2:// Vector

                break;
                case 3: // Arraylist

                break;
                case 4: // Salir
                miVista.end();
                break;
            }
        }
    }
}