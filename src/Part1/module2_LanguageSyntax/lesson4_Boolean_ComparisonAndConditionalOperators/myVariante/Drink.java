package Part1.module2_LanguageSyntax.lesson4_Boolean_ComparisonAndConditionalOperators.myVariante;

public class Drink implements Comparable<Drink> {
    private String name;
    private int price;
    private int milkContains;

    public Drink() {
    }

    public Drink(String name, int price, int milkContains) {
        this.name = name;
        this.price = price;
        this.milkContains = milkContains;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMilkContains() {
        return milkContains;
    }

    public void setMilkContains(int milkContains) {
        this.milkContains = milkContains;
    }

    @Override
    public int compareTo(Drink o) {
        return o.price - price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
