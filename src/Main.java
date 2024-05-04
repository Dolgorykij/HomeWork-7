//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            int savings = 15000;
            int capital = 0;
            int month = 0;
            while (capital < 2490000) {
                capital = capital + savings;
                capital = capital + capital / 100;
                month++;
                System.out.println("Месяц " + month + " - сумма накоплений равна " + capital);
            }
        }

        System.out.println("Задание 2");
        {
            int num = 1;
            while (num <= 10) {
                System.out.print(num + " ");
                num++;
            }
        }
        System.out.println();

        {
            int num = 10;
            while (num >= 1) {
                System.out.print(num + " ");
                num--;
            }
        }
        System.out.println();
        System.out.println("Задание 3");
        {
            int population = 12000000;
            double birthRate = 0.017;
            double deathRate = 0.008; //204000
            int year = 0;
            while (year < 11) {
                System.out.println("Год " + year + ", численность населения составляет " + population);
                population = (int) (population + (birthRate * population) - (deathRate * population));
                year++;
            }
        }
        System.out.println("Задание 4");
        {
            int start = 15000;
            double percent = 0.07;
            int month = 0;
            while (start <= 12000000) {
                month++;
                start = (int) (start + (start * percent));
                System.out.println("За " + month + " месяц накоплений сумма вклада составила " + start);
            }
            System.out.println("Василию потребуется такое количество месяцев - " + month + " - для сбора нужной суммы");
        }

        System.out.println("Задание 5");
        {
            int start = 15000;
            double percent = 0.07;
            int month = 1;
            for (; start <= 12000000; month++) {
                start = (int) (start + (start * percent));
                if (month % 6 == 0) {
                    System.out.println("За " + month + " месяц накоплений сумма вклада составила " + start);
                }
            }
        }
        System.out.println("Задание 6");
        int start = 15000;
        double percent = 0.07;
        int month = 1;          // В итоге нормально так и не придумал как прописать переменную year чтобы все работало, поэтому оставил как есть
        for (; month <= 108; month++) {
            start = (int) (start + (start * percent));
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяц накоплений сумма вклада составила " + start);
            }
        }
        System.out.println("За 9 лет сумма накоплений равна " + start);

        System.out.println("Задание 7");
        int day = 1;
        int friday = 2;
        for (; day <=31; day++) {
            System.out.println("Сегодня " + day + " число");
            if (day % 7 == friday) {
                System.out.println("Сегодня пятница - " + day + " число.Необходимо подготовить отчет");
            }
        }
        System.out.println("Задание 8");
        int year = 2024;
        int yearPast = year - 200;
        int yearFuture = year + 100;
        //boolean comet = year % 79 == 0;                     // Можно ли через boolean использовать, как в этом примере? Просто мне ошибку выдаёт
        for (year =  yearPast;year <= yearFuture; year++) {
           // if (boolean) {     Типа такого
                if (year % 79 == 0) {
                System.out.println("Комета пролетела в " + year + " году");
            }
        }


    }
}