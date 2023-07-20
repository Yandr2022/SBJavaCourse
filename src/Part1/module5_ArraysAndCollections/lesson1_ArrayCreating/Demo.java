package Part1.module5_ArraysAndCollections.lesson1_ArrayCreating;

public class Demo {

    public static void main(String[] args) {

        int[] roomCounts = new int[6];

        roomCounts[0] = 22;
        roomCounts[1] = 45;
        roomCounts[2] = 18;
        roomCounts[3] = 24;

        String[] floorAttendants = {"Ivan", "Maria", "Svetlana", "Oleg", "Yuli", "Max"};

        for (int i = 0, rC; i < roomCounts.length; i++) {
            rC = roomCounts[i];
            System.out.printf("%02d floor: rooms count - %02d, attendant - %s\n"
                    , i + 1, rC, rC > 0 ? floorAttendants[i] : "not needed");
        }
    }
}
