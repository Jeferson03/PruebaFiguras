
package pruebafiguras;


public class Cuadrado {
    float lado;
    public Cuadrado(float lado){
        this.lado = lado;
    }
     public float area(){
        return (float) Math.pow(lado, 2);
    }
    public float perimetro(){
        return (4*lado);
    }
}
