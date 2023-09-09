package Part2.module9_FilesAndNetworking.lesson2_4_FileInput_BufferedReader_Files.homework;

import java.io.File;

public class Demo {
    public static void main(String[] args) {

        System.out.println(showConvertSize(getDirectorySize("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\X")));

    }

    public static long getDirectorySize(String path) {
        long size = 0L;
        File dir = new File(path);
        if (dir.isDirectory()) {
            File[] fileList = dir.listFiles();
            for (File f : fileList) {
                size += f.isFile() ? f.length() : getDirectorySize(f.getAbsolutePath());
            }
        } else {
            size += dir.length();
        }
        return size;
    }

    public static String showConvertSize(long sizeToByte){
        StringBuilder builder = new StringBuilder("Size is ");
        if(sizeToByte<1024){
            builder.append(sizeToByte).append(" byte");
        } else if(sizeToByte<Math.pow(1024,2)){
            builder.append(Math.round((sizeToByte/1024d)*100)/100d).append(" Kb");
        } else if (sizeToByte<Math.pow(1024,3)) {
            builder.append(Math.round((sizeToByte/Math.pow(1024,2))*100)/100d).append(" Mb");
        }else {
            builder.append(Math.round((sizeToByte/Math.pow(1024,3))*100)/100d).append(" Gb");
        }
        return builder.toString();
    }
}
