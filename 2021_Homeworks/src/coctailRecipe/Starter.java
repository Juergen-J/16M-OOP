package coctailRecipe;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Водка", 100, 40);
        Ingredient tomateJuice = new Ingredient("Томатный сок", 100, 0);
        Ingredient cola = new Ingredient("Кола", 100, 0);
        Ingredient energiser = new Ingredient("Red Bull", 100, 0);
        Cocktail bloodyMary = new Cocktail("Кровавая Мери", vodka, tomateJuice);
        Cocktail disko = new Cocktail("Диско", energiser, vodka);
        Cocktail berlinNull = new Cocktail("Нулёвочка", cola, energiser);

        Almanach best100CocktailsInTheWorld = new Almanach(4);
        best100CocktailsInTheWorld.addCocktail(disko);
        best100CocktailsInTheWorld.addCocktail(bloodyMary);
        best100CocktailsInTheWorld.addCocktail(berlinNull);

        System.out.println(best100CocktailsInTheWorld.toString());
    }
}
