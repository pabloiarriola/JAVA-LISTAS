import javax.swing.JOptionPane;

public class ListasMain {
	private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    public ListaS() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
//Metodo utilizado para denotar que la lista se encuentra vacia.
    public boolean siVacio() {
        return (this.primero == null);
    }
//Metodo para agregar al final de la lista.
    public ListaS addLast(int dato) {
        if(siVacio()) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.nodoDer = nuevo;
        }
        else {
            Nodo nuevo = new Nodo(dato);
            nuevo.nodoDer = null;
            ultimo.nodoDer = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        return this;
    }
//Metodo para borrar al final de la lista.
    public Nodo removeLast() {
        Nodo eliminar = null;
        if(siVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
            return null;
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            Nodo actual = primero;
            while(actual.nodoDer != ultimo) {
                actual = actual.nodoDer;
            }
            eliminar = actual.nodoDer;
            actual.nodoDer = null;
            ultimo = actual;
        }
        this.tamano--;
        return eliminar;
    }
//Metodo que imprime el tamaño de la lista.
    public int size() {
        return this.tamano;
    }
//Metodo que imprime la lista y los valores ingresados.
   
       
   

}
