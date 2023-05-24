public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double r)
    {
        raio = r;
    }

    public double obterArea()
    {
        return raio*raio*4*3.14;
    }

    public double obterVolume()
    {
        return raio*raio*raio*3.14*(4/3);
    }

    public String toString()
    {
        return "ESFERA " + "raio: " + this.getRaio() + " area: " + this.obterArea() + " volume: " + this.obterVolume();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
