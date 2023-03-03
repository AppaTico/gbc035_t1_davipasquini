public class Produto
{
    private float preco;
    private int quantidade;
    private String nome;

    public Produto (float p, int q, String n)
    {
        preco = p;
        quantidade = q;
        nome = n;
    }

    public int altera_preco(float pr, float porc)
    {
        float temp;

        if (porc > -100)
        {
            temp = 1 + porc/100;
            this.preco = pr*temp;
            return 0;
        }
        else
            return -1;
    }

    public float getPreco()
    {
        return preco;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public String getNome()
    {
        return nome;
    }
}