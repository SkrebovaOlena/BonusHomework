package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // �������� ��������� �����
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println("random numbers: " + numbers.toString());

        // ��������� �������� ���������� �������, � ��������� ���� ��� ������
        Integer sum = numbers.stream()
                .filter(integer -> integer %2==0)
                .reduce(0, Integer::sum);
        System.out.println("task 1" + sum);

        // ��������� �������� ���������� �������, � ��������� ������� ��� �� ������
        long count = numbers.stream()
                .filter(a -> a %2!=0)
                .count();
        System.out.println("task 2 " + count);

        // ����� ������
        List<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("cat");
        strings.add("rabbit");
        strings.add("turtle");
        strings.add("hamster");
        System.out.println("strings: " + strings.toString());

        // �������� ����� ������ � ������� �� ������� ���� ����� 5 ��������
        System.out.println("task 3: ");
        strings.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        // �������� ����� ������ � ������� �� �� ������ ����� �a�
        System.out.println("task 4: ");
        strings.stream()
                .filter(s -> s.contains("a"))
                .forEach(System.out::println);

        // ������������ ��� String � ����������������� �������
        System.out.println("task 5: ");
        strings.stream()
                .sorted()
                .forEach(System.out::println);

        // ������� ������� ���� �a� � ����� String
        long countOfChar = strings.toString().chars()
                .mapToObj(s -> (char) s)
                .filter(s -> s == 'a')
                .count();
        System.out.println("task 6:" + countOfChar);
    }
}
