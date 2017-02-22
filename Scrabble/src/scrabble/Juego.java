/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import xmlrod.LectorXML;
import static java.awt.Image.SCALE_DEFAULT;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Rod
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        //jPanel3.setVisible(false);
        //jugadores=b.jugadores;
        //String nombre=jugadores.getCabeza().getNombre();
        //jLabel2.setText(jugadores.getCabeza().getNombre());
    }
    public void actualizar(ListaSimple lista)
    {
        NodoSimple actualsimple=lista.getCabeza();
        jButton5.setText(actualsimple.getPalabra());
        checkbox1.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton6.setText(actualsimple.getPalabra());
        checkbox2.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton7.setText(actualsimple.getPalabra());
        checkbox3.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton8.setText(actualsimple.getPalabra());
        checkbox4.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton9.setText(actualsimple.getPalabra());
        checkbox5.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton10.setText(actualsimple.getPalabra());
        checkbox6.setLabel(actualsimple.getPalabra());
        actualsimple=actualsimple.getSiguiente();
        jButton11.setText(actualsimple.getPalabra());
        checkbox7.setLabel(actualsimple.getPalabra());
        
    }
    public void empezar(ListaCircular b, Cola letras)
    {
        //jugadores=b;
        this.letras=letras;
        actual=jugadores.getCabeza();
        ListaSimple lista=actual.getLetras();
        String nombre=actual.getNombre();
        jLabel2.setText(nombre);
        lista.imprimir();
        ListaSimple diccionario=new ListaSimple();
        //diccionario=LectorXML.Diccionario;
        diccionario.imprimir();
        actualizar(lista);
        crear2();
    }
    
    public void crear2()
    {
        int tamano=600/dimension;
        int x=0, y=0;
        MatrizOrtogonal m=new MatrizOrtogonal(dimension);
        m.insertar();
        NodoMatriz auxiliar;
        ImageIcon fot = new ImageIcon("C:\\imagenes\\graficos\\2.png");
        Icon dobl = new ImageIcon(fot.getImage().getScaledInstance(tamano, tamano, SCALE_DEFAULT));
        ImageIcon fot2 = new ImageIcon("C:\\imagenes\\graficos\\3.png");
        Icon tripl = new ImageIcon(fot2.getImage().getScaledInstance(tamano, tamano, SCALE_DEFAULT));
          for (int posY=0 ; posY<dimension; posY++)
          {
                auxiliar = m.buscar(0, posY);
                x=0;
                for (int posX=0 ; posX<dimension; posX++)
                {
                    JButton boton=new JButton();
                    jPanel3.add(boton);
                    boton.setVisible(true);       
                    boton.setBounds(x,y,tamano,tamano);
                    if(verificardob(posX,posY)==true)
                    {
                        boton.setIcon(dobl);
                    }
                    if(verificartrip(posX,posY)==true)
                    {
                        boton.setIcon(tripl);
                    }
                    auxiliar.setBoton(boton);
                    auxiliar=auxiliar.getDerecha();
                    x=x+tamano;
                }
                y=y+tamano;
          }
    }
    public void crear()
    {
        
        int tamano=600/dimension;
        int x=0, y=0;
        holu= new JButton[dimension][dimension];
        int contador=1;
        ImageIcon fot = new ImageIcon("C:\\imagenes\\graficos\\2.png");
        Icon dobl = new ImageIcon(fot.getImage().getScaledInstance(tamano, tamano, SCALE_DEFAULT));
        ImageIcon fot2 = new ImageIcon("C:\\imagenes\\graficos\\3.png");
        Icon tripl = new ImageIcon(fot2.getImage().getScaledInstance(tamano, tamano, SCALE_DEFAULT));
        for (int i=0; i<dimension; i++)
        {
            x=0;
            for (int j=0; j<dimension; j++)
            {
                holu[i][j]=new JButton();
                if(verificardob(j,i)==true)
                {
                    holu[i][j].setIcon(dobl);
                }
                if(verificartrip(j,i)==true)
                {
                    holu[i][j].setIcon(tripl);
                }
                jPanel3.add(holu[i][j]);
                holu[i][j].setVisible(true);       
                holu[i][j].setBounds(x,y,tamano,tamano);
                x=x+tamano;
                contador=contador+1;
            }
            y=y+tamano;
        }
    }
     
    public boolean verificardob(int x, int y)
    {
        for(NodoSimple actual=LectorXML.doble.getCabeza();actual!=null;actual=actual.getSiguiente())
        {
            int posx=Integer.parseInt(actual.getX());
            int posy=Integer.parseInt(actual.getY());
            if(posx==x+1 && posy==y+1)
            {
                return true;
            }      
        }
        return false;
    }
    public boolean verificartrip(int x, int y)
    {
        for(NodoSimple actual=LectorXML.triple.getCabeza();actual!=null;actual=actual.getSiguiente())
        {
            int posx=Integer.parseInt(actual.getX());
            int posy=Integer.parseInt(actual.getY());
            if(posx==x+1 && posy==y+1)
            {
                return true;
            }      
        }
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        checkbox4 = new java.awt.Checkbox();
        checkbox5 = new java.awt.Checkbox();
        checkbox6 = new java.awt.Checkbox();
        checkbox7 = new java.awt.Checkbox();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addTab("Mano Jugador", jLabel7);
        jTabbedPane1.addTab("Lista Jugadores", jLabel10);
        jTabbedPane1.addTab("Cola de fichas", jLabel11);
        jTabbedPane1.addTab("Matriz Tablero", jLabel12);
        jTabbedPane1.addTab("Lista Diccionario", jLabel13);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Turno de:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Puntuacion:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Nueva Palabra");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Cambiar Letras");

        jButton2.setText("Cambiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Validar tiro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar tiro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Letras Activas");

        jButton5.setText("jButton5");
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton5MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton6MouseDragged(evt);
            }
        });
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton7");
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton7MouseDragged(evt);
            }
        });
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton8");
        jButton8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton8MouseDragged(evt);
            }
        });
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });

        jButton9.setText("jButton9");
        jButton9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton9MouseDragged(evt);
            }
        });
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });

        jButton10.setText("jButton10");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });

        jButton11.setText("jButton11");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });

        checkbox1.setLabel("a");

        checkbox2.setLabel("a");

        checkbox3.setLabel("a");

        checkbox4.setLabel("a");

        checkbox5.setLabel("a");

        checkbox6.setLabel("a");

        checkbox7.setLabel("a");

        jButton12.setText("Generar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Actualizar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jButton14.setText("Cola");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkbox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton14)
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton13)
                                    .addComponent(jLabel9))))
                        .addGap(22, 22, 22)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkbox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkbox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton14)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton12)
                                    .addComponent(jButton13))
                                .addGap(31, 31, 31))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public ListaCircular jugadores=LeerArchivo.jugadores;
    public NodoCircular actual;
    public LeerArchivo b= new LeerArchivo();
    public ListaSimple diccionario=LectorXML.Diccionario;
    public Cola letras;
    public int [][] hola=new int[4][4];
    public JButton [][] holu;
    public int dimension=Integer.parseInt(LectorXML.dimensiones);
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String palabra=jTextField1.getText();
        diccionario.insertar(palabra);
        jTextField1.setText("");
        diccionario.imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        actual=actual.getSiguiente();
        jLabel2.setText(actual.getNombre());
        
        ListaSimple lista=actual.getLetras();
        actualizar(lista);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        Graficas g=new Graficas();
        try {
            g.txt(actual.getLetras(),actual.getNombre());
//            g.txt(jugadores);
           //g.txt(letras);
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
//        jLabel8.setText(jTabbedPane1.getWidth() +" "+jTabbedPane1.getHeight());
//        jLabel8.setText(jTabbedPane1.getWidth() +" "+jTabbedPane1.getHeight());
//        jLabel8.setText(jTabbedPane1.getWidth() +" "+jTabbedPane1.getHeight());
//        jLabel8.setText(jTabbedPane1.getWidth() +" "+jTabbedPane1.getHeight());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ListaSimple auxiliar=new ListaSimple();
        int contar=7;
        if(checkbox1.getState()==false)
        {
             auxiliar.insertar(checkbox1.getLabel());
             contar--;
        }
        if(checkbox2.getState()==false)
        {
             auxiliar.insertar(checkbox2.getLabel());
             contar--;
        }
        if(checkbox3.getState()==false)
        {
             auxiliar.insertar(checkbox3.getLabel());
             contar--;
        }
        if(checkbox4.getState()==false)
        {
             auxiliar.insertar(checkbox4.getLabel());
             contar--;
        }
        if(checkbox5.getState()==false)
        {
             auxiliar.insertar(checkbox5.getLabel());
             contar--;
        }
        if(checkbox6.getState()==false)
        {
             auxiliar.insertar(checkbox6.getLabel());
             contar--;
        }
        if(checkbox7.getState()==false)
        {
             auxiliar.insertar(checkbox7.getLabel());
             contar--;
        }
        //aqui
        if(letras.cantidad()>=contar)
        {
        
        }
        for(int i=0; i<contar; i++)
        {
            auxiliar.insertar(letras.sacar());
        }
        checkbox1.setState(false);
        checkbox2.setState(false);
        checkbox3.setState(false);
        checkbox4.setState(false);
        checkbox5.setState(false);
        checkbox6.setState(false);
        checkbox7.setState(false);
        
        actual.setLetras(auxiliar);
        letras.mostrar();
        actualizar(auxiliar);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        actualizarimagenes();
    }//GEN-LAST:event_jButton13ActionPerformed
    public void actualizarimagenes()
    {
        jLabel7.setBounds(0, 0, 240, 600);
        ImageIcon fot = new ImageIcon("C:\\imagenes\\graficos\\mano.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel7.setIcon(icono);
        
        jLabel10.setBounds(0, 0, 240, 600);
        ImageIcon fot2 = new ImageIcon("C:\\imagenes\\graficos\\jugadores.jpg");
        Icon icono2 = new ImageIcon(fot2.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel10.setIcon(icono2);
        
        jLabel11.setBounds(0, 0, 240, 600);
        ImageIcon fot3 = new ImageIcon("C:\\imagenes\\graficos\\fichas.jpg");
        Icon icono3 = new ImageIcon(fot3.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel11.setIcon(icono3);
        
         jLabel13.setBounds(0, 0, 240, 600);
        ImageIcon fot4 = new ImageIcon("C:\\imagenes\\graficos\\diccionario.jpg");
        Icon icono4 = new ImageIcon(fot4.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel13.setIcon(icono4);
        
         jLabel12.setBounds(0, 0, 240, 600);
        ImageIcon fot5 = new ImageIcon("C:\\imagenes\\graficos\\tablero.jpg");
        Icon icono5 = new ImageIcon(fot5.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), SCALE_DEFAULT));
        jLabel12.setIcon(icono5);
        
    }
    
    private void jButton5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseDragged
        // TODO add your handling code here:
//        int x= evt.getX(); 
//        int y = evt.getY();
//        jLabel8.setText(x+" " + y);
//        jLabel9.setText(jButton5.getX()+""+jButton5.getY());
        
    }//GEN-LAST:event_jButton5MouseDragged

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jLabel9.setText(jButton5.getX()+" "+jButton5.getY());
        
    }//GEN-LAST:event_formMouseClicked
    int x1,x2;
    private void jButton6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseDragged
        // TODO add your handling code here:
        int x= evt.getX(); 
        int y = evt.getY();
        jButton5.setLocation(x+x1,y+x2);
        //System.out.println("si");
    }//GEN-LAST:event_jButton6MouseDragged
    
    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        // TODO add your handling code here:
        x1=jButton6.getX();
        x2=jButton6.getY();
        jLabel9.setText(jButton6.getX()+" "+jButton6.getY());
