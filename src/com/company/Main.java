package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // колекція рандомних чисел
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("random numbers: " + numbers.toString());

        // Заповнити колекцію рандомними числами, і повернути суму всіх парних
        Integer sum = numbers.stream()
                .filter(integer -> integer %2==0)
                .reduce(0, Integer::sum);
        System.out.println("task 1" + sum);

        // Заповнити колекцію рандомними числами, і повернути кількість всіх не парних
        long count = numbers.stream()
                .filter(a -> a %2!=0)
                .count();
        System.out.println("task 2 " + count);

        // масив стрінгів
        List<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("cat");
        strings.add("rabbit");
        strings.add("turtle");
        strings.add("hamster");
        System.out.println("strings: " + strings.toString());

        // Створити масих стрінгів і вивести всі довжина яких більше 5 елементів
        System.out.println("task 3: ");
        strings.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        // Створити масих стрінгів і вивести всі які містять букву ‘a’
        System.out.println("task 4: ");
        strings.stream()
                .filter(s -> s.contains("a"))
                .forEach(System.out::println);

        // Просортувати ліст String у лексикографічному порядку
        System.out.println("task 5: ");
        strings.stream()
                .sorted()
                .forEach(System.out::println);

        // Вивести кількість букв ‘a’ у масиві String
        long countOfChar = strings.toString().chars()
                .mapToObj(s -> (char) s)
                .filter(s -> s == 'a')
                .count();
        System.out.println("task 6:" + countOfChar);
    }
}
