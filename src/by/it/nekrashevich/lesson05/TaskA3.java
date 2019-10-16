package by.it.nekrashevich.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Найти минимальный и максимальный элементы массива.
4. Вывести эти два элемента на экран, через пробел.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0 9
*/

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        int[] list = new int[10];
        int max, min;
        Scanner sc = new Scanner(System.in);
        max = min = list[0];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) min = list[i];
            if (list[i] > max) max = list[i];
        }
        System.out.println(min + " " + max);
    }
}


