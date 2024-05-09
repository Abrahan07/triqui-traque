/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Lenovo
 */
public class Tablero {
    private JLabel[] posicion;
    private int[][] matriz;
    private boolean estado;
    private String turno;
    private JLabel lbTurno;
    private JLabel lbPuntox;
    private JLabel lbPuntoo;
    private String siguiente_juego="O";
    private Juego juego;
    private String player1;
    private String player2;
    private String colorj1;
    private String colorj2;
    private String modo_juego;
    private boolean ganador= false;
    

   public Tablero(Juego juego){
      this.player1=juego.getJugador1();
      this.player2=juego.getJugador2();
      this.colorj1=juego.getColor_j1();
      this.colorj2=juego.getColor_j2();
      this.modo_juego= juego.getModo_juego();
      this.juego=juego;
  }


    public Tablero(JLabel[] posicion, int[][] matriz, JLabel lbTurno, JLabel lbPuntox, JLabel lbPuntoo, boolean estado, Juego juego) {
        this.posicion = posicion;
        this.matriz = matriz;
        this.estado = true;
        this.turno = "X"; 
        this.lbTurno = lbTurno;
        this.lbPuntox = lbPuntox;
        this.lbPuntoo = lbPuntoo;
        this.juego=juego;
        this. player1=juego.getJugador1();
        this.player2=juego.getJugador2();
        this.colorj1=juego.getColor_j1();
        this.colorj2=juego.getColor_j2();
        this.modo_juego=juego.getModo_juego();
    }
  
    public void presionar(int casilla) {
        if (posicion[casilla - 1].getText().equals("") && estado) {
            posicion[casilla - 1].setText(turno);
            cambiarTurno();
            comprobarGanador();
            comprobarEmpate();
            
        }
    }

    public void cambiarTurno() {
        if (turno.equals("X")){
            turno = "O";
            lbTurno.setText("Turno de "+player2+" ("+turno+")");
        }else{
            turno = "X";
            lbTurno.setText("Turno de "+player1+" ("+turno+")");
        }
        
        
        
    }
    
    public boolean cambioEstado(){
        return estado=true;
    }
    

