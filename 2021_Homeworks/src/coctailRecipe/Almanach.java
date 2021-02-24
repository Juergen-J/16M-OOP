package coctailRecipe;

import java.util.Arrays;

public class Almanach {
    private Cocktail[] cocktails;
    private int size;

    public Almanach(int capacity) {
        cocktails = new Cocktail[capacity];
        size = 0;
    }

    // CRUD - create, read, update, delete

    public boolean addCocktail(Cocktail cocktail) {
        if (size < cocktails.length) {
            cocktails[size] = cocktail;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteCocktail(Cocktail drink) {
        for (int i = 0; i < size; i++) {
            if (cocktails[i].getTitle().equals(drink.getTitle())) {
                cocktails[i] = cocktails[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean update(Cocktail oldDrink, Cocktail newDrink) {
        for (int i = 0; i < size; i++) {
            // мы по тайтлам проверяем соотвествие коктейлей
            if (cocktails[i].getTitle().equals(oldDrink.getTitle())) {
                cocktails[i] = newDrink;
                return true;
            }
        }
        return false;
    }

    public String updateForPeople(Cocktail oldDrink, Cocktail newDrink) {
        if (update(oldDrink, newDrink)) {
            return "Апдейт прошёл успешно";
        }
        return "опять ничего не получилось";
    }

    @Override
    public String toString() {
        return "Almanach{" +
                "\n cocktails:  " + Arrays.toString(cocktails) +
                ", size=" + size +
                '}';
    }
}
