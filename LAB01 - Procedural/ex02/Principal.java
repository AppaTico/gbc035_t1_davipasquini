import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args)
    {
        String nome;
        int quantidade, conta = 0;
        float preco;
        //ArrayList <Produto> produtos = new ArrayList <Produto>();
        Produto [] produtos = new Produto[5];
        Scanner c = new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            conta = i + 1;
            System.out.println("Informe o nome, o preco e a qtd. em estoque do produto" + conta + " :");
            nome = c.nextLine();
            quantidade = c.nextInt();
            c.nextLine();
            preco = c.nextFloat();
            c.nextLine();

            Produto temp = new Produto(preco, quantidade, nome);
            //produtos.add(temp);
            produtos[i] = temp;
        }

        System.out.println("Aumentando o preco em 10%% dos produtos 1 e 3");
        preco = produtos[0].getPreco();
        produtos[0].altera_preco(preco, -110);
        preco = produtos[2].getPreco();
        produtos[2].altera_preco(preco, 10);

        System.out.println("Reduzindo o preco em 5%% do produto 2");
        preco = produtos[1].getPreco();
        if (produtos[1].altera_preco(preco, -5) == -1)
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        else
            System.out.println("Preco alterado com sucesso");

        System.out.println("Alterando o preco do prod. 4");
        preco = produtos[3].getPreco();
        if (produtos[3].altera_preco(preco, -110) == -1)
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");

        System.out.println("Produtos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Produto: " + produtos[i].getNome());
            System.out.println("Preco: " + produtos[i].getPreco());
            System.out.println("Estoque: " + produtos[i].getQuantidade());
        }
    }
}