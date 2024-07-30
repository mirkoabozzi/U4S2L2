package Es3;

import java.util.HashMap;

public class Rubrica {

    private HashMap<String, Integer> rubrica = new HashMap<>();

    public void newContact(String nome, int numero) {
        this.rubrica.put(nome, numero);

    }

    public void removeContact(String nome) {
        this.rubrica.remove(nome);
    }

    public void findContact(int numero) {
        

    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "rubrica=" + rubrica +
                '}';
    }
}

