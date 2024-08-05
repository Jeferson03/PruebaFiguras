
package pruebafiguras;
    

public class Circulo {
    float radio;
    public Circulo(float radio){
        this.radio = radio;
    }
    public float area(){
        return (float) (Math.PI*(Math.pow(radio,2)));
    }
    public float perimetro(){
        return (float) (2*(Math.PI)*radio);
    }
}
