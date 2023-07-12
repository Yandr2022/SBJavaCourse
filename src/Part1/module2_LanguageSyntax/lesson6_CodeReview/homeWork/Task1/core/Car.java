package Part1.module2_LanguageSyntax.lesson6_CodeReview.homeWork.Task1.core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        String vehicle = hasVehicle ? " с прицепом" : "";
        return "\n=========================================\n" +
                special + "Автомобиль номер " + number + vehicle +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}