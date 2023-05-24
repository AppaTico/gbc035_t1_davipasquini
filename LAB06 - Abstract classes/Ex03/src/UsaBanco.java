public class UsaBanco {
    public static void main(String[] args) {
        ContaEspecial awooga = new ContaEspecial(1200, 325, 11, 7850);
        ContaEspecial bazooka = new ContaEspecial(560, 895, 12, 3550);
        ContaEspecial mertiolate = new ContaEspecial(8900, 135, 13, 41250);

        System.out.println(awooga.debitaValor(300, 11));
        System.out.println(bazooka.debitaValor(-9, 12));
        System.out.println(mertiolate.debitaValor(500, 1));
    }
}