package Es3;

import java.util.HashMap;

public class Rubrica {

    private final HashMap<String, String> rubrica = new HashMap<>();

    public void newContact(String nome, String numero) {
        this.rubrica.put(nome, numero);

    }

    public void removeContact(String nome) {
        this.rubrica.remove(nome);
    }

    public void findContactByNumber(String numero) {
        String result = "";
        for (String name : this.rubrica.keySet()) {
            if (numero.equals(rubrica.get(name))) {
                result = name;
            }
        }
        System.out.println(result);

    }

    public void findContactByName(String name) {
        System.out.println(this.rubrica.get(name));

    }

    public void printAllContacts() {
        for (String nome : this.rubrica.keySet()) {
            System.out.println("Nome " + nome + " - " + " numero " + this.rubrica.get(nome));
        }
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "rubrica=" + rubrica +
                '}';
    }
}

