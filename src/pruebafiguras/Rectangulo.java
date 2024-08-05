
package pruebafiguras;


public class Rectangulo {
    float base,altura;
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        
    }
    public float area(){
        return (base*altura);
    }
    public float perimetro(){
        return (2*(base+altura));
    }
}
