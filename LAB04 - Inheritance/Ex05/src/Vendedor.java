public class Vendedor extends Funcionario{

    private double comissao;
    public Vendedor(String nm, String dn, double s, double c)
    {
        super(nm, dn, s);
        comissao = c;
    }

    public double calculaSalario(int vendas)
    {
        return super.getSalario() + (comissao * vendas);
    }
}
