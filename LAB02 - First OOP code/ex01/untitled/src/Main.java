public class Main {
    public static void main(String[] args) {

        //public Figurinha(String nm, String dn, String ps, String pa, float alt, float ps)
        Figurinha fenomeno = new Figurinha ("Ronaldo Fenômeno", "18/09/76", "ST", "Brasil", 1.83F, 95F);
        Figurinha gaucho = new Figurinha ("Ronaldinho Gaúcho", "21/03/80", "LW", "Brasil", 1.81F, 76F);
        Figurinha romario = new Figurinha ("Romário", "29/01/66", "ST", "Brasil", 1.67F, 72F);

        Figurinha album [] = new Figurinha[4];
        album[1] = fenomeno;
        album[2] = gaucho;
        album[3] = romario;

        for (int i = 1; i <= 3; i++)
        {
            System.out.println("=== FIGURINHA " + i + " ===");
            System.out.println("Nome: " + album[i].getNome());
            System.out.println("Data de nascimento: " + album[i].getData_nasc());
            System.out.println("Posição: " + album[i].getPosicao());
            System.out.println("País: " + album[i].getPais());
            System.out.println("Altura: " + album[i].getAltura());
            System.out.println("Peso: " + album[i].getPeso());
            System.out.println("");
        }
    }
}