package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class CaraYSello implements Juego{

    private int moneda;
    private String jugador;
    private int eleccion;
    Scanner Lectura=new Scanner(System.in);
    
public void iniciar(){
    System.out.println("Inrese el nombre del jugador ");
    jugador=Lectura.next();
}
public void jugar(){
System.out.println(jugador+"Realice su eleccion \n 1.Cara \n 2.Sello");
  eleccion=Lectura.nextInt(); 
  Random aleatorio=new Random();
  moneda=aleatorio.nextInt(2)+1;
  System.out.println("Ha lanzado la moneda");
}
public void finalizar(){
    if(moneda==1 && eleccion==1){
        System.out.println("Cayo cara, Ganaste "+jugador);
    }
    else if(moneda==2 && eleccion==2){
        System.out.println("Cayo sello, Ganaste "+jugador);
    }
    else if(moneda==1 && eleccion==2){
        System.out.println("Cayo cara, Perdiste "+jugador);
    }
    else if(moneda==2 && eleccion==1){
        System.out.println("Cayo sello, Perdiste "+jugador);
    }
    
}
}