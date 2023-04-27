import java.time.LocalDate;

public class Funcionario {

    private String nome;
    protected double salario;
    private LocalDate dataNascimento;

    public Funcionario (String nm, double sl, LocalDate dn)
    {
        nome = nm;
        salario = sl;
        dataNascimento = dn;
    }

    public void setSalario()
    {
    }

}
