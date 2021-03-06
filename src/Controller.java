public class Controller {
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: Controller
    @version:
    - Creación: 04/03/2022
    - Ultima modificación:04/03/2022
    Clase que sirve como controladora en el programa
    */

    static Casio casio = null;
    public static void main(String[] args){
        int numMenu;
        int numMenu2 = -1;
        View miVista = new View();
        miVista.welcome(); //Despliegue el titulo del programa
        numMenu = -1;
        try{
            boolean flag = true;
            while(numMenu != 4 && flag){ //Despliega el menu principal
                numMenu = miVista.menu();
                numMenu2 = -1;
                switch(numMenu){
                    case 1: //List
                    while (numMenu2 != 3 && flag){
                        numMenu2 = miVista.menu2();
                        switch(numMenu2){
                            case 1:
                                casio = new Casio(numMenu, numMenu2);
                                flag = false;
                            break;
                            case 2:
                                casio = new Casio(numMenu, numMenu2);
                                flag = false;
                            break;
                        }
                    }
                    break;
                    case 2:// Vector
                        casio = new Casio(numMenu, 0);
                        flag = false;
                    break;
                    case 3: // Arraylist
                        casio = new Casio(numMenu, 0);
                        flag = false;
                    break;
                    case 4: // Salir
                        miVista.end();
                        casio.finalize();
                    break;
                }
            }
            if(numMenu2 != 1)
                numMenu2 = 2;
            casio.doOperation(numMenu2);
        } catch (Exception e) {
            String s = "ERROR: " + e.getMessage();
            miVista.error(s);
        }
    }
}