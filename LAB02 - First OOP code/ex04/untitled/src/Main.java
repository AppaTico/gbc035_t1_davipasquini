public class Main {
    public static void main(String[] args) {
        
        Figurinha titulares_brasil [] = new Figurinha [11];
        for (int i = 0; i < 11; i++)
            titulares_brasil[i] = new Figurinha("Zé " + i, "01/01/1970", "MF", "Brasil", 1.82F, 82.3F);
        
        Selecao brasileira = new Selecao("Seleção Brasileira", "Tite", titulares_brasil, 5, 1914);

       Figurinha titulares_croacia [] = new Figurinha [11];
        for (int i = 0; i < 11; i++)
            titulares_croacia[i] = new Figurinha("Jão " + i, "01/01/1970", "MF", "Croacia", 1.89F, 87.3F);
        
        Selecao croacia = new Selecao("Seleção Croata", "Dalic", titulares_croacia, 0, 1990);
    }
}
