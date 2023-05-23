public class Funcionario {
    private String nome;
    private String dataNascimento;
    private double salario;

    //funcionarios com "salario"
    public Funcionario(String nm, String dn, double s)
    {
        nome = nm;
        dataNascimento = dn;
        salario = s;
    }

    //pra funcionarios sem "salario"
    public Funcionario (String nm, String dn)
    {
        nome = nm;
        dataNascimento = dn;
    }

    public double calculaSalario()
    {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