//        jLabel9.setText(x1+" "+x2);
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        // TODO add your handling code here:
        x1=jButton5.getX();
        x2=jButton5.getY();
        jLabel9.setText(x1+" "+x2);
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseDragged
        // TODO add your handling code here:
         int x= evt.getX(); 
        int y = evt.getY();
        jButton6.setLocation(x+x1,y+x2);
//        jLabel8.setText(x+" "+y);
    }//GEN-LAST:event_jButton7MouseDragged

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
         Graficas g=new Graficas();
        try {
//            g.txt(actual.getLetras(),0);
            g.txt(jugadores);
            //g.txt(letras);
            g.txt(diccionario);
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        jLabel7=new JLabel();
//        jLabel7.setIcon(new ImageIcon("C:\\imagenes\\grafo.jpg"));
//        jLabel7.setBounds(0, 0, 174, 344);
        //System.out.println("si");
        
//        jLabel7=new JLabel();
//        jLabel7.setIcon(new ImageIcon("C:\\imagenes\\grafo.jpg"));
//        jLabel7.setBounds(0, 0, 174, 344);
        //System.out.println("si");
        
//        jLabel7=new JLabel();
//        jLabel7.setIcon(new ImageIcon("C:\\imagenes\\grafo.jpg"));
//        jLabel7.setBounds(0, 0, 174, 344);
        //System.out.println("si");
        
//        jLabel7=new JLabel();
//        jLabel7.setIcon(new ImageIcon("C:\\imagenes\\grafo.jpg"));
//        jLabel7.setBounds(0, 0, 174, 344);
        //System.out.println("si");
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        // TODO add your handling code here:
        jLabel9.setText(jButton5.getX()+" "+jButton5.getY());
        
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        // TODO add your handling code here:
        x1=jButton8.getX();
        x2=jButton8.getY();
        jLabel9.setText(x1+" "+x2);
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseDragged

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        // TODO add your handling code here:
        x1=jButton9.getX();
        x2=jButton9.getY();
        jLabel9.setText(x1+" "+x2);
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseDragged

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        // TODO add your handling code here:
        x1=jButton11.getX();
        x2=jButton11.getY();
        jLabel9.setText(x1+" "+x2);
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        // TODO add your handling code here:
        x1=jButton10.getX();
        x2=jButton10.getY();
        jLabel9.setText(x1+" "+x2);
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton5.setLocation(20,618);
        jButton6.setLocation(89,618);
        jButton7.setLocation(162,618);
        jButton8.setLocation(227,618);
        jButton9.setLocation(286,618);
        jButton10.setLocation(354,618);
        jButton11.setLocation(423,618);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        letras.mostrar();
        System.out.println(letras.cantidad());
        for(int i=0; i<10; i++)
        {
            letras.sacar();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        Graficas g=new Graficas();
        try {
           // g.txt(actual.getLetras());
            g.txt(jugadores);
            g.txt(letras);
            g.txt(diccionario);
        } catch (IOException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private java.awt.Checkbox checkbox5;
    private java.awt.Checkbox checkbox6;
    private java.awt.Checkbox checkbox7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
