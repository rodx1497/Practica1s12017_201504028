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
public class Cola {
    class Nodo
    {
        String letra;
        int puntuacion;
        Nodo sig;
    }
    public Nodo cabeza;
    private Nodo fondo;
    public Cola()
    {
        cabeza=null;
        fondo=null;
    }
    public void add(String ficha)
    {
        Nodo actual=new Nodo();
        actual.letra=ficha;
        //actual.puntuacion=puntuacion;
        if(colavacia()==true)
        {
            cabeza=actual;
            fondo=actual;
        }
        else
        {
            fondo.sig=actual;
            fondo=actual;
        }
    }
    public String sacar()
    {
        if(colavacia()==false)
        {
            String letra=cabeza.letra;
            if(cabeza==fondo)
            {
                cabeza=null;
                fondo=null;
            }
            else
            {
                cabeza=cabeza.sig;
            }
            return letra;
        }
        else
        {
            return "";
        }
        
    }
    public void mostrar()
    {
        Nodo reco=cabeza;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.letra+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
    public int cantidad()
    {
        int cantidad=0;
        Nodo reco=cabeza;
        
        while (reco!=null) {
            reco=reco.sig;
            cantidad++;
        }
        return cantidad;
    }
    public boolean colavacia()
    {
        if(cabeza==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
}
