public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo (double r)
    {
        raio = r;
    }
    public double obterArea()
    {
        return raio*raio*3.14;
    }

    public String toString()
    {
        return "CIRCULO " + "raio: " + this.getRaio() + " area: " + this.obterArea();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
