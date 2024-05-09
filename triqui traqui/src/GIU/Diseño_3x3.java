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
public class Diseño_3x3 extends javax.swing.JFrame {
    private Tablero tablero;

    private JLabel posicion [] =new JLabel[9];
    private int matriz [][]={
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {1,5,9},
        {3,5,7}
    };
  
    public Diseño_3x3(Tablero tablero) {
        //this.tablero = tablero;
        initComponents();
        setSize(664,610);
        setResizable(false);
        setTitle("TriquiTraque 3X3");
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
        j_pos2 = new javax.swing.JLabel();
        j_pos6 = new javax.swing.JLabel();
        j_pos5 = new javax.swing.JLabel();
        j_pos4 = new javax.swing.JLabel();
        j_pos9 = new javax.swing.JLabel();
        j_pos8 = new javax.swing.JLabel();
        j_pos7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbTurno = new javax.swing.JLabel();
        lb_j1 = new javax.swing.JLabel();
        lbPuntox = new javax.swing.JLabel();
        lb_j2 = new javax.swing.JLabel();
        lbPuntoo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jPanel2.add(j_pos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 130, 130));

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
        jPanel2.add(j_pos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 130));

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
        jPanel2.add(j_pos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 130, 130));

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
        jPanel2.add(j_pos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 130, 130));

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
        jPanel2.add(j_pos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, 130));

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
        jPanel2.add(j_pos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 130));

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
        jPanel2.add(j_pos9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 130, 130));

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
        jPanel2.add(j_pos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 130, 130));

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
        jPanel2.add(j_pos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 130, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Jugar De Nuevo");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 50));

        lbTurno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTurno.setForeground(new java.awt.Color(0, 0, 0));
        lbTurno.setText("nombre");
        jPanel1.add(lbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, -1));

        lb_j1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lb_j1.setForeground(new java.awt.Color(0, 0, 0));
        lb_j1.setText("X=");
        jPanel1.add(lb_j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 170, -1));

        lbPuntox.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbPuntox.setForeground(new java.awt.Color(0, 0, 0));
        lbPuntox.setText("0");
        jPanel1.add(lbPuntox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, 40));

        lb_j2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lb_j2.setForeground(new java.awt.Color(0, 0, 0));
        lb_j2.setText("O=");
        jPanel1.add(lb_j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 170, -1));

        lbPuntoo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbPuntoo.setForeground(new java.awt.Color(0, 0, 0));
        lbPuntoo.setText("0");
        jPanel1.add(lbPuntoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 10, 40));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 140, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Puntos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Puntos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Puntuacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 170, 300));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 190, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        // TODO add your handling code here:
       tablero.presionar(9);
    }//GEN-LAST:event_j_pos9MousePressed

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
            java.util.logging.Logger.getLogger(Diseño_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseño_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseño_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseño_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           //new Diseño_3x3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel j_pos1;
    private javax.swing.JLabel j_pos2;
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
