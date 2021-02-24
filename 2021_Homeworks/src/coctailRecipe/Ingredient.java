package coctailRecipe;

public class Ingredient {
    // кровавая мери
    // томатный сок
    // водка
    private String title;
    private int liquid;  // в миллилитрах
    private int perCent;
    private boolean alcohol;

    public Ingredient(String title, int liquid, int perCent) {
        this.title = title;
        this.liquid = liquid;
        this.perCent = perCent;
        setAlcohol();
    }

    public int getPerCent() {
        return perCent;
    }

    public int getLiquid() {
        return liquid;
    }

    private void setAlcohol() {
        if (perCent > 2) {
            alcohol = true;
        }
    }

    @Override
    public String toString() {
        return "        Ingredient{" +
                "title='" + title + '\'' +
                ", liquid=" + liquid +
                ", perCent=" + perCent +
                ", alcohol=" + alcohol +
                '}';
    }
}
