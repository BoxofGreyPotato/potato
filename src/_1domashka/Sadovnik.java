package _1domashka;

import java.util.Scanner;
//Вариант 4. Для работы с сущностью РАСТЕНИЕ (Plant) разработать класс
//САДОВНИК, в котором метод filter будет изменять название растения по
//следующему алгоритму:
// В названии должны отсутствовать гласные буквы.
// К концу получившегося названия растения необходимо дописать строку
//«VGTBL».
//Начальные значения полей для сущности РАСТЕНИЕ вводит пользователь с
//клавиатуры после старта программы. В результате работы программы
//необходимо вывести на экран все значения полей (в том числе измененное)
//через запятую.


public class Sadovnik {
    public void filter(Rastenie plant) {
        String namePlant = plant.getName();
        namePlant = namePlant.replaceAll("[eaiuyo]", "");
        namePlant += "VGTBL";
        plant.setName(namePlant);
    }


    public static void main(String[] args) {
        System.out.println("Салахов Айдар Ильдарович РИБО-04-22 4 вариант");
        System.out.println("Введите название растения.");
        Scanner inPlant = new Scanner(System.in);
        Rastenie plant = new Rastenie(inPlant.nextLine());
        Sadovnik sadov = new Sadovnik();
        sadov.filter(plant);
        inPlant.close();
        System.out.println("Новое растение " + plant.getName());
    }
}