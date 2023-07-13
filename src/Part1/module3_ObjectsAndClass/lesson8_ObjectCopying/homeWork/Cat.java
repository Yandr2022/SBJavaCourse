package Part1.module3_ObjectsAndClass.lesson8_ObjectCopying.homeWork;

public class Cat {
    private String name;
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
        count++;
        this.weight = weight;
        originWeight = weight;
        wasDrunkWaterAmount = 0;
        wasEatenFoodAmount = 0;
        totalWasEatenFood = 0;
    }

    public Cat(String name, double weight, CatColors color) {
        this(weight);
        this.name = name;
        this.color = color;
    }

    public Cat getCopy() {
        return new Cat(this.name, this.weight, this.color);
    }

    public Cat getFullCopy() {
        Cat fullCopy = new Cat(this.name, this.weight, this.color);
        fullCopy.originWeight = this.originWeight;
        fullCopy.wasDrunkWaterAmount = this.wasDrunkWaterAmount;
        fullCopy.wasEatenFoodAmount = this.wasEatenFoodAmount;
        fullCopy.totalWasEatenFood = this.totalWasEatenFood;
        return fullCopy;
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
            wasEatenFoodAmount = amount;
            totalWasEatenFood += amount;
            if (weight > MAX_WIGHT) {
                count--;
            }
        } else {
            System.out.println("Cat was dead, can't eat");
        }
    }

    public void drink(Double amount) {
        if (weight <= MAX_WIGHT && weight >= MIN_WIGHT) {
            weight = weight + amount;
            wasDrunkWaterAmount = amount;
            if (weight > MAX_WIGHT) {
                count--;
            }
        } else {
            System.out.println("Cat was dead, can't drink");
        }
    }

    public void pee() {
        if (wasEatenFoodAmount > 0 || wasDrunkWaterAmount > 0) {
            weight = weight - ((wasDrunkWaterAmount - wasDrunkWaterAmount * 0.1)
                    + (wasEatenFoodAmount - wasEatenFoodAmount * 0.05));
            wasEatenFoodAmount = 0;
            wasDrunkWaterAmount = 0;
        } else {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                " name=" + name +
                ", originWeight=" + originWeight +
                ", weight=" + weight +
                ", eyes=" + EYES_AMOUNT +
                ", color=" + color +
                ", status=" + getStatus() +
                ", total food eaten=" + totalWasEatenFood +
                '}';
    }
}
