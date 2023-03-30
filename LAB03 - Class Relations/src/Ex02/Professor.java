package Ex02;

public class Professor {
    private String nome;
    private Materia materia_leciona;
    private int matricula;

    public Professor(String n, Materia m, int ma)
    {
        nome = n;
        materia_leciona = m;
        matricula = ma;

        m.setLecionador(this);
    }
}