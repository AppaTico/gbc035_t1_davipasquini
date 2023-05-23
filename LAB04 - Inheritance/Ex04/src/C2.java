public class C2 extends C1{
    public int d;
    private int e;
    protected int f;

    public C2 ()
    {
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2 (int dd, int ee, int ff)
    {
        d = dd;
        e = ee;
        f = ff;
        System.out.println("Classe C2: chamada do construtor com parametros");
    }

    @Override
    public void mostrar_atributos()
    {
        System.out.println(this.a + this.b + this.c + this.d + this.e + this.f);
    }

    @Override
    public void mostrar_atributos_super()
    {
        System.out.println(super.getA() + super.getB() + super.getC() + this.getD() + this.getE() + this.getF());
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
}
