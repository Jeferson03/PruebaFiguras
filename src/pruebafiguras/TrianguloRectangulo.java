
package pruebafiguras;

public class TrianguloRectangulo {
    float base,altura;
    public TrianguloRectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        
    }
    public float area(){
        return ((base*altura)/2);
    }
    public float perimetro(){
        return base+altura+hipotenusa();
    }
    public float hipotenusa(){
        return (float) (Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)));
    }
    public String tipoDeTriangulo(){
        if (base == altura && altura == hipotenusa()){
            return "Equilatero";
        } else if (base == altura | base == hipotenusa() | altura == hipotenusa()){
            return "Isoceles";
        } else {
            return "Escaleno";
        }
    }
}
