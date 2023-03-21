public class Main {
    public static void main(String[] args) {

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
            album[i].printFigurinha();
            System.out.println("");
        }
    }
}