package Ex03;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto []> pedidos = new ArrayList<Produto []>();

    public Pedido(Produto comanda [])
    {
        pedidos.add(comanda);
    }
}