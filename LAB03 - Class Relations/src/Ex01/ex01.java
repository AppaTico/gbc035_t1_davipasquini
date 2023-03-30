package Ex01;

public class ex01 {
    public static void main(String[] args)
    {
        Materia poo1 = new Materia("Programação Orientada a Objetos 1", 60);
        Professor bruno = new Professor("Bruno", 123456);

        bruno.setMateria(poo1);
    }
}
