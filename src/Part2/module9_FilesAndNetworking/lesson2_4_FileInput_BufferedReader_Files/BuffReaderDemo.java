package Part2.module9_FilesAndNetworking.lesson2_4_FileInput_BufferedReader_Files;

import java.io.*;

public class BuffReaderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data/staff.txt"));
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
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
