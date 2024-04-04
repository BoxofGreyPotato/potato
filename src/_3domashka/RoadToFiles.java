package _3domashka;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
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
    public static void getDirectory(File file) {
        if (file.isDirectory()) {
            String path = file.getAbsolutePath();
            arrayList.add(path);
            getDirectory(new File(path));
        } else {
            return;
        }
    }
    /*public static void writeStringToFile(String path, String str) throws IOException {
        FileWriter fw= new FileWriter(path);
        fw.write(str);
        fw.close();
    }*/

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Напишите каталог ");
        String path = input.nextLine();
        System.out.println("Введите расширение ");
        String extensione = input.nextLine();



        //boolean isExistFile=RoadToFiles.checkWorkDirectory(path, extensione);
        //System.out.println(STR."Exist \{isExistFile}");

        File dirs = new File(path);
        File[] arrFiles = dirs.listFiles();
        assert arrFiles != null;

        //System.out.println(Arrays.toString(arrDirs));
        //System.out.println(Arrays.toString(arrFiles));

        for(int i = 0; i< Objects.requireNonNull(arrFiles).length; i++){
            if(arrFiles[i].isFile()){
                String res = String.valueOf(arrFiles[i]);
                arrayList.add(res);
                }
            else{
                getDirectory(dirs);
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