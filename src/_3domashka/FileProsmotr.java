/*
package _3domashka;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FileProsmotr{
    File dirs = new File(path);
    String [] arrDirs = dirs.list();
    File[] arrFiles = dirs.listFiles();



        for(int i = 0; i< arrDirs.length; i++){
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





}

*/
