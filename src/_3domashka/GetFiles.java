package _3domashka;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
/*import java.util.Formattable;
import java.util.Objects;*/
import java.util.Scanner;

    /*public static boolean checkWorkDirectory(String path, String extName){
        File workDir = new File(STR."\{path}/\{extName}");
        return workDir.exists();
    }*/

public class GetFiles {
    public static byte[] readBytesFromFile(File pathfile) throws IOException {
        if (pathfile.exists()) {
            FileInputStream fis = new FileInputStream(pathfile);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            fis.close();
            return data;
        } else {
            return new byte[]{};
        }
    }

    public static void readFiles(File[] files) throws IOException {
        for (File file : files) {
            if (file.isDirectory()) {
                arrayList.add(file.getAbsolutePath());
                readFiles(file);
            } else {
                arrayList.add(String.format("%s %s", file.getAbsolutePath(),
                        readBytesFromFile(file).length));
            }
        }
    }

    public static void readFiles(File file) throws IOException {
        File[] files = file.listFiles();
        assert files != null;
        readFiles(files);
    }


    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static ArrayList<String> finaleArrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        System.out.println("Салахов Айдар Ильдарович РИБО-04-22 4 вариант");

        System.out.println("Напишите каталог ");
        String path = input.nextLine();
        System.out.println("Введите расширение ");
        String extensione = input.nextLine();


        File file = new File(path);
        File[] files = file.listFiles();
        assert files != null;
        readFiles(files);


        arrayList.sort(String::compareTo);

        for (String s : arrayList) {
            if (s.contains(extensione)) {
                finaleArrayList.add(s);
            }
        }
        finaleArrayList.forEach(System.out::println);

    }
}
