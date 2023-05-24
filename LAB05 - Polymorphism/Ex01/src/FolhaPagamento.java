public class FolhaPagamento {
    private double totalPagamento = 0;
    public void mostrarFolha (Funcionario [] funcionarios) {
        System.out.println("==== FOLHA DE PAGAMENTO ====");
        for (int i = 0; i < funcionarios.length; i++)
        {
            if (funcionarios[i]instanceof Chefe)
            {
                System.out.println(funcionarios[i].toString());
                totalPagamento += funcionarios[i].getSalario();
            }
            else if (funcionarios[i] instanceof Horista)
            {
                System.out.println(funcionarios[i].toString());
                totalPagamento += ((Horista)funcionarios[i]).calculaSalario(220);
            }
            else if (funcionarios[i] instanceof Operario)
            {
                System.out.println(funcionarios[i].toString());
                totalPagamento += ((Operario)funcionarios[i]).calculaSalario(1500);
            }
            else if (funcionarios[i] instanceof Vendedor)
            {
                System.out.println(funcionarios[i].toString());
                totalPagamento += ((Vendedor)funcionarios[i]).calculaSalario(100);
            }
        }

        System.out.println("");
        System.out.println("TOTAL: " + totalPagamento);
    }
}
