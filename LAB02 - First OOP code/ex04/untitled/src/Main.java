public class Main {
    public static void main(String[] args) {
        String titulares_brasil [] = {"Alisson", "Daniel Alves", "Danilo", "Militão", "Marquinhos", "Thiago Silva", "Casemiro", "Neymar", "Vini Jr", "Richarlison", "Pedro"};
        Selecao brasileira = new Selecao("Seleção Brasileira", "Tite", titulares_brasil, 5, 1914);

        String titulares_croacia [] = {"Modric", "Budimir", "Perisic", "Lovren", "Domagoj", "Kramaric", "Dominik", "Mislav", "Marko", "Marcelo", "Mateo"};
        Selecao croacia = new Selecao("Seleção Croata", "Dalic", titulares_croacia, 0, 1990);
    }
}