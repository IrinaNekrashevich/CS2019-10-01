package by.it.nekrashevich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("Hi");
        array.add("Good evening");
        array.add("What's up");
        array.add("Morning");
        System.out.println(array.size());
        for (String s : array) {
            System.out.println(s);
        }

    }
}
