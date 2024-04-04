package _4domashka;

import java.io.*;

public class SaverRunnable implements Runnable {
    private final Plant plant;
    private final String path;

    public SaverRunnable(Plant plant, String path) {
        this.path = path;
        this.plant = plant;
    }

    @Override
    public void run() {
        if (this.path != null && this.plant != null) { // проверка, что параметры не null FileOutputStream fos;
            FileOutputStream fos;
            try {

                fos = new FileOutputStream(this.path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(plant);

                plant.writeExternal(oos);

                oos.close();
            } catch (IOException ex) {
                System.out.println(this.path);
            }
        }
    }
}
