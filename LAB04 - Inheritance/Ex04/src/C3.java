public class C3 extends C2{
    public int g;
    private int h;
    protected int i;

    public C3 ()
    {
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3 (int gg, int hh, int ii)
    {
        g = gg;
        h = hh;
        i = ii;
        System.out.println("Classe C3: chamada do construtor com parametros");
    }

    public C3 (int dd, int ee, int ff, int gg, int hh, int ii)
    {
        super (dd, ee, ff);
        g = gg;
        h = hh;
        i = ii;
    }
    @Override
    public void mostrar_atributos()
    {
        System.out.println(this.a + this.b + this.c + this.d + this.e + this.f + this.g + this.h + this.i);
    }

    @Override
    public void mostrar_atributos_super()
    {
        System.out.println(super.getA() + super.getB() + super.getC() + super.getD() + super.getE() + super.getF() + this.getG() + this.getH() + this.getI());
    }

    public int getG() {
        return g;
    }

    public int getH() {
        return h;
    }

    public int getI() {
        return i;
    }
}
