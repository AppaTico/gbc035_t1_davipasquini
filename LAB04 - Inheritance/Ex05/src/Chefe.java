
public class Chefe extends Funcionario{

    public Chefe(String nm, String dn, double s)
    {
        super(nm, dn, s);
    }

    @Override
    public double calculaSalario()
    {
        return super.getSalario();
    }
}
