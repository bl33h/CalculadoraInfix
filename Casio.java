import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Casio {
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: Casio
    @version:
    - Creación: 04/03/2022
    - Última modificación:
    Clase que sirve como paso de expresiones y lectura del archivo
    */
    private Calculator calculator = new Calculator();
    private Stack<String> operations = null;
    //---------------------------METODOS------------------------------
    /*****************************************************************
     * instancia el stack
     * @param stackOption
     * @param listOption
     */
    public Casio(int stackOption, int listOption){
        if (stackOption == 3)
            operations = new StackArrayList<String>();
        if (stackOption == 2)
            operations = new VectorStack<String>();
        if (stackOption == 1)
            operations = new ListStack<String>(listOption);
    }
    //****************************************************************

    /*****************************************************************
	 * FileReader: Lee el archivo.
     * @return boolean
     * @throws FileNotFoundException
     */
    private boolean read() throws FileNotFoundException{
        boolean read = false;
        try{
            read = true;
            File file = new File("datos.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                operations.push(reader.nextLine());
                reader.close();
            }
        }catch(FileNotFoundException e){
            String s = "Casio.read:" + e.getMessage();
            throw new FileNotFoundException(s);
        }
        return read;
    }
    //****************************************************************

    /*****************************************************************
    /**
     * doOperation: hace operaciones cargadas en la pila
     * @return String
     * @throws FileNotFoundException
     */
    public void doOperation() throws FileNotFoundException{

        if(read())
            while(!this.operations.isEmpty()){
                String operation = this.operations.pull();
                int result = calculator.Evaluate(operation);
                System.out.println(operation + "\n" + result + "\n"+ "\n");
            }
    }
    //****************************************************************
}
