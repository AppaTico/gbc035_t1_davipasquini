public class FigurinhaExtra extends Figurinha{
    private String categoria, cor;

    public FigurinhaExtra(String nm, String dn, String pos, String pa, float al, float pe, String cr, boolean c) {
        super( nm, dn, pos, pa, al, pe);
        cor = cr;

        if (c == true)
            categoria = "Legends";
        else
            categoria = "Rookies";
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void mostrarFigurinha()
    {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Data de nascimento: " + super.getData_nasc());
        System.out.println("Posição: " + super.getPosicao());
        System.out.println("País: " + super.getPais());
        System.out.println("Altura: " + super.getAltura());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Categoria: " + this.getCategoria());
    }
}
