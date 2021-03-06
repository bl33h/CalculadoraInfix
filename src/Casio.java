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
    - ultima modificación:04/03/2022
    Clase que sirve como paso de expresiones y lectura del archivo
    */
    private Calculator calculator = new Calculator();
    private Stack<String> operations = null;
    private Stack<Integer> stackInteger = null;
    private Stack<String> stackString = null;
    private boolean flag = false;

    //---------------------------METODOS------------------------------
    /*****************************************************************
     * instancia los stack y crea por patron singleton la calculadora
     * @param stackOption
     * @param listOption
     */
    public Casio(int stackOption, int listOption) throws SingletonException{
        if (flag) //Ya hay creada
            System.out.println("Ya ha sido creada la Calculadora");
        else{ //Se crea
            operations = (new FactoryCasio<String>()).newCasio(stackOption, listOption);
            stackInteger = (new FactoryCasio<Integer>()).newCasio(stackOption, listOption);
            stackString = (new FactoryCasio<String>()).newCasio(stackOption, listOption);
            flag = true;
        }
    }
    //****************************************************************

    /*****************************************************************
     * se ejecuta al finalizar
     */
    public void finalize() {
		flag = false; //reiniciar el indice
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
            while(reader.hasNextLine())
                operations.push(reader.nextLine());
            reader.close();
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
    public void doOperation(int listOption) throws FileNotFoundException{
        if(read())
            while(!this.operations.isEmpty()){
                String operation = this.operations.pull();
                int result = calculator.Evaluate(operation, stackInteger, stackString, listOption);
                System.out.println("Expresion en InFix: " + operation + "\n" + "Resultado: " + result + "\n"+ "\n");
            }
    }
    //****************************************************************
}
