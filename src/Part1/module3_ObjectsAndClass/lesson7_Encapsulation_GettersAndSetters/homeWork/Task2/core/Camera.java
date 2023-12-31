package Part1.module3_ObjectsAndClass.lesson7_Encapsulation_GettersAndSetters.homeWork.Task2.core;

public class Camera {
    public static Car getNextCar() {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        int randomHeight = (int) (1000 + 3500. * Math.random());
        double randomWeight = 600 + 10000 * Math.random();

        Car car = new Car();
        car.setNumber(randomNumber);
        car.setHeight(randomHeight);
        car.setWeight(randomWeight);
        car.setHasVehicle(Math.random() > 0.5);
        car.setSpecial( Math.random() < 0.15);

        return car;
    }
}
