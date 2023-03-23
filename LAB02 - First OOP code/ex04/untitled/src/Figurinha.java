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

    public void printFigurinha()
    {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de nascimento: " + this.getData_nasc());
        System.out.println("Posição: " + this.getPosicao());
        System.out.println("País: " + this.getPais());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
    }
