public class Main {
    public static void main(String[] args) {
        Funcionario exception = new Funcionario("A", "11", 25000);
        exception.aumentaSalario(1200); // ultrapassa teto
        exception.aumentaSalario(-1200); // valor invalido
        exception.aumentaSalario(10);
    }
}