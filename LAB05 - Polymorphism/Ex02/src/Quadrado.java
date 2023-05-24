public class Quadrado extends FormaBidimensional{
    private double lado;

    public Quadrado(double l)
    {
        lado = l;
    }

    public double obterArea()
    {
        return lado*lado;
    }

    public String toString()
    {
        return "QUADRADO " + "lado: " + this.getLado() + " area: " + this.obterArea();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
