package Part1.module3_ObjectsAndClass.lesson7_Encapsulation_GettersAndSetters.homeWork.Task1;

public class Cat {
    private double originWeight;
    private double weight;
    private final int EYES_AMOUNT = 2;
    private CatColors color;
    private double wasEatenFoodAmount;
    private double wasDrunkWaterAmount;
    private double totalWasEatenFood;


    private static final double MIN_WIGHT = 1000;
    private static final double MAX_WIGHT = 9000;

    private static int count = 0;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight) {
        this.weight = weight;
        originWeight = weight;
        count++;
        wasDrunkWaterAmount = 0;
        wasEatenFoodAmount = 0;
        totalWasEatenFood = 0;
    }


    public void meow() {
        if (weight <= MAX_WIGHT && weight >= MIN_WIGHT) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < MIN_WIGHT) {
                count--;
            }
        } else {
            System.out.println("Cat was dead, can't say meow");
        }
    }

    public void feed(Double amount) {
        if (weight <= MAX_WIGHT && weight >= MIN_WIGHT) {
            weight = weight + amount;
            if (weight > MAX_WIGHT) {
                count--;
                wasEatenFoodAmount = amount;
                totalWasEatenFood +=amount;
            }
        } else {
            System.out.println("Cat was dead, can't eat");
        }
    }

    public void drink(Double amount) {
        if (weight <= MAX_WIGHT && weight >= MIN_WIGHT) {
            weight = weight + amount;
            if (weight > MAX_WIGHT) {
                count--;
                wasDrunkWaterAmount = amount;
            }
        } else {
            System.out.println("Cat was dead, can't drink");
        }
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

    public CatColors getColor() {
        return color;
    }

    public void setColor(CatColors color) {
        this.color = color;
    }

    public static int getCount() {
        return count;
    }

    public String getStatus() {
        if (weight < MIN_WIGHT) {
            return "Dead";
        } else if (weight > MAX_WIGHT) {
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
                ", eyes=" + EYES_AMOUNT +
                ", color=" + color +
                ", status=" + getStatus() +
                ", total food eaten=" + totalWasEatenFood+
                '}';
    }
}
