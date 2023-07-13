package Part1.module3_ObjectsAndClass.lesson4_StaticMethodsAndVariables.homeWork;

public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private static int count = 0;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }

    public void meow() {
        if(weight <= maxWeight && weight>= minWeight) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < minWeight) {
                count--;
            }
        }else {
            System.out.println("Cat was dead, can't say meow");
        }
    }

    public void feed(Double amount) {
        if(weight <= maxWeight && weight>= minWeight) {
            weight = weight + amount;
            if (weight > maxWeight) {
                count--;
            }
        }else {
            System.out.println("Cat was dead, can't eat");
        }
    }

    public void drink(Double amount) {
        if(weight <= maxWeight && weight >= minWeight) {
            weight = weight + amount;
            if (weight > maxWeight) {
                count--;
            }
        } else {
            System.out.println("Cat was dead, can't drink");
        }
    }

    public Double getWeight() {
        return weight;
    }

    public static int getCount(){
        return count;
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
