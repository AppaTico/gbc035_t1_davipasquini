public class Selecao {
    private String nome, tecnico;
    private Figurinha titulares [] = new Figurinha [11];
    private int copas, ano_fund;

    public Selecao(String nm, String tec, Figurinha tit [], int cop, int af) {
        nome = nm;
        tecnico = tec;

        for (int i = 0; i < 11; i++)
        {
            titulares[i] = tit[i];
        }

        copas = cop;
        ano_fund = af;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String[] getTitulares() {
        return titulares;
    }

    public void setTitulares(String[] titulares) {
        this.titulares = titulares;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public int getAno_fund() {
        return ano_fund;
    }

    public void setAno_fund(int ano_fund) {
        this.ano_fund = ano_fund;
    }
}
