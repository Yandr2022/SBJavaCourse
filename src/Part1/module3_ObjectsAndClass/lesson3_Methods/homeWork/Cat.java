package Part1.module3_ObjectsAndClass.lesson3_Methods.homeWork;

public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private double wasEatenFoodAmount;
    private double wasDrunkWaterAmount;
    private double sumWasEatenFood;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        wasDrunkWaterAmount = 0;
        wasEatenFoodAmount = 0;
        sumWasEatenFood = 0;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        wasEatenFoodAmount = amount;
        sumWasEatenFood +=amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
        wasDrunkWaterAmount = amount;
    }

    public void pee() {
        if(wasEatenFoodAmount>0||wasDrunkWaterAmount>0) {
            weight = weight - ((wasDrunkWaterAmount - wasDrunkWaterAmount * 0.1)
                    + (wasEatenFoodAmount - wasEatenFoodAmount * 0.05));
            wasEatenFoodAmount = 0;
            wasDrunkWaterAmount = 0;
        }else{
            System.out.println("Don't want");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public double getSumWasEatenFood() {
        return sumWasEatenFood;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "originWeight=" + originWeight +
                ", weight=" + weight +
                ", status=" + getStatus() +
                '}';
    }
}
