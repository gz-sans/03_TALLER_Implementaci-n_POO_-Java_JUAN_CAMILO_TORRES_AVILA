package FigurasGeometricas;
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        float lado, base, altura, radio;
        int desicion, i=1;
        Scanner Lectura = new Scanner(System.in);


        while(i==1){
            
        System.out.println("DIGITE EL NUMERO, SEGUN LA FIGURA LA CUAL DESEE CALCULAR EL AREA");
        System.out.println("1 SI SU FIGURA ES RECTANGULO");
        System.out.println("2 SI SU FIGURA ES TRIANGULO");
        System.out.println("3 SI SU FIGURA ES CIRCULO");
        desicion=Lectura.nextInt();

        
        
        if(desicion==1){
        System.out.println("Ingrese el valor de la base del rectangulo");
        base=Lectura.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo");
        altura=Lectura.nextInt();
        Rectangulo r1=new Rectangulo(base, altura);
        r1.calcularArea();
        }

        else if(desicion==2){
        System.out.println("Ingrese el valor de la base del triangulo");
        base=Lectura.nextInt();
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura=Lectura.nextInt();
        Triangulo t1=new Triangulo(base, altura);
        t1.calcularArea();
        }
    
        else if(desicion==3){
        System.out.println("Ingrese el valor del radio del circulo");
        radio=Lectura.nextFloat();
        Circulo C1=new Circulo(radio);
        C1.calcularArea();
        }
        i++;
    } 

    System.out.println("¿Desea calcular el area de otra figura geometrica?, digite 0 si si o cualquier otro numero si no");
    i=Lectura.nextInt();

    if(i!=1){
        System.out.println("GRACIAS POR USAR EL PROGRAMA");
    }
    }
     //Lectura.close();   
}
