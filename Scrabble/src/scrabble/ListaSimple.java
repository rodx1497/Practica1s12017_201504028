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
public class ListaSimple {
    private NodoSimple cabeza;
    public ListaSimple()
    {
        setCabeza(null);
    }
    public void insertar(String palabra)
    {
        NodoSimple nuevo=new NodoSimple(palabra);
        if(cabeza==null)
        {
            setCabeza(nuevo);
        }
        else
        {
            NodoSimple auxiliar=this.getCabeza();
            while(auxiliar.getSiguiente()!=null)
            {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    
    }
    public void insertar(String x, String y)
    {
        NodoSimple nuevo=new NodoSimple(x,y);
        if(cabeza==null)
        {
            setCabeza(nuevo);
        }
        else
        {
            NodoSimple auxiliar=this.getCabeza();
            while(auxiliar.getSiguiente()!=null)
            {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    public void imprimir()
    {
        for(NodoSimple actual=this.getCabeza();actual!=null; actual=actual.getSiguiente())
        {
                System.out.println(actual.getPalabra());
        }
    }
    public void imprimir2()
    {
        for(NodoSimple actual=this.getCabeza();actual!=null; actual=actual.getSiguiente())
        {
                System.out.println(actual.getX()+"," +actual.getY());
        }
    }
    

    /**
     * @return the cabeza
     */
    public NodoSimple getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoSimple cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
