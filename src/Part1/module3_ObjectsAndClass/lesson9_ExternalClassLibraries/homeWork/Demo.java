package Part1.module3_ObjectsAndClass.lesson9_ExternalClassLibraries.homeWork;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Airport airport = Airport.getInstance();
        List<Aircraft> aircrafts = airport.getAllAircrafts();
        System.out.println(aircrafts.size());
        System.out.println(aircrafts);

    }
}
