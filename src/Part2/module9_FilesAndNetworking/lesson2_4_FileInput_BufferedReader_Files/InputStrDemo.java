package Part2.module9_FilesAndNetworking.lesson2_4_FileInput_BufferedReader_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStrDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            FileInputStream inputStream = new FileInputStream("info.txt");
            for (int code = inputStream.read(); code != -1; code = inputStream.read()) {
                char ch = (char) code;
                builder.append(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(builder);
    }
}
