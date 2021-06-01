package ru.geekbrains.lesson1;

public class Main {

    public static void main(String[] args) {
        // Создайте метод checkSumSign(), в теле которого объявите
        // две int переменные a и b, и инициализируйте их любыми значениями,
        // которыми захотите. Далее метод должен просуммировать эти переменные,
        // и если их сумма больше или равна 0, то вывести в консоль сообщение
        // “Сумма положительная”, в противном случае - “Сумма отрицательная”;
        checkSumSign();
    }

    private static void checkSumSign() {
    }

    public static void checkSumSign(int a) {
        a = 0;

        if (a >= 0) {

            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицательная");
        }
    }
}

