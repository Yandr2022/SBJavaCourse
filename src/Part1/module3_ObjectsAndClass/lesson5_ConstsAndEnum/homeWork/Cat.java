package Part1.module3_ObjectsAndClass.lesson5_ConstsAndEnum.homeWork;

public class Cat {
    private double originWeight;
    private double weight;
    private final int EYES_AMOUNT = 2;
    private CatColors color;

    private static final double MIN_WIGHT = 1000;
    private static final double MAX_WIGHT = 9000;

    private static int count = 0;

    public Cat(CatColors color) {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        this.color = color;
        count++;
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
                '}';
    }
}
