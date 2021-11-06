package com.company;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        byte months = 12;
        short days = 31;
        int years = 2021;
        long longValue = 23466L;

        float fractionalValue = 3.14f;
        double pi = 3.1415926535897932384626433832795028841971693993751058209749;

        // Задание 2

        float firstFighter = 78.2f;
        float secondFighter = 82.7f;

        float totalWeight = firstFighter + secondFighter;
        float weightDifference = secondFighter - firstFighter;

        System.out.println("Общий вес бойцов " + totalWeight + " кг.");
        System.out.println("Разница в весе бойцов " + weightDifference + " кг.");

        // Задание 3
        System.out.println("");

        byte bananasQuantity = 5;
        int bananasWeight = bananasQuantity * 80;

        short milkVolume = 200;
        int milkQuantity = milkVolume / 100;
        int milkWeight = milkQuantity * 105;

        byte iceCreamQuantity = 2;
        int iceCreamWeight = iceCreamQuantity * 100;

        byte eggsQuantity = 4;
        int eggsWeight = eggsQuantity * 70;

        float totalGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalKilograms = totalGrams / 1_000;

        System.out.println("Общий вес спорт-завтрака " + totalGrams + " гр. или " + totalKilograms + " кг.");

        // Задание 4
        System.out.println("");

        byte excessWeight = 7;
        int excessWeightGrams = excessWeight * 1_000;

        int quarter = excessWeightGrams / 250;
        int half = excessWeightGrams / 500;

        System.out.println("Потребуется дней на похудение, при похудении на 250 гр. в день: " + quarter);
        System.out.println("Потребуется дней на похудение, при похудении на 500 гр. в день: " + half);

        int averageDaysQuantity = (quarter + half) / 2;
        System.out.println("В среднем потребуется дней на похудение: " + averageDaysQuantity);

        // Задание 5
        System.out.println("");

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int cristinaSalary = 76_230;

        int mashaYearSalary = mashaSalary * 12;
        int denisYearSalary = denisSalary * 12;
        int cristinaYearSalary = cristinaSalary * 12;

        float mashaSalaryIncrease = mashaSalary * 0.1f;
        float denisSalaryIncrease = denisSalary * 0.1f;
        float cristinaSalaryIncrease = cristinaSalary * 0.1f;

        float mashaNewSalary = mashaSalary + mashaSalaryIncrease;
        float denisNewSalary = denisSalary + denisSalaryIncrease;
        float cristinaNewSalary = cristinaSalary + cristinaSalaryIncrease;

        float mashaYearSalaryIncreased = mashaNewSalary * 12;
        float denisYearSalaryIncreased = denisNewSalary * 12;
        float cristinaYearSalaryIncreased = cristinaNewSalary * 12;

        float mashaYearSalaryDifference = mashaYearSalaryIncreased - mashaYearSalary;
        float denisYearSalaryDifference = denisYearSalaryIncreased - denisYearSalary;
        float cristinaYearSalaryDifference = cristinaYearSalaryIncreased - cristinaYearSalary;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaYearSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + cristinaNewSalary + " рублей. Годовой доход вырос на " + cristinaYearSalaryDifference + " рублей.");

        // Задание 6
        System.out.println("");

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d * e));
        result = 0 - result;

        System.out.println(result);

        // Задание 7
        System.out.println("");

        a = 5;
        b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Задание 8
        System.out.println("");

        a = 265;
        b = a / 10 % 10;

        System.out.println("b = " + b);

    }
}
