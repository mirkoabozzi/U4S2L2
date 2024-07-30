package Es3;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.newContact("mirko", 12345);
        rubrica.newContact("giovanni", 98765);

        rubrica.removeContact("giovanni");

        System.out.println(rubrica);
    }
}
