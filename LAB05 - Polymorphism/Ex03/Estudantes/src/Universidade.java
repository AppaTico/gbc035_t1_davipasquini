public class Universidade {
    private String nome;
    private String dataFundacao;
    private Estudante [] estudantes = new Estudante[100];
    private Estudante [] estudantesPos = new Estudante[100];

    public void criaVetorPos(Estudante [] pos)
    {
        int j = 0;
        for (int i = 0; i < 100; i++)
        {
            if(!(estudantes[i] instanceof EstudanteGraduacao)) {
                pos[j] = estudantes[i];
                j++;
            }
        }

        mostraAlunos(pos);
    }


    private int qtdGrad = 0, qtdMes = 0, qtdPG = 0, qtdDr = 0;
    public void quantiaCategoriaAlunos(Estudante [] est)
    {
        for (int i = 0; i < 100; i++)
        {
            if (est[i] instanceof EstudanteDoutorado)
                qtdDr++;
            else if (est[i] instanceof EstudanteGraduacao)
                qtdGrad++;
            else if (est[i] instanceof EstudanteMestrado)
                qtdMes++;
            else if (est[i] instanceof EstudantePosGrad)
                qtdPG++;
        }

        System.out.println("A faculdade possui " + qtdGrad + " alunos da Graduação, " + qtdPG + " alunos da Pós-Graduação, " + qtdMes + " alunos do Mestrado e " + qtdDr + " alunos do Doutorado!");
    }

    public void mostraAlunos(Estudante [] est)
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Nome: " + est[i].getNome());
            if (estudantes[i] instanceof EstudanteDoutorado)
                System.out.println("Tese: " + ((EstudanteDoutorado) est[i]).getTituloTese());
        }
    }
}
