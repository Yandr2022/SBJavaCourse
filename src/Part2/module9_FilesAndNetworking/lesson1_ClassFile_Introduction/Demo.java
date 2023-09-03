package Part2.module9_FilesAndNetworking.lesson1_ClassFile_Introduction;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File rootFile =  new File("info.txt");
        File projectDirFile =  new File("data/staff.txt");
        File absolutePathFile =  new File("C:\\Users\\Юлия\\OneDrive\\Documents");

        System.out.println(rootFile.length());
        System.out.println(projectDirFile.length());
        System.out.println(absolutePathFile.length());

        System.out.println(rootFile.lastModified());
        System.out.println(projectDirFile.lastModified());
        System.out.println(absolutePathFile.lastModified());

        File dir = new File("C:\\Users\\Юлия\\OneDrive\\Рабочий стол\\X");
        if(dir.isDirectory()){
            File[] fileList = dir.listFiles();
            for (File f:fileList) {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
