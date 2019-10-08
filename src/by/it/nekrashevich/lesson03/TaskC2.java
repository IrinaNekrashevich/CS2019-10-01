package by.it.nekrashevich.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static void main(String[] args) {
        System.out.println("Введите целое четырехзначное число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sumDigitsInNumber(a));
    }

    public static int sumDigitsInNumber(int number) {
        int firstdig = number % 10;
        int number1 = number / 10;
        int seconddig = number1 % 10;
        int number2 = number1 / 10;
        int thirddig = number2 % 10;
        int number3 = number2 / 10;
        return number3 + thirddig + seconddig + firstdig;
    }


//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
