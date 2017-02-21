/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import xmlrod.LectorXML;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdom2.JDOMException;

/**
 *
 * @author Dénilson Argueta
 */
public class LeerArchivo extends javax.swing.JFrame {

    /**
     * Creates new form LeerArchivo
     */
    public LeerArchivo() {
        initComponents();
        agregarletras();
        jTextField2.setVisible(false);
        jButton3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Abrir XML");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Jugar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    public int tablero[][]=new int[Integer.parseInt(LectorXML.dimensiones)][Integer.parseInt(LectorXML.dimensiones)];
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            abrirArchivo();
        } catch (JDOMException ex) {
            Logger.getLogger(LeerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
         jButton2.setEnabled(true);
         jTextField2.setVisible(true);
         jButton3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       Juego b=new Juego();
       //b.empezar(jugadores,letras);
       b.setVisible(true);
       
       //jugadores.mostrar();
       
    }//GEN-LAST:event_jButton2ActionPerformed
    public static ListaCircular jugadores=new ListaCircular();
    public  Cola letras=new Cola();
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String jugador=jTextField2.getText();
        ListaSimple fichas=new ListaSimple();
        if (jugadores.buscar(jugador)==false&&jugador!="")
        {
            for(int i=0; i<7;i++)
            {
                fichas.insertar(letras.sacar());
            }
            jugadores.insertar(jugador,fichas);
            jTextField2.setText("");
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"EL NOMBRE YA FUE UTILIZADO");
            jTextField2.setText("");     
        }
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        /*MatrizOrtogonal hola=new MatrizOrtogonal(5);
        hola.insertar();
        hola.imprimir();*/
        
    }//GEN-LAST:event_jButton4ActionPerformed
    private void agregarletras()
    {
        ArrayList a = new ArrayList();
        for(int i=0;i<12;i++)
         {
            a.add("A");
            a.add("E");
            
         }
         for(int i=0;i<9;i++)
         {
             a.add("O");
         }
         for(int i=0; i<6;i++)
         {
             a.add("I");
             a.add("S");
         }
         for(int i=0;i<5;i++)
         {
             a.add("N");
             a.add("R");
             a.add("U");
             a.add("D");
         }
         for(int i=0;i<4;i++)
         {
             a.add("L");
             a.add("T");
             a.add("C");
         }
         for(int i=0;i<2;i++)
         {
             a.add("G");
             a.add("B");
             a.add("M");
             a.add("P");
             a.add("H");
         }
         a.add("F");
         a.add("V");
         a.add("Y");
         a.add("Q");
         a.add("J");
         a.add("Ñ");
         a.add("X");
         a.add("Z");
         llenarcola(a);
         
    }
    private void llenarcola(ArrayList a)
    {
        int numero, numeroAleatorio;
        for(int i=0 ;i<a.size();i++)
        {
            numero=a.size();
            numeroAleatorio = (int) (Math.random()*numero);
            letras.add(String.valueOf(a.get(numeroAleatorio)));
        }
    }        
    public void abrirArchivo() throws JDOMException {
        JFileChooser selector = new JFileChooser();
        //selector.setFileFilter(new Filtro("PRT"));
        selector.setDialogTitle("Leer Archivo");
        selector.setFileSelectionMode(0);
        int opcion = selector.showOpenDialog(selector);
        selector.setVisible(true);
        File archivo = selector.getSelectedFile();
        if (JFileChooser.APPROVE_OPTION == opcion) {
            LectorXML a=new LectorXML();
            a.cargarXml(archivo.getAbsolutePath());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LeerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeerArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeerArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
