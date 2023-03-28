package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera implements Juego { 
        private int mano;
        private String jugador;
        private int eleccion;
        Scanner Lectura=new Scanner(System.in);
        
    public void iniciar(){
        System.out.println("Inrese el nombre del jugador ");
        jugador=Lectura.next();
    }
    public void jugar(){
    System.out.println(jugador+"Realice su eleccion \n 1.Piedra \n 2.Papel \n 3.Tijera");
      eleccion=Lectura.nextInt(); 
      Random aleatorio=new Random();
      mano=aleatorio.nextInt(3)+1;
      System.out.println("Piedra, Papel o Tijera!!!!!!");
    }
    public void finalizar(){
        if(mano==1 && eleccion==1){
            System.out.println("La maquina saco Piedra, Has empatado "+jugador);
        }
        else if(mano==2 && eleccion==1){
            System.out.println("La maquina saco Papel, Has perdido  "+jugador);
        }
        else if(mano==3 && eleccion==1){
            System.out.println("La maquina saco Tijera, Has ganado "+jugador);
        }
        else if(mano==1 && eleccion==2){
            System.out.println("La maquina saco Piedra, Has ganado "+jugador);
        }
        else if(mano==2 && eleccion==2){
            System.out.println("La maquina Papel, Has empatado "+jugador);
        }
        else if(mano==3 && eleccion==2){
            System.out.println("La maquina saco Tijera, Has perido "+jugador);
        }
        else if(mano==1 && eleccion==3){
            System.out.println("La maquina saco Piedra, Has perdido "+jugador);
        }
        else if(mano==2 && eleccion==3){
            System.out.println("La maquina saco Papel, Has ganado "+jugador);
        }
        else if(mano==3 && eleccion==3){
            System.out.println("La maquina saco Tijera, Has empatado "+jugador);
        }
        
    }
    }
