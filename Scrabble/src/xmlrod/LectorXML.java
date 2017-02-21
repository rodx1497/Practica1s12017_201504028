/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlrod;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import scrabble.ListaSimple;

/**
 *
 * @author Rod
 */
public class LectorXML {
public static ListaSimple Diccionario= new ListaSimple();
public static String dimensiones;
public static ListaSimple doble=new ListaSimple();
public static ListaSimple triple=new ListaSimple();

public void cargarXml(String direccion) throws JDOMException
{
    //Se crea un SAXBuilder para poder parsear el archivo
    SAXBuilder builder = new SAXBuilder();
    File xmlFile = new File(direccion); //aqui vas a poner direccion
    try
    {
        Document document = (Document) builder.build( xmlFile );
        Element raiz = document.getRootElement();
        
         //OBTENGO LAS DIMENSIONES
        Element dimension = raiz.getChild("dimension");
        dimensiones = dimension.getTextTrim();
        System.out.println(dimensiones);
        
        //OBTENGO TODO DEL TAG <DOBLES>
            List dobles = raiz.getChildren("dobles");
            Element casillaDoble = (Element) dobles.get(0);
            List coordenadasDoble = casillaDoble.getChildren();
          
            for ( int j = 0; j < coordenadasDoble.size(); j++ )
            {
                Element coordenada = (Element)coordenadasDoble.get( j );
                String x = coordenada.getChildTextTrim("x");
                String y = coordenada.getChildTextTrim("y");
                doble.insertar(x, y);
            }
            doble.imprimir2();
            
        //OBTENGO TODO DEL TAG TRIPLES
            List triples =  raiz.getChildren("triples");
            Element casillaTriples = (Element)triples.get(0);
            List coordenadasTriple = casillaTriples.getChildren();
          
            for ( int j = 0; j < coordenadasTriple.size(); j++ )
            {
                Element coordenada = (Element)coordenadasTriple.get( j );
                String x = coordenada.getChildTextTrim("x");
                String y = coordenada.getChildTextTrim("y");
                triple.insertar(x, y);
            }
            triple.imprimir2();

        //OBTENGO TODO DEL TAG <DICCIONARIO>
            Element diccionario = raiz.getChild("diccionario");
            List Palabras = diccionario.getChildren();
            
            for (int i = 0; i < Palabras.size(); i++) {
            Element Palabra = (Element)Palabras.get(i);
            String palabra = Palabra.getTextTrim();
            System.out.println(palabra);
            Diccionario.insertar(palabra);
            //AGREGO LAS PALABRAS A LA LISTA SIMPLE
        }
            //Diccionario.imprimir();
    } catch (IOException ex) {
        Logger.getLogger(LectorXML.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
