import java.time.LocalDate;

public class Operario extends Funcionario {
    public Operario (String nm, double sl, LocalDate dn, double prod, double quant)
    {
        super (nm, sl, dn);
        this.setSalario(prod, quant);
    }

    public void setSalario (double p, double q)
    {
        this.salario = p * q;
    }
}
