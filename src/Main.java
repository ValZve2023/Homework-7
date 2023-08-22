import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        // task 1
        System.out.println("task 1");
        int totalSum = 0;
        int month = 0;
        while (totalSum <= 2_459_000) {
            totalSum += 15000;
            ++month;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSum + " рублей");
    }

    public static void task2() {
        // task2
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void task3() {
        // task 3
        System.out.println("task 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int j = 1; j <= 10; j++) {
            population += population / 1000 * (fertility - mortality);
            System.out.println("Год " + j + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        // task 4
        System.out.println("task 4");
        int many = 0;
        int month = 0;
        while (many <= 12_000_000) {
            many += 15000;
            many *= 1.07;
            ++month;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + many + " рублей");
        }
    }

    public static void task5() {
        // task 5
        System.out.println("task 5");
        int many = 0;
        int month = 0;
        while (many <= 12_000_000) {
            many += 15000;
            many *= 1.07;
            ++month;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + many + " рублей");
            }
        }
    }

    public static void task6() {
        // task 6
        System.out.println("task 6");
        int many = 0;
        for (int i = 1; i <= 9 * 12; i++) {
            many += 15_000;
            many *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + many + " рублей");
            }
        }
    }

    public static void task7() {
        // task 7
        System.out.println("task 7");
        for (int friday = 4; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        // task 8
        System.out.println("task 8");
        int currentYear = LocalDate.now().getYear();
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int i = startYear; i <= endYear; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }

        }
    }
}