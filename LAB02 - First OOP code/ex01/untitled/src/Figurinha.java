public class Figurinha {

/*As figurinhas da copa do mundo são compostas pelas seguintes informações sobre os jogadores:
Nome do Jogador, Data de Nascimento, Altura, Peso, Posição, País.
Crie uma classe Figurinha, que conterá todas as informações das figurinhas.
Em uma outra classe (outro código Java), instancie 3 objetos, com informações de seus jogadores de preferência.
Faça atribuição de valores no próprio código e mostre as informações na tela.*/

    private String nome, data_nasc, posicao, pais;
    private float altura, peso;

    public Figurinha(String nm, String dn, String pos, String pa, float alt, float ps)
    {
        nome = nm;
        data_nasc = dn;
        posicao = pos;
        pais = pa;
        altura = alt;
        peso = ps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
