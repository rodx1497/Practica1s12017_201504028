/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import java.util.Set;
import javax.swing.JButton;

/**
 *
 * @author Rod
 */
public class MatrizOrtogonal {
    private NodoMatriz cabeza;
    private int tamano;
    public MatrizOrtogonal(int tamano)
    {
        //setCabeza(null);
        this.tamano=tamano;
    }
    
    public void insertar()
    { //Le envias la dimension, lo que hace el mÃ©todo es solo crear las "casillas"
        for (int Y=0 ; Y<tamano ; Y++)
        { //Recorre las filas
             for (int X=0 ; X<tamano ; X++)
             { //recorre columnas
                 NodoMatriz nuevo = new NodoMatriz(); //crea el nodo
                 nuevo.setPosX(X); //trabaje con posiciones
                 nuevo.setPosY(Y);
                 nuevo.setBoton(new JButton());
                 if(X==0 && Y==0)
                 {
                     cabeza=nuevo;
                 }
                 else
                 {
                     NodoMatriz actual=null;
                     if(X>0)
                     {
                         actual=buscar(0,Y);
                         while(actual.getDerecha()!=null)
                         {
                             actual=actual.getDerecha();
                         }
                         actual.setDerecha(nuevo);
                         nuevo.setIzquierda(actual);
                     }
                     else
                     {
                         actual=nuevo;
                     }
                     if(Y>0)
                     {
                          NodoMatriz actual2=buscar(X,Y-1);
                          actual2.setAbajo(nuevo);
                          nuevo.setArriba(actual2);
                         
                         
                     }
                 }
             
                        
            }
         }                
     }              
    public NodoMatriz buscar(int PosX, int Posy)
    {
        NodoMatriz actual=cabeza;
        for(int y=0; y<tamano; y++)
        {
            if(Posy==actual.getPosY())
            {
                y=tamano+1;
            }
            else
            {
                actual=actual.getAbajo();
            }
        }
        for(int x=0; x<tamano; x++)
        {
            if(PosX==actual.getPosX())
            {
                x=tamano+1;
            }
            else
            {
                actual=actual.getDerecha();
            }
        }
        return actual;
    }
    public void imprimir()
      {
          NodoMatriz auxiliar=cabeza;
          for (int posY=0 ; posY<tamano; posY++)
          {
              auxiliar = buscar(0,posY);
                for (int posX=0 ; posX<tamano; posX++){
                    System.out.print("<-"+auxiliar.getPosX()+","+auxiliar.getPosY()+"->");
                    auxiliar=auxiliar.getDerecha();
            }
                System.out.println("");
          }
      }
    

    /**
     * @return the cabeza
     */
    public NodoMatriz getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoMatriz cabeza) {
        this.cabeza = cabeza;
    }
    
    
}
