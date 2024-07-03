package ATS_Poo_1;
public class Triangulo extends Poligono{
    
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    @Override
    public double area(){
        double sp = (lado1+lado2+lado3) / 2;
        double area = Math.sqrt(sp * (sp-lado1)*(sp-lado2)*(sp-lado3));
        return area;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nLado1: "+lado1+"\nLado2: "+lado2+"\nLado3: "+lado3;
    }
}
