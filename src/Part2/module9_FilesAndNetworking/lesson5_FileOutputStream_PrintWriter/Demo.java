package Part2.module9_FilesAndNetworking.lesson5_FileOutputStream_PrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("data/file.txt");
            for (int i = 0; i < 1000; i++) {
                writer.write(i + "\n");
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            List<String> stringList = new ArrayList<>();
            for (int i = 1000; i > 0; i--) {
                stringList.add(Integer.toString(i));
            }
            Files.write(Paths.get("data/file2.txt"), stringList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
