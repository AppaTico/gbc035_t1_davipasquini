import java.time.LocalDate;

public class Vendedor extends Funcionario
{
    public Vendedor (String nm, double sl, LocalDate dn, double com, double ven)
    {
        super (nm, sl, dn);
        this.setSalario(sl, com, ven);
    }

    public void setSalario(double s, double c, double v)
    {
        this.salario = s + (c * v);
    }
}
