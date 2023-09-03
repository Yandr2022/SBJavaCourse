package Part2.module9_FilesAndNetworking.lesson2_4_FileInput_BufferedReader_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> list = Files.readAllLines(Path.of("data/staff.txt"));
            for (String line: list) {
                builder.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(builder);
    }
}
