@@Lista DoblementeEnlazada

public class DoblementeEnlazada <E> {
	private int size; /*contador que indica cuantos nodos hay*/
	private NodoDoble cabeza = null;
	private NodoDoble cola = null;
	
	/*obtiene la cantida de nodos*/
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
			size++;
		}
		/*si la lista ya tiene un nodo*/
		else {
			/*cabeza, hace referencia a la vieja cabeza*/
			NodoDoble tempNodo = new NodoDoble( valor, null, cabeza);
			/*se cambia el valor anterior de la cabeza a la nueva cabeza*/
			cabeza.setPrevNodo(tempNodo);
			/*se asigna la nueva cabeza y se suma el elemento*/
			cabeza = tempNodo;
			size++;
		}
		
	}
	public E removeFirst(){
		/*cambiar la direccion prev del elemento siguiente a la cabeza*/
		cabeza = cabeza.getNextNodo();
		/*se cambia la referencia al anterior del elemento a null para eliminar la cabeza y generar una nueva*/
		cabeza.setPrevNodo(null);
		size--;
	}
	
	public void addLast (E valor){
		/*se crea el nuevo nodo*/
		NodoDoble tempNodo = new NodoDoble (valor, cola , null)
		/*se cambia la referencia de siguiente nodo de la cola vieja*/
		cola.setNextNodo(tempNodo);
		/*se cambia la cola por el nuevo nodo creado*/
		cola = tempNodo;
		/*se agrega un elemento*/
		size++;
	}
	
	public E removeLast(){
		/*se obtiene el nodo anterior a la cola y se asigna como la nueva cola*/
		cola = cola.prevNodo();
		/*se cambia la referencia al siguiente elemento por null para eliminar la cola vieja*/
		cola.setNextNodo(null);
	}
	
	public E getFirst (){
		return cabeza;
	}
	
	public E getLast (){
		return cola;
	}
	
	public boolean contains (E valor){
		/*se crea el finger*/
		NodoDoble finger = head;
		/*se recorren los nodos*/
		while (finger.getNextNodo!= null && (figer.getValor).equals(valor) == false ){
			finger = finger.getNextNodo();
			
		}
		
		/*se retorna false por no encontrar valor*/
		if (finger.getNextNodo == null){
			return false;
		}
		
		if ((finger.getvalor).equals(valor) == true){
			return true;
		}
		
	}
	
}
