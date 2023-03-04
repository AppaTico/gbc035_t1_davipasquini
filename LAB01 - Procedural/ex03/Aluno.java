public class Aluno {

    private int matricula;
    private char classe;
    private float cra;

    public Aluno(int m, char c, float cr)
    {
        matricula = m;
        classe = c; // vou assumir que o usuario insere um caractere valido (A, B, C, D ou E)
        cra = cr;
    }

    public void printAluno()
    {
        System.out.println("Numero: " + this.matricula + " Classe Social: " + this.classe + " CRA: " + this.cra);
    }

    public int getMatricula()
    {
        return matricula;
    }

}