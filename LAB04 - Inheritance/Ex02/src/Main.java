public class Main {
    public static void main(String[] args) {

        Figurinha ze = new Figurinha ("Zé", "12/02/02", "MC", "BR", 1.88F, 83.4F);
        FigurinhaExtra ez = new FigurinhaExtra ("Éz", "13/03/03", "GOL", "EUA", 1.67F, 65.4F, "Prata", false);

        ze.mostrarFigurinha();
        ez.mostrarFigurinha();

    }
}