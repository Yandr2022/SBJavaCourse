package Part1.module3_ObjectsAndClass.lesson6_ConstructorsAndObjectCreating.homeWork;

public class Cat {
    private double originWeight;
    private double weight;
    private final int EYES_AMOUNT = 2;

    private static final double MIN_WEIGHT = 1000;
    private static final double MAX_WEIGHT = 9000;

    private static int count = 0;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight) {
        this.weight = weight;
        originWeight = weight;
        count++;
    }

    public void meow() {
        if (weight <= MAX_WEIGHT && weight >= MIN_WEIGHT) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < MIN_WEIGHT) {
                count--;
            }
        } else {
            System.out.println("Cat was dead, can't say meow");
        }
    }

    public void feed(Double amount) {
        if (weight <= MAX_WEIGHT && weight >= MIN_WEIGHT) {
            weight = weight + amount;
            if (weight > MAX_WEIGHT) {
                count--;
            }
        } else {
            System.out.println("Cat was dead, can't eat");
        }
    }

    public void drink(Double amount) {
        if (weight <= MAX_WEIGHT && weight >= MIN_WEIGHT) {
            weight = weight + amount;
            if (weight > MAX_WEIGHT) {
                count--;
            }
        } else {
            System.out.println("Cat was dead, can't drink");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
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
                ", status=" + getStatus() +
                '}';
    }
}
