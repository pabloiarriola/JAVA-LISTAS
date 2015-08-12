@@Lista DoblementeEnlazada

public class DoblementeEnlazada <E> {
	private int size; /*contador que indica cuantos nodos hay*/
	private NodoDoble cabeza;
	private NodoDoble cola;
	
	
	public int size(){
		return size;
	}
	
	public void addFirst(E valor){
		/*se cambia la cabeza de la lista*/
		/*se envia valor null a la posicion de nodo anterior por ser el primero*/
		/*si la lista no tiene ningun nodo*/
		if (cabeza== null){
			/*se envia null para direccion del siguiente nodo por no existir ninguno*/
			NodoDoble tempNodo = new NodoDoble( valor, null , null);
			cabeza = tempNodo;
			cola = tempNodo;
		}
		/*si la lista ya tiene un nodo*/
		else {
			NodoDoble tempNodo = new NodoDoble( valor, cabeza.get, null);
			cabeza = tempNodo
		}
	}
}
