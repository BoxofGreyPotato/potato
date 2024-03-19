package _2domashka;


import java.util.*;

public class PassportApplicaton {
    public static ArrayList<Passport> passportList = new ArrayList<>() {
        {
            add(new Passport(123456, "Иванов Иван Иванович", "Бухалтер", false));
            add(new Passport(121342, "Аванов Аван Аванович", "Главный Бухалтер", true));
            add(new Passport(724927, "Биванов Биван Биванович", "Младший Бухалтер", true));
            add(new Passport(836747, "Ванов Ван Ванович", "Не Бухалтер", false));
            add(new Passport(217387, "Неванов Неван Неванович", "Не", false));
        }
    };


    public static Scanner input = new Scanner(System.in);

    public static void addPassport() {


        int number = input.nextInt();

        String fio = input.nextLine() + input.nextLine();
        String job = input.nextLine();
        boolean isPassed = input.nextBoolean();
        Iterator<Passport> iterator = passportList.iterator();
        while (iterator.hasNext()) {
            Passport remover = iterator.next();
            if (number == remover.getNumber() && !fio.equals(remover.getFio())) {
                iterator.remove();
            }
        }
        passportList.add(new Passport(number, fio, job, isPassed));
        showPassport();
    }

    public static void showPassport() {
        passportList.sort(Passport::compareTo);
        for (Passport passport : passportList) {
            System.out.println(passport);
        }
        System.out.println("\n");
        passportList.sort(new Comparator<Passport>() {
            @Override
            public int compare(Passport o1, Passport o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });
        for (Passport passport : passportList) {
            System.out.println(passport);
        }


    }


    public static void main(String[] args) {


        System.out.println("Добавление пропуска. Напишите номер пропуска, ФИО, должность через Enter");
        addPassport();

    }
}
