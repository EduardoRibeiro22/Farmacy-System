package entities;

import java.util.List;

public class Ingredients {
    private final List <String> listadeIngredients;

    public Ingredients(List<String> listadeIngredients) {
        this.listadeIngredients = listadeIngredients;
    }

    // A Criação de Rémedios vai ser unica ou seja só pode ser criada 1 vez, e não pode ser modificada por questões de segurança.
    public List<String> getListadeIngredients() {
        return listadeIngredients;
    }
}
