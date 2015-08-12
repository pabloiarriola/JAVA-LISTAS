@@nodo doble

public class NodoDoble implements Nodo{
	private E prevNodo;
	
	public NodoDoble(E valor, E prevNodo, E nextNodo){
		this.prevNodo = prevNodo;		
	}
	
	public E prevNodo(){
		return prevNodo;
	}
	
	public void setPrevNodo(E prev){
		prevNodo = prev;
	}
}