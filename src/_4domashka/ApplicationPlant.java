package _4domashka;

import java.util.Scanner;
public class ApplicationPlant {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Салахов Айдар Ильдарович РИБО-04-22 4 вариант");
        System.out.println("Добавление растения. Напишите высоту, ширину, имя, тип,дикое ли оно.");

        String higth = input.nextLine();
        String wigth = input.nextLine();
        String name = input.nextLine();
        String type = input.nextLine();
        boolean isWild = input.nextBoolean();
        input.nextLine();

        System.out.println("Напишите путь.");

        String path = input.nextLine();

        Plant plant = new Plant(name, wigth, higth, type, isWild);

        SaverRunnable saverRunnable = new SaverRunnable(plant, path);
        Thread sohranka = new Thread(saverRunnable, "fail");
        sohranka.start();
    }
}

