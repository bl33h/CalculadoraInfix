import java.util.ArrayList; // importaciones

public class StackArrayList<T> extends Stack<T>{

      /**
    * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria Jose Pablo Kiesling
    * @author Fabian Juarez, Sara Echeverria y Jose Pablo Kiesling
    * FileName: IStack
    @version:
    - Creacion: 04/03/2022
    - Ultima modificacion:04/03/2022
    Clase que sirve como vista hacia el usuario la cual imprimira a pantalla
    */

    private ArrayList<T> arrayList;
	
	public StackArrayList() {
		arrayList = new ArrayList<T>();
	}
	
	@Override
	public void push(T value) {		
		arrayList.add(0, value);
	}

	@Override
	public T pull() {
		return arrayList.remove(0);
	}

	@Override
	public T peek() {
		return arrayList.get(0);
	}

	@Override
	public int count() {
		return arrayList.size();
	}

	@Override
	public boolean isEmpty() {		
		return arrayList.isEmpty();
	}

}
