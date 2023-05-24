public class Main {
    public static void main(String[] args) {
        Forma [] formas = new Forma [10];
        for (int i = 0; i < formas.length; i++)
        {
            if (formas[i] instanceof FormaBidimensional)
            {
                System.out.println(formas[i].toString());
                System.out.println("Area: " + ((FormaBidimensional) formas[i]).obterArea());
            }
            else if (formas[i] instanceof FormaTridimensional)
            {
                System.out.println(formas[i].toString());
                System.out.println("Area: " + ((FormaTridimensional) formas[i]).obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) formas[i]).obterVolume());
            }
        }

    }
}