package Ex01;

public class Professor {
    private String nome;
    private Materia materia_leciona;
    private int matricula;

    public Professor(String n, int ma)
    {
        nome = n;
        matricula = ma;
    }

    public void setMateria(Materia m)
    {
        this.materia_leciona = m;
        m.setLecionador(this);
    }
}
