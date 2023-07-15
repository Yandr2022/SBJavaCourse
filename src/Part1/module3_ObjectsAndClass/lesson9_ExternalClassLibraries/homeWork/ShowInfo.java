package Part1.module3_ObjectsAndClass.lesson9_ExternalClassLibraries.homeWork;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ShowInfo {
    public static void main(String[] args) {

        Class[] classes = {Aircraft.class, Airport.class, Flight.class, Terminal.class};
        for (Class cl: classes){
            showInfo(cl);
        }

    }

    public static void showInfo(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        System.out.println(cl.getSimpleName());
        System.out.println("*****************************************");
        System.out.printf("Fields:\n%-18s \t%-12s\t%s\n", "type:", "name:", "modifier:");
        for (Field f : fields) {
            System.out.printf("%-18s:\t%-12s\t%s\n", f.getType().getSimpleName(), f.getName(), Modifier.toString(f.getModifiers()));
        }
        System.out.println("*****************************************");

        Constructor[] constructors = cl.getDeclaredConstructors();
        System.out.printf("Constructors:\n%-28s\t%-10s\t%s\n", "name:", "modifier:", "args count: args list:");
        for (Constructor c : constructors) {
            System.out.printf("%-28s:\t%-10s\t%-10s:\t%s\n", c.getName(), Modifier.toString(c.getModifiers()), c.getParameterCount(),
                    Arrays.toString(c.getParameters()));
        }

        System.out.println("*****************************************");
        System.out.printf("Methods:\n%-18s:\t%-18s\t%-20s\t%s\n", "name:", "modifier:", "return type:", "args list:");
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            System.out.printf("%-18s:\t%-18s\t%-20s\t%s\n", m.getName(), Modifier.toString(m.getModifiers()), m.getReturnType().getSimpleName()
                    , Arrays.toString(m.getParameters()));
        }
        System.out.println("_____________________________________________________________________________________");

    }

}
