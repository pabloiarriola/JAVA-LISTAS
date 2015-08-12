@@Nodo

public class Nodo<E>{
	private E valor; /*almacena el valor a guardar*/
	private E nextNodo; /*contiene la referencia al siguiente nodo*/
	
	public Nodo(E valor, E nextNodo){
		this.valor = valor;
		this.nextNodo = nextNodo;
	}
	
	public E getValor(){
		return valor;
	}
	public E getNextNodo(){
		return nextNodo;
	}
	
	public void setNextNodo(E nodo){
		nextNodo = nodo;
	}
	
}