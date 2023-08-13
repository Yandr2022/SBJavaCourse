package Part1.module7_OOP.lesson3_8_StreamAPI.homework;

import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        List<Terminal> terminals = airport.getTerminals();
        List<Flight> flights = new ArrayList<>();
        for (Terminal t : terminals) {
            flights.addAll(t.getFlights());
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 2);
        System.out.println(calendar.getTime());
        flights.stream().filter(f -> f.getDate().before(calendar.getTime())
                && f.getDate().after(Calendar.getInstance().getTime())).forEach((f) -> System.out.println(f.getDate()));

    }
}
