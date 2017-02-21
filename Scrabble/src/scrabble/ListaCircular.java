/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

/**
 *
 * @author Rod
 */
public class ListaCircular {
    private NodoCircular cabeza;
    public ListaCircular()
    {
        setCabeza(null);
    }
    public void insertar(String nombre, ListaSimple letras)
    {
        NodoCircular nuevo=new NodoCircular(nombre,letras);
        if(cabeza!=null)
        {
            nuevo.setSiguiente(cabeza.getSiguiente());
            cabeza.setSiguiente(nuevo);
            nuevo.setAnterior(cabeza);
        }
        setCabeza(nuevo);
        cabeza.getSiguiente().setAnterior(cabeza);
    }
    public void mostrar() {
        NodoCircular actual;
        System.out.println("Elementos de la lista");
        for (actual = getCabeza().getSiguiente(); actual != cabeza; actual = actual.getSiguiente()) {
            System.out.println(actual.getNombre());
        }
        System.out.println(actual.getNombre());
    }
    
    public boolean buscar(String nombre) {
        NodoCircular actual;
        if (cabeza!=null)
        {
            for (actual = getCabeza().getSiguiente(); actual != cabeza; actual = actual.getSiguiente()) {
                if (actual.getNombre().equalsIgnoreCase(nombre)) {
                    return true;
                }
            }
            if (cabeza.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        else
        {
            return false; 
        }
       return false; 
    }

    /**
     * @return the cabeza
     */
    public NodoCircular getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoCircular cabeza) {
        this.cabeza = cabeza;
    }
}
