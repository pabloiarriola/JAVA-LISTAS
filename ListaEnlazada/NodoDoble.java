@@nodo doble

public class NodoDoble implements Nodo{
	private E prevNodo;
	
	public NodoDoble(E valor, E nextNodo, E prevNodo){
		this.prevNodo = prevNodo;		
	}
	
	public E prevNodo(){
		return prevNodo;
	}
}