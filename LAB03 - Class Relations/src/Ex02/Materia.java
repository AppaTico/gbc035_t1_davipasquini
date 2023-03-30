package Ex02;

public class Materia {
    private String nome;
    private int carga;
    private Professor lecionador;

    public Materia(String n, int c) {
        nome = n;
        carga = c;
    }

    public void setLecionador(Professor a)
    {
        this.lecionador = a;
    }
}
