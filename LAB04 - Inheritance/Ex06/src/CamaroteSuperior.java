public class CamaroteSuperior extends VIP{
    private int valorAdicional;

    public int getIngresso()
    {
        return super.getValorVip() + valorAdicional;
    }
}
