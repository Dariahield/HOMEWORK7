import java.text.DecimalFormat;

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
        System.out.println("Задача 1");
        int money = 15_000;
        int i = 0;
        int j = 0;
        for (; j <= 2_459_000; j = j + money) {
            i++;

            System.out.println("«Месяц " + i + " сумма накоплений равна" + j + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int j = 0;
        while (j < 10) {
            j++;

            System.out.print(j + " ");

        }
        System.out.println();
        for (; j > 0; j = j - 1) {
            System.out.print(j + " ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int dies = 8;
        int born = 17;
        double diesCoefficient = dies / (double) 1000;
        double bornCoefficient = born / (double) 1000;
        for (int i = 1; i < 11; i++) {
            int delta = (int) (population + bornCoefficient - population * diesCoefficient);
            population = population + delta;

            System.out.println("Year " + i + " population " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double money = 15000;
        int i = 1;
        while (money < 12_000_000) {
            money = money + (money * 0.07);
            {
                System.out.println(" Месяц " + i + " сумма " + money);
                i++;
            }

        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        double money = 15000;
        int i = 1;
        while (money < 12_000_000) {
            money = money + (money * 0.07);
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " сумма " + money);
            }
            i++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double money = 15000;
        int i = 1;
        DecimalFormat DesimalFormat = new DecimalFormat("0.0");
        while (i < 109) {
            money = money + (money * 0.07);
            if (i % 6 == 0) {
                System.out.println(" Месяц " + i + " сумма " + money);
            }
            i++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        while (friday < 31) {
            System.out.println("Today is Friday!" + friday);
            friday += 7;

        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int now = 2023;
        int past = now - 200;
        int future = now + 100;
        for (int i = past; i < future; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
        }
    }
}}


