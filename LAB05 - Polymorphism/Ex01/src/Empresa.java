import java.util.Date;
public class Empresa {
    public static void main(String[] args) {
        Funcionario [] funcionarios = new Funcionario [10];
        funcionarios[0] = new Chefe("Davi", "17/04/2002", 150000);
        funcionarios[1] = new Horista("A", "01/01/1970", 158.79);
        funcionarios[2] = new Operario("B", "02/01/1970", 29.80);
        funcionarios[3] = new Vendedor("C", "03/01/1970", 1970.50, 123.45);

        FolhaPagamento a = new FolhaPagamento();
        a.mostrarFolha(funcionarios);
    }
}