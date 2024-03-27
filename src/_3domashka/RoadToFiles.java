package _3domashka;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class RoadToFiles {

    /*public static boolean checkWorkDirectory(String path, String extName){
        File workDir = new File(STR."\{path}/\{extName}");
        return workDir.exists();
    }*/
    public static byte[] readBytesFromFile(String path) throws IOException{
        File file = new File(path);
        if(file.exists()){
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            fis.close();
            return data;
        }
        else{
            return new byte[]{};
        }
    }
    /*public static void writeStringToFile(String path, String str) throws IOException {
        FileWriter fw= new FileWriter(path);
        fw.write(str);
        fw.close();
    }*/

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Напишите каталог ");
        String path = input.nextLine();
        System.out.println("Введите расширение ");
        String extensione = input.nextLine();



        //boolean isExistFile=RoadToFiles.checkWorkDirectory(path, extensione);
        //System.out.println(STR."Exist \{isExistFile}");

        File dirs = new File(path);
        String [] arrDirs = dirs.list();
        File[] arrFiles = dirs.listFiles();
        //System.out.println(Arrays.toString(arrDirs));
        //System.out.println(Arrays.toString(arrFiles));

        for(int i = 0; i< Objects.requireNonNull(arrDirs).length; i++){
            boolean contains = arrDirs[i].contains(".");
            if(arrDirs[i].endsWith(extensione)  && contains){
                assert arrFiles != null;
                String res = String.valueOf(arrFiles[i]);

                try{
                    byte[] arr = RoadToFiles.readBytesFromFile(path + "\\" + arrDirs[i]);

                    res +=" " + arr.length;
                    System.out.println(res);

                } catch (IOException exception){
                    System.out.println(exception.getMessage());
                }

            }


        }


        /*if(isExistFile){
            String data="example";
            try{
                RoadToFiles.writeStringToFile("E:\\IdeaProjects\\potato\\110\\test.txt", data);
            } catch (IOException exception){
                System.out.println(exception.getMessage());
            }
        }*/



    }
}
