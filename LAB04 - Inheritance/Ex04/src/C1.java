public class C1 {
    public int a;
    private int b;
    protected int c;

    public C1()
    {
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1 (int aa, int bb, int cc)
    {
        a = aa;
        b = bb;
        c = cc;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    public void mostrar_atributos()
    {
        System.out.println(this.a + this.b + this.c);
    }

    public void mostrar_atributos_super()
    {
        System.out.println(this.getA() + this.getB() + this.getC());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