    public void comprobarGanador() {
        if (modo_juego=="3X3"){
             for (int i = 0; i < matriz.length; i++) {
            if (posicion[matriz[i][0]-1].getText().equals("X") && posicion[matriz[i][1]-1].getText().equals("X") && posicion[matriz[i][2]-1].getText().equals("X")){
                if (colorj1 == "Verde"){
                        posicion[matriz[i][0]-1].setBackground(Color.green);
                        posicion[matriz[i][1]-1].setBackground(Color.green);
                        posicion[matriz[i][2]-1].setBackground(Color.green);
                }
                 if(colorj1=="Rojo"){
                     posicion[matriz[i][0]-1].setBackground(Color.red);
                     posicion[matriz[i][1]-1].setBackground(Color.red);
                     posicion[matriz[i][2]-1].setBackground(Color.red);
                 }
                         
                if (colorj1 == "Azul"){
                        posicion[matriz[i][0]-1].setBackground(Color.blue);
                        posicion[matriz[i][1]-1].setBackground(Color.blue);
                        posicion[matriz[i][2]-1].setBackground(Color.blue);
                }
                if (colorj1 =="Amarillo"){
                    posicion[matriz[i][0]-1].setBackground(Color.yellow);
                    posicion[matriz[i][1]-1].setBackground(Color.yellow);
                    posicion[matriz[i][2]-1].setBackground(Color.yellow);
                }
                
                lbTurno.setText("Ha ganado "+player1+"(X)");
                lbPuntox.setText(String.valueOf(Integer.parseInt(lbPuntox.getText())+1));
                estado = false;
                
                
            
            }
            if (posicion[matriz[i][0]-1].getText().equals("O") && posicion[matriz[i][1]-1].getText().equals("O") && posicion[matriz[i][2]-1].getText().equals("O")){
                 if (colorj2 == "Verde"){
                        posicion[matriz[i][0]-1].setBackground(Color.green);
                        posicion[matriz[i][1]-1].setBackground(Color.green);
                        posicion[matriz[i][2]-1].setBackground(Color.green);
                }
                 if(colorj2=="Rojo"){
                     posicion[matriz[i][0]-1].setBackground(Color.red);
                     posicion[matriz[i][1]-1].setBackground(Color.red);
                     posicion[matriz[i][2]-1].setBackground(Color.red);
                 }
                         
                if (colorj2 == "Azul"){
                        posicion[matriz[i][0]-1].setBackground(Color.blue);
                        posicion[matriz[i][1]-1].setBackground(Color.blue);
                        posicion[matriz[i][2]-1].setBackground(Color.blue);
                }
                if (colorj2 =="Amarillo"){
                    posicion[matriz[i][0]-1].setBackground(Color.yellow);
                    posicion[matriz[i][1]-1].setBackground(Color.yellow);
                    posicion[matriz[i][2]-1].setBackground(Color.yellow);
                }
                
                
                lbTurno.setText("Ha ganado "+player2+"(O)");
                lbPuntoo.setText(String.valueOf(Integer.parseInt(lbPuntoo.getText())+1));
                estado = false;
                
            }
        
        }
             
        }
        if (modo_juego == "4X4"){
             for (int i = 0; i < matriz.length; i++) {
            if (posicion[matriz[i][0]-1].getText().equals("X") && posicion[matriz[i][1]-1].getText().equals("X") && posicion[matriz[i][2]-1].getText().equals("X") && posicion[matriz[i][3]-1].getText().equals("X")){
                if (colorj1 == "Verde"){
                        posicion[matriz[i][0]-1].setBackground(Color.green);
                        posicion[matriz[i][1]-1].setBackground(Color.green);
                        posicion[matriz[i][2]-1].setBackground(Color.green);
                        posicion[matriz[i][3]-1].setBackground(Color.green);
                }
                 if(colorj1=="Rojo"){
                     posicion[matriz[i][0]-1].setBackground(Color.red);
                     posicion[matriz[i][1]-1].setBackground(Color.red);
                     posicion[matriz[i][2]-1].setBackground(Color.red);
                     posicion[matriz[i][3]-1].setBackground(Color.red);
                 }
                         
                if (colorj1 == "Azul"){
                        posicion[matriz[i][0]-1].setBackground(Color.blue);
                        posicion[matriz[i][1]-1].setBackground(Color.blue);
                        posicion[matriz[i][2]-1].setBackground(Color.blue);
                        posicion[matriz[i][3]-1].setBackground(Color.blue);
                }
                if (colorj1 =="Amarillo"){
                    posicion[matriz[i][0]-1].setBackground(Color.yellow);
                    posicion[matriz[i][1]-1].setBackground(Color.yellow);
                    posicion[matriz[i][2]-1].setBackground(Color.yellow);
                    posicion[matriz[i][3]-1].setBackground(Color.yellow);
                }
                
                lbTurno.setText("Ha ganado "+player1+"(X)");
                lbPuntox.setText(String.valueOf(Integer.parseInt(lbPuntox.getText())+1));
                estado = false;
                
            
            }
            if (posicion[matriz[i][0]-1].getText().equals("O") && posicion[matriz[i][1]-1].getText().equals("O") && posicion[matriz[i][2]-1].getText().equals("O") && posicion[matriz[i][3]-1].getText().equals("O")){
                 if (colorj2 == "Verde"){
                        posicion[matriz[i][0]-1].setBackground(Color.green);
                        posicion[matriz[i][1]-1].setBackground(Color.green);
                        posicion[matriz[i][2]-1].setBackground(Color.green);
                        posicion[matriz[i][3]-1].setBackground(Color.green);
                }
                 if(colorj2=="Rojo"){
                     posicion[matriz[i][0]-1].setBackground(Color.red);
                     posicion[matriz[i][1]-1].setBackground(Color.red);
                     posicion[matriz[i][2]-1].setBackground(Color.red);
                     posicion[matriz[i][3]-1].setBackground(Color.red);
                 }
                         
                if (colorj2 == "Azul"){
                        posicion[matriz[i][0]-1].setBackground(Color.blue);
                        posicion[matriz[i][1]-1].setBackground(Color.blue);
                        posicion[matriz[i][2]-1].setBackground(Color.blue);
                        posicion[matriz[i][3]-1].setBackground(Color.blue);
                }
                if (colorj2 =="Amarillo"){
                    posicion[matriz[i][0]-1].setBackground(Color.yellow);
                    posicion[matriz[i][1]-1].setBackground(Color.yellow);
                    posicion[matriz[i][2]-1].setBackground(Color.yellow);
                    posicion[matriz[i][3]-1].setBackground(Color.yellow);
                }
                
                
                lbTurno.setText("Ha ganado "+player2+"(O)");
                lbPuntoo.setText(String.valueOf(Integer.parseInt(lbPuntoo.getText())+1));
                estado = false;
            }
        
        }
        }
        if (modo_juego == "5X5"){
            for (int i = 0; i < matriz.length; i++) {
            if (posicion[matriz[i][0]-1].getText().equals("X") && posicion[matriz[i][1]-1].getText().equals("X") && posicion[matriz[i][2]-1].getText().equals("X") && posicion[matriz[i][3]-1].getText().equals("X") && posicion[matriz[i][4]-1].getText().equals("X")){
                if (colorj1 == "Verde"){
                        posicion[matriz[i][0]-1].setBackground(Color.green);
                        posicion[matriz[i][1]-1].setBackground(Color.green);
                        posicion[matriz[i][2]-1].setBackground(Color.green);
                        posicion[matriz[i][3]-1].setBackground(Color.green);
                        posicion[matriz[i][4]-1].setBackground(Color.green);
                }
                 if(colorj1=="Rojo"){
                     posicion[matriz[i][0]-1].setBackground(Color.red);
                     posicion[matriz[i][1]-1].setBackground(Color.red);
                     posicion[matriz[i][2]-1].setBackground(Color.red);
                     posicion[matriz[i][3]-1].setBackground(Color.red);
                     posicion[matriz[i][4]-1].setBackground(Color.red);
                 }
                         
                if (colorj1 == "Azul"){
                        posicion[matriz[i][0]-1].setBackground(Color.blue);
                        posicion[matriz[i][1]-1].setBackground(Color.blue);
                        posicion[matriz[i][2]-1].setBackground(Color.blue);
                        posicion[matriz[i][3]-1].setBackground(Color.blue);
                        posicion[matriz[i][4]-1].setBackground(Color.blue);
                }
                if (colorj1 =="Amarillo"){
                    posicion[matriz[i][0]-1].setBackground(Color.yellow);
                    posicion[matriz[i][1]-1].setBackground(Color.yellow);
                    posicion[matriz[i][2]-1].setBackground(Color.yellow);
                    posicion[matriz[i][3]-1].setBackground(Color.yellow);
                    posicion[matriz[i][4]-1].setBackground(Color.yellow);
                }
                
                lbTurno.setText("Ha ganado "+player1+"(X)");
                lbPuntox.setText(String.valueOf(Integer.parseInt(lbPuntox.getText())+1));
                estado = false;
                
            
            }
            if (posicion[matriz[i][0]-1].getText().equals("O") && posicion[matriz[i][1]-1].getText().equals("O") && posicion[matriz[i][2]-1].getText().equals("O") && posicion[matriz[i][3]-1].getText().equals("O") && posicion[matriz[i][4]-1].getText().equals("O")){
                 if (colorj2 == "Verde"){
                        posicion[matriz[i][0]-1].setBackground(Color.green);
                        posicion[matriz[i][1]-1].setBackground(Color.green);
                        posicion[matriz[i][2]-1].setBackground(Color.green);
                        posicion[matriz[i][3]-1].setBackground(Color.green);
                        posicion[matriz[i][4]-1].setBackground(Color.green);
                }
                 if(colorj2=="Rojo"){
                     posicion[matriz[i][0]-1].setBackground(Color.red);
                     posicion[matriz[i][1]-1].setBackground(Color.red);
                     posicion[matriz[i][2]-1].setBackground(Color.red);
                     posicion[matriz[i][3]-1].setBackground(Color.red);
                     posicion[matriz[i][4]-1].setBackground(Color.red);
                 }
                         
                if (colorj2 == "Azul"){
                        posicion[matriz[i][0]-1].setBackground(Color.blue);
                        posicion[matriz[i][1]-1].setBackground(Color.blue);
                        posicion[matriz[i][2]-1].setBackground(Color.blue);
                        posicion[matriz[i][3]-1].setBackground(Color.blue);
                        posicion[matriz[i][4]-1].setBackground(Color.blue);
                }
                if (colorj2 =="Amarillo"){
                    posicion[matriz[i][0]-1].setBackground(Color.yellow);
                    posicion[matriz[i][1]-1].setBackground(Color.yellow);
                    posicion[matriz[i][2]-1].setBackground(Color.yellow);
                    posicion[matriz[i][3]-1].setBackground(Color.yellow);
                    posicion[matriz[i][4]-1].setBackground(Color.yellow);
                }
                
                
                lbTurno.setText("Ha ganado "+player2+"(O)");
                lbPuntoo.setText(String.valueOf(Integer.parseInt(lbPuntoo.getText())+1));
                estado = false;
            }
        
        }
        }
        
    }
    
    public boolean estaLleno(JLabel[] posicion) {
        for (JLabel casilla : posicion) {
            if (casilla.getText().isEmpty()) {
                return false; // El vector no está lleno
            }
        }
        return true; // El vector está lleno
    }
    public void sigienteJuego(){
        turno=siguiente_juego;
        if (siguiente_juego.equals("O")){
            siguiente_juego="X";
            lbTurno.setText("Turno de "+player2+" ("+turno+")");
        }else {
            siguiente_juego="O";
             lbTurno.setText("Turno de "+player1+" ("+turno+")");
        }
    
    }
    
    public void comprobarEmpate(){
        if (estado){
              if (estaLleno(posicion)== true){
             for (int i=0; i<posicion.length; i++){
            posicion[i].setText("");
            posicion[i].setBackground(Color.white);
            
            sigienteJuego(); 
            cambioEstado();
        }
        }
        }
      
    }

    public Juego getJuego() {
        return juego;
    }

    @Override
    public String toString() {
        return "Tablero{" + "posicion=" + posicion + ", matriz=" + matriz + ", estado=" + estado + ", turno=" + turno + ", lbTurno=" + lbTurno + ", lbPuntox=" + lbPuntox + ", lbPuntoo=" + lbPuntoo + ", siguiente_juego=" + siguiente_juego + ", juego=" + juego + ", player1=" + player1 + ", player2=" + player2 + '}';
    }
         
    
    
}
