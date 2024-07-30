package Es3;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.newContact("mirko", "12345");
        rubrica.newContact("giovanni", "98765");
        rubrica.newContact("antonio", "11111");
        rubrica.newContact("giovannino", "55555");

        System.out.println(rubrica);

        rubrica.removeContact("giovanni");

        System.out.println(rubrica);

        rubrica.findContactByNumber("11111");

        rubrica.findContactByName("mirko");

        rubrica.printAllContacts();
    }
}
