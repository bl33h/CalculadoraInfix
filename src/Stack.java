public abstract class Stack<T> implements IStack<T> {
   /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: Stack
    @version:
    - Creación: 04/03/2022
    - Última modificación:04/03/2022
    Clase que sirve como vista hacia el usuario la cual imprimira a pantalla
    */
    
    public abstract void push(T value); 

    public abstract T pull(); 

    public abstract T peek(); 

    public abstract int count();

    public abstract boolean isEmpty();

}
