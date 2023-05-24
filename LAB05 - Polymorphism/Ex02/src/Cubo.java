public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo (double l)
    {
        lado = l;
    }

    public double obterArea()
    {
        return 6*lado*lado;
    }

    public double obterVolume()
    {
        return lado*lado*lado;
    }

    public String toString()
    {
        return "CUBO " + "lado: " + this.getLado() + " area: " + this.obterArea() + " volume: " + this.obterVolume();
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
