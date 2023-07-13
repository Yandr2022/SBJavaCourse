package Part1.module3_ObjectsAndClass.lesson7_Encapsulation_GettersAndSetters.homeWork.Task2.core;

public class Car {
    private String number;
    private int height;
    private double weight;
    private boolean hasVehicle;
    private boolean isSpecial;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean hasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        String vehicle = hasVehicle ? " с прицепом" : "";
        return "\n=========================================\n" +
                special + "Автомобиль номер " + number + vehicle +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}