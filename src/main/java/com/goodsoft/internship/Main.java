package com.goodsoft.internship;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        HashSet<String> strings = new HashSet<>();
        for (int i=1; i<6; i++)
            strings.add("Строка " + i);

        System.out.println("Вывод с применением foreach:");
        strings.forEach(s -> System.out.print(s + "; "));
        System.out.println();

        strings.add("Строка 1");

        Iterator<String> iterator = strings.iterator();
        System.out.println("Вывод с применением итератора:");
        while (iterator.hasNext())
            System.out.print(iterator.next()+"; ");
        System.out.println();

        //===================================================

        HashSet<User> users = new HashSet<>();
        for (int i=1; i<6; i++)
            users.add(new User(i, "Nickname "+i));

        System.out.println("Множество пользовательских классов:");
        users.forEach(u->System.out.print(u + "; "));
        System.out.println();

        users.add(new User(1, "Nickname 1"));

        System.out.println("Мн-во после попытки добавления дубликата:");
        users.forEach(u->System.out.print(u + "; "));
        System.out.println();

    }
}