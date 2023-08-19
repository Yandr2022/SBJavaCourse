package Part1.module7_OOP.lesson11_Maven;

import Part1.module7_OOP.lesson1_2_Lambdas.homework.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class Demo {

    public static void main(String[] args) {

        String data = getDataFromFile("data/staff.json");
        JSONParser parser = new JSONParser();
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(data);
            for (Object o : jsonArray) {
                JSONObject jsonObject = (JSONObject) o;
                System.out.println(jsonObject.get("name"));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    private static String getDataFromFile(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                builder.append(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return builder.toString();
    }
}
