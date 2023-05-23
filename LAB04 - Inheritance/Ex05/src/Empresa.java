import java.util.Date;
public class Empresa {
    public static void main(String[] args) {
        Chefe [] chefes = new Chefe [5];
        chefes[0] = new Chefe ("Davi", "17/04/2002", 100000);
        chefes[1] = new Chefe ("Bruno", "01/01/1970", 205000);
        System.out.println(chefes[0].getNome() + " ganha " + chefes[0].calculaSalario() + " reais.");

        Horista [] horistas = new Horista [5];
        horistas[0] = new Horista ("A", "01/01/1971", 187.89);
        horistas[1] = new Horista ("B", "02/01/1971", 153.47);
        System.out.println(horistas[0].getNome() + " ganha " + horistas[0].calculaSalario(8) + " reais por dia.");

        Operario [] operarios = new Operario [5];
        operarios[0] = new Operario ("C", "01/01/1972", 57.98);
        operarios[1] = new Operario ("D", "02/01/1972", 63.25);
        System.out.println(operarios[0].getNome() + " ganha " + operarios[0].calculaSalario(100) + " reais a cada 100 itens produzidos.");

        Vendedor [] vendedores = new Vendedor [5];
        vendedores[0] = new Vendedor("E", "01/01/1973", 1500, 78.93);
        vendedores[1] = new Vendedor("F", "02/01/1973", 2000, 67.23);
        System.out.println(vendedores[0].getNome() + " ganha " + vendedores[0].calculaSalario(100) + " reais a cada 100 vendas.");
    }
}