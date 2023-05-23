public class VIP extends Ingresso{
    int valorAdicional;

    @Override
    public void escreveValor() {
        System.out.println(super.getValor() + valorAdicional);
    }

    public int getValorVip()
    {
        return super.getValor() + valorAdicional;
    }
}
