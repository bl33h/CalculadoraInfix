public interface IStack<T> {
    /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: IStack
    @version:
    - Creacion: 04/03/2022
    - Ultima modificacion:04/03/2022
    Clase que sirve como vista hacia el usuario la cual imprimira a pantalla
    */

        void push(T value);
        
        T pull();
        
        T peek();
        
        int count();
        
        boolean isEmpty();
    }
