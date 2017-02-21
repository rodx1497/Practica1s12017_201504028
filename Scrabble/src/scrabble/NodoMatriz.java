/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import javax.swing.JButton;

/**
 *
 * @author Rod
 */
public class NodoMatriz {
    private int posX;
    private int posY;
    private String palabra;
    private NodoMatriz derecha;
    private NodoMatriz izquierda;
    private NodoMatriz arriba;
    private NodoMatriz abajo;
    private JButton boton;
    
    public NodoMatriz()
    {
        this.palabra=palabra;
        derecha=null;
        izquierda=null;
        arriba=null;
        abajo=null;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the derecha
     */
    public NodoMatriz getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(NodoMatriz derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the izquierda
     */
    public NodoMatriz getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoMatriz izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the arriba
     */
    public NodoMatriz getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoMatriz arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public NodoMatriz getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoMatriz abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * @return the boton
     */
    public JButton getBoton() {
        return boton;
    }

    /**
     * @param boton the boton to set
     */
    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
    
}
