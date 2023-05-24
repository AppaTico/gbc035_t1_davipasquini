import java.lang.Math;
public class Tetraedro extends FormaTridimensional{
    private double lado;
    private double altura;
    private Triangulo base;

    public Tetraedro (double l, double h, double bTri, double hTri)
    {
        lado = l;
        altura = h;
        base = new Triangulo(bTri, hTri);
    }

    public double obterArea()
    {
        return lado*lado*Math.sqrt(3);
    }

    /*vou assumir que seja um tetraedro regular com base triangular pq senao e necessario um programa mt mais robusto*/
    public double obterVolume()
    {
        return (1/3)*base.obterArea()*altura;
    }

    public String toString()
    {
        return "TETRAEDRO REGULAR " + "lado: " + this.getLado() + " altura: " + this.getAltura() + " area: " + this.obterArea() + " volume: " + this.obterVolume();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
