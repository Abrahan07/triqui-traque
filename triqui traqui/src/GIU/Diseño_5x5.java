/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GIU;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Lenovo
 */
public class Diseño_5x5 extends javax.swing.JFrame {

    private Tablero tablero;
    private JLabel posicion []= new JLabel [25];
    private int matriz[][] = {
        {1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
        {16,17,18,19,20},
        {21,22,23,24,25},
        {1,6,11,16,21},
        {2,7,12,17,22},
        {3,8,13,18,23},
        {4,9,14,19,24},
        {5,10,15,20,25},
        {1,7,13,19,25},
        {5,9,13,17,21}
    };
    
    public Diseño_5x5(Tablero tablero) {
        initComponents();
        setSize(664,607);
        setResizable(false);
        setTitle("TriquiTraque 5X5");
        setLocationRelativeTo(null);
        this.repaint();
        
        posicion [0] = j_pos1;
        posicion [1] = j_pos2;
        posicion [2] = j_pos3;
        posicion [3] = j_pos4;
        posicion [4] = j_pos5;
        posicion [5] = j_pos6;
        posicion [6] = j_pos7;
        posicion [7] = j_pos8;
        posicion [8] = j_pos9;
        posicion [9] = j_pos10;
        posicion [10] = j_pos11;
        posicion [11] = j_pos12;
        posicion [12] = j_pos13;
        posicion [13] = j_pos14;
        posicion [14] = j_pos15;
        posicion [15] = j_pos16;
        posicion [16] = j_pos17;
        posicion [17] = j_pos18;
        posicion [18] = j_pos19;
        posicion [19] = j_pos20;
        posicion [20] = j_pos21;
        posicion [21] = j_pos22;
        posicion [22] = j_pos23;
        posicion [23] = j_pos24;
        posicion [24] = j_pos25;
        
         this.tablero = new Tablero(posicion, matriz, lbTurno, lbPuntox, lbPuntoo, true, tablero.getJuego());
          lbTurno.setText("Turno de "+tablero.getJuego().getJugador1()+" (X)");
          lb_j1.setText(tablero.getJuego().getJugador1()+":");
          lb_j2.setText(tablero.getJuego().getJugador2()+":");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        j_pos3 = new javax.swing.JLabel();
        j_pos1 = new javax.swing.JLabel();
        j_pos5 = new javax.swing.JLabel();
        j_pos2 = new javax.swing.JLabel();
        j_pos4 = new javax.swing.JLabel();
        j_pos6 = new javax.swing.JLabel();
        j_pos7 = new javax.swing.JLabel();
        j_pos8 = new javax.swing.JLabel();
        j_pos9 = new javax.swing.JLabel();
        j_pos10 = new javax.swing.JLabel();
        j_pos11 = new javax.swing.JLabel();
        j_pos12 = new javax.swing.JLabel();
        j_pos13 = new javax.swing.JLabel();
        j_pos14 = new javax.swing.JLabel();
        j_pos15 = new javax.swing.JLabel();
        j_pos16 = new javax.swing.JLabel();
        j_pos17 = new javax.swing.JLabel();
        j_pos18 = new javax.swing.JLabel();
        j_pos19 = new javax.swing.JLabel();
        j_pos20 = new javax.swing.JLabel();
        j_pos21 = new javax.swing.JLabel();
        j_pos22 = new javax.swing.JLabel();
        j_pos23 = new javax.swing.JLabel();
        j_pos24 = new javax.swing.JLabel();
        j_pos25 = new javax.swing.JLabel();
        lbTurno = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lb_j1 = new javax.swing.JLabel();
        lbPuntox = new javax.swing.JLabel();
        lb_j2 = new javax.swing.JLabel();
        lbPuntoo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 570));
        setPreferredSize(new java.awt.Dimension(560, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j_pos3.setBackground(new java.awt.Color(255, 255, 255));
        j_pos3.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos3.setForeground(new java.awt.Color(0, 0, 0));
        j_pos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos3.setOpaque(true);
        j_pos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos3MousePressed(evt);
            }
        });
        jPanel2.add(j_pos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 80, 80));

        j_pos1.setBackground(new java.awt.Color(255, 255, 255));
        j_pos1.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos1.setForeground(new java.awt.Color(0, 0, 0));
        j_pos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos1.setOpaque(true);
        j_pos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos1MousePressed(evt);
            }
        });
        jPanel2.add(j_pos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        j_pos5.setBackground(new java.awt.Color(255, 255, 255));
        j_pos5.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos5.setForeground(new java.awt.Color(0, 0, 0));
        j_pos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos5.setOpaque(true);
        j_pos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos5MousePressed(evt);
            }
        });
        jPanel2.add(j_pos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 80, 80));

        j_pos2.setBackground(new java.awt.Color(255, 255, 255));
        j_pos2.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos2.setForeground(new java.awt.Color(0, 0, 0));
        j_pos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos2.setOpaque(true);
        j_pos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos2MousePressed(evt);
            }
        });
        jPanel2.add(j_pos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 80));

        j_pos4.setBackground(new java.awt.Color(255, 255, 255));
        j_pos4.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos4.setForeground(new java.awt.Color(0, 0, 0));
        j_pos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos4.setOpaque(true);
        j_pos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos4MousePressed(evt);
            }
        });
        jPanel2.add(j_pos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 80, 80));

        j_pos6.setBackground(new java.awt.Color(255, 255, 255));
        j_pos6.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos6.setForeground(new java.awt.Color(0, 0, 0));
        j_pos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos6.setOpaque(true);
        j_pos6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos6MousePressed(evt);
            }
        });
        jPanel2.add(j_pos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 80, 80));

        j_pos7.setBackground(new java.awt.Color(255, 255, 255));
        j_pos7.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos7.setForeground(new java.awt.Color(0, 0, 0));
        j_pos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos7.setOpaque(true);
        j_pos7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos7MousePressed(evt);
            }
        });
        jPanel2.add(j_pos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, 80));

        j_pos8.setBackground(new java.awt.Color(255, 255, 255));
        j_pos8.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos8.setForeground(new java.awt.Color(0, 0, 0));
        j_pos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos8.setOpaque(true);
        j_pos8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos8MousePressed(evt);
            }
        });
        jPanel2.add(j_pos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 80, 80));

        j_pos9.setBackground(new java.awt.Color(255, 255, 255));
        j_pos9.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos9.setForeground(new java.awt.Color(0, 0, 0));
        j_pos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos9.setOpaque(true);
        j_pos9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos9MousePressed(evt);
            }
        });
        jPanel2.add(j_pos9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, 80));

        j_pos10.setBackground(new java.awt.Color(255, 255, 255));
        j_pos10.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos10.setForeground(new java.awt.Color(0, 0, 0));
        j_pos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos10.setOpaque(true);
        j_pos10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos10MousePressed(evt);
            }
        });
        jPanel2.add(j_pos10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 80, 80));

        j_pos11.setBackground(new java.awt.Color(255, 255, 255));
        j_pos11.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos11.setForeground(new java.awt.Color(0, 0, 0));
        j_pos11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos11.setOpaque(true);
        j_pos11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos11MousePressed(evt);
            }
        });
        jPanel2.add(j_pos11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 80, 80));

        j_pos12.setBackground(new java.awt.Color(255, 255, 255));
        j_pos12.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos12.setForeground(new java.awt.Color(0, 0, 0));
        j_pos12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos12.setOpaque(true);
        j_pos12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos12MousePressed(evt);
            }
        });
        jPanel2.add(j_pos12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 80, 80));

        j_pos13.setBackground(new java.awt.Color(255, 255, 255));
        j_pos13.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos13.setForeground(new java.awt.Color(0, 0, 0));
        j_pos13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos13.setOpaque(true);
        j_pos13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos13MousePressed(evt);
            }
        });
        jPanel2.add(j_pos13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 80, 80));

        j_pos14.setBackground(new java.awt.Color(255, 255, 255));
        j_pos14.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos14.setForeground(new java.awt.Color(0, 0, 0));
        j_pos14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos14.setOpaque(true);
        j_pos14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos14MousePressed(evt);
            }
        });
        jPanel2.add(j_pos14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 80));

        j_pos15.setBackground(new java.awt.Color(255, 255, 255));
        j_pos15.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos15.setForeground(new java.awt.Color(0, 0, 0));
        j_pos15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos15.setOpaque(true);
        j_pos15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos15MousePressed(evt);
            }
        });
        jPanel2.add(j_pos15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 80, 80));

        j_pos16.setBackground(new java.awt.Color(255, 255, 255));
        j_pos16.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos16.setForeground(new java.awt.Color(0, 0, 0));
        j_pos16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos16.setOpaque(true);
        j_pos16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos16MousePressed(evt);
            }
        });
        jPanel2.add(j_pos16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 80, 80));

        j_pos17.setBackground(new java.awt.Color(255, 255, 255));
        j_pos17.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos17.setForeground(new java.awt.Color(0, 0, 0));
        j_pos17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos17.setOpaque(true);
        j_pos17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos17MousePressed(evt);
            }
        });
        jPanel2.add(j_pos17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 80, 80));

        j_pos18.setBackground(new java.awt.Color(255, 255, 255));
        j_pos18.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos18.setForeground(new java.awt.Color(0, 0, 0));
        j_pos18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos18.setOpaque(true);
        j_pos18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos18MousePressed(evt);
            }
        });
        jPanel2.add(j_pos18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 80, 80));

        j_pos19.setBackground(new java.awt.Color(255, 255, 255));
        j_pos19.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos19.setForeground(new java.awt.Color(0, 0, 0));
        j_pos19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos19.setOpaque(true);
        j_pos19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos19MousePressed(evt);
            }
        });
        jPanel2.add(j_pos19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 80, 80));

        j_pos20.setBackground(new java.awt.Color(255, 255, 255));
        j_pos20.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos20.setForeground(new java.awt.Color(0, 0, 0));
        j_pos20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos20.setOpaque(true);
        j_pos20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos20MousePressed(evt);
            }
        });
        jPanel2.add(j_pos20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 80, 80));

        j_pos21.setBackground(new java.awt.Color(255, 255, 255));
        j_pos21.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos21.setForeground(new java.awt.Color(0, 0, 0));
        j_pos21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos21.setOpaque(true);
        j_pos21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos21MousePressed(evt);
            }
        });
        jPanel2.add(j_pos21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 80, 80));

        j_pos22.setBackground(new java.awt.Color(255, 255, 255));
        j_pos22.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos22.setForeground(new java.awt.Color(0, 0, 0));
        j_pos22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos22.setOpaque(true);
        j_pos22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos22MousePressed(evt);
            }
        });
        jPanel2.add(j_pos22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 80, 80));

        j_pos23.setBackground(new java.awt.Color(255, 255, 255));
        j_pos23.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos23.setForeground(new java.awt.Color(0, 0, 0));
        j_pos23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos23.setOpaque(true);
        j_pos23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos23MousePressed(evt);
            }
        });
        jPanel2.add(j_pos23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 80, 80));

        j_pos24.setBackground(new java.awt.Color(255, 255, 255));
        j_pos24.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos24.setForeground(new java.awt.Color(0, 0, 0));
        j_pos24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos24.setOpaque(true);
        j_pos24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos24MousePressed(evt);
            }
        });
        jPanel2.add(j_pos24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 80, 80));

        j_pos25.setBackground(new java.awt.Color(255, 255, 255));
        j_pos25.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        j_pos25.setForeground(new java.awt.Color(0, 0, 0));
        j_pos25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_pos25.setOpaque(true);
        j_pos25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_pos25MousePressed(evt);
            }
        });
        jPanel2.add(j_pos25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 80, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 440, 440));

        lbTurno.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        lbTurno.setForeground(new java.awt.Color(0, 0, 0));
        lbTurno.setText("jLabel26");
        jPanel1.add(lbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Jugar De Nuevo");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 50));

        lb_j1.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        lb_j1.setForeground(new java.awt.Color(0, 0, 0));
        lb_j1.setText("jLabel27");
        jPanel1.add(lb_j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        lbPuntox.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbPuntox.setForeground(new java.awt.Color(0, 0, 0));
        lbPuntox.setText("0");
        jPanel1.add(lbPuntox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, 40));

        lb_j2.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        lb_j2.setForeground(new java.awt.Color(0, 0, 0));
        lb_j2.setText("jLabel29");
        jPanel1.add(lb_j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        lbPuntoo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbPuntoo.setForeground(new java.awt.Color(0, 0, 0));
        lbPuntoo.setText("0");
        jPanel1.add(lbPuntoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Puntuacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Puntos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver Al Menu");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Puntos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 170, 300));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -4, 190, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_pos1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos1MousePressed
        // TODO add your handling code here:
        tablero.presionar(1);
    }//GEN-LAST:event_j_pos1MousePressed

    private void j_pos2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos2MousePressed
        // TODO add your handling code here:
        tablero.presionar(2);
    }//GEN-LAST:event_j_pos2MousePressed

    private void j_pos3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos3MousePressed
        // TODO add your handling code here:
        tablero.presionar(3);
    }//GEN-LAST:event_j_pos3MousePressed

    private void j_pos4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos4MousePressed
        // TODO add your handling code here:
        tablero.presionar(4);
    }//GEN-LAST:event_j_pos4MousePressed

    private void j_pos5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos5MousePressed
        // TODO add your handling code here:
        tablero.presionar(5);
    }//GEN-LAST:event_j_pos5MousePressed

    private void j_pos6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos6MousePressed
        // TODO add your handling code here:
        tablero.presionar(6);
    }//GEN-LAST:event_j_pos6MousePressed

    private void j_pos7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos7MousePressed
        // TODO add your handling code here:
        tablero.presionar(7);
    }//GEN-LAST:event_j_pos7MousePressed

    private void j_pos8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos8MousePressed
        // TODO add your handling code here:
        tablero.presionar(8);
    }//GEN-LAST:event_j_pos8MousePressed

    private void j_pos9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos9MousePressed
        // TODO add your handling code here:}
        tablero.presionar(9);
    }//GEN-LAST:event_j_pos9MousePressed

    private void j_pos10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos10MousePressed
        // TODO add your handling code here:
        tablero.presionar(10);
    }//GEN-LAST:event_j_pos10MousePressed

    private void j_pos11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos11MousePressed
        // TODO add your handling code here:
        tablero.presionar(11);
    }//GEN-LAST:event_j_pos11MousePressed

    private void j_pos12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos12MousePressed
        // TODO add your handling code here:
        tablero.presionar(12);
    }//GEN-LAST:event_j_pos12MousePressed

    private void j_pos13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos13MousePressed
        // TODO add your handling code here:
        tablero.presionar(13);
    }//GEN-LAST:event_j_pos13MousePressed

    private void j_pos14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos14MousePressed
        // TODO add your handling code here:
        tablero.presionar(14);
    }//GEN-LAST:event_j_pos14MousePressed

    private void j_pos15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos15MousePressed
        // TODO add your handling code here:
        tablero.presionar(15);
    }//GEN-LAST:event_j_pos15MousePressed

    private void j_pos16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos16MousePressed
        // TODO add your handling code here:
        tablero.presionar(16);
    }//GEN-LAST:event_j_pos16MousePressed

    private void j_pos17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos17MousePressed
        // TODO add your handling code here:
        tablero.presionar(17);
    }//GEN-LAST:event_j_pos17MousePressed

    private void j_pos18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos18MousePressed
        // TODO add your handling code here:
        tablero.presionar(18);
    }//GEN-LAST:event_j_pos18MousePressed

    private void j_pos19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos19MousePressed
        // TODO add your handling code here:
        tablero.presionar(19);
    }//GEN-LAST:event_j_pos19MousePressed

    private void j_pos20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos20MousePressed
        // TODO add your handling code here:
        tablero.presionar(20);
    }//GEN-LAST:event_j_pos20MousePressed

    private void j_pos21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos21MousePressed
        // TODO add your handling code here:
        tablero.presionar(21);
    }//GEN-LAST:event_j_pos21MousePressed

    private void j_pos22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos22MousePressed
        // TODO add your handling code here:
        tablero.presionar(22);
    }//GEN-LAST:event_j_pos22MousePressed

    private void j_pos23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos23MousePressed
        // TODO add your handling code here:
        tablero.presionar(23);
    }//GEN-LAST:event_j_pos23MousePressed

    private void j_pos24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos24MousePressed
        // TODO add your handling code here:
        tablero.presionar(24);
    }//GEN-LAST:event_j_pos24MousePressed

    private void j_pos25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_pos25MousePressed
        // TODO add your handling code here:
        tablero.presionar(25);
    }//GEN-LAST:event_j_pos25MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i=0; i<posicion.length; i++){
            posicion[i].setText("");
            posicion[i].setBackground(Color.white);
        }
        
        tablero.sigienteJuego();
        tablero.cambioEstado();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Juego_principal menu = new Juego_principal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Diseño_5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseño_5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseño_5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseño_5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Diseño_5x5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel j_pos1;
    private javax.swing.JLabel j_pos10;
    private javax.swing.JLabel j_pos11;
    private javax.swing.JLabel j_pos12;
    private javax.swing.JLabel j_pos13;
    private javax.swing.JLabel j_pos14;
    private javax.swing.JLabel j_pos15;
    private javax.swing.JLabel j_pos16;
    private javax.swing.JLabel j_pos17;
    private javax.swing.JLabel j_pos18;
    private javax.swing.JLabel j_pos19;
    private javax.swing.JLabel j_pos2;
    private javax.swing.JLabel j_pos20;
    private javax.swing.JLabel j_pos21;
    private javax.swing.JLabel j_pos22;
    private javax.swing.JLabel j_pos23;
    private javax.swing.JLabel j_pos24;
    private javax.swing.JLabel j_pos25;
    private javax.swing.JLabel j_pos3;
    private javax.swing.JLabel j_pos4;
    private javax.swing.JLabel j_pos5;
    private javax.swing.JLabel j_pos6;
    private javax.swing.JLabel j_pos7;
    private javax.swing.JLabel j_pos8;
    private javax.swing.JLabel j_pos9;
    private javax.swing.JLabel lbPuntoo;
    private javax.swing.JLabel lbPuntox;
    private javax.swing.JLabel lbTurno;
    private javax.swing.JLabel lb_j1;
    private javax.swing.JLabel lb_j2;
    // End of variables declaration//GEN-END:variables
}
