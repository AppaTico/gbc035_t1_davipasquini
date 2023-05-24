public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;

    public Triangulo (double b, double h)
    {
        base = b;
        altura = h;
    }

    public double obterArea()
    {
        return base*altura;
    }

    public String toString()
    {
        return "TRIANGULO " + "base: " + this.getBase() + " altura: " + this.getAltura() + " area: " + this.obterArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
