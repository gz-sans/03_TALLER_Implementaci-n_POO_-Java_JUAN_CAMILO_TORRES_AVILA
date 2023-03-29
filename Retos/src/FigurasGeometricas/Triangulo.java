package FigurasGeometricas;

public class Triangulo {
    private float base;
    private float altura;

    public Triangulo (float base, float altura){
        this.base=base;
        this.altura=altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        float area=0;
        area=(base*altura)/2;
        System.out.println("La base del triangulo es "+ base +" su altura es "+ altura+" y su area es "+ area);
     }
}
