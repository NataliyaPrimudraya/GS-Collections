package com.goodsoft.internship;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        HashSet<String> strings = new HashSet<>();
        for (int i = 1; i < 6; i++)
            strings.add("Строка " + i);

        System.out.println("Вывод с применением foreach:");
        strings.forEach(s -> System.out.print(s + "; "));
        System.out.println();

        strings.add("Строка 1");

        Iterator<String> iterator = strings.iterator();
        System.out.println("Вывод с применением итератора:");
        while (iterator.hasNext()) System.out.print(iterator.next() + "; ");
        System.out.println();

        //===================================================

        HashSet<User> users = new HashSet<>();
        for (int i = 1; i < 6; i++)
            users.add(new User(i, "Nickname " + i));

        System.out.println("Множество пользовательских классов:");
        users.forEach(u -> System.out.print(u + "; "));
        System.out.println();

        users.add(new User(1, "Nickname 1"));

        System.out.println("Мн-во после попытки добавления дубликата:");
        users.forEach(u -> System.out.print(u + "; "));
        System.out.println();

        //===================================================

        System.out.println("Задание 2");

        ArrayList<String> strArray = new ArrayList<>();
        for (int i = 1; i < 4; i++)
            strArray.add("Строка " + i);

        System.out.println("Вывод с применением for, аналогичного foreach:");
        for (String s : strArray)
            System.out.print(s + "; ");

        System.out.println("\nВывод с добавлением элемента на 2-ую позицию после вывода 3-го:");
        for (int i = 0; i < strArray.size(); i++) {
            System.out.print(strArray.get(i) + "; ");
            if (i == 2) strArray.add(1, "new");
        }

        System.out.println("\nРезультат:");
        strArray.forEach(s -> System.out.print(s + "; "));
        /*Размер strArray и позиция последнего элемента
        увеличивыаются на единицу, последний элемент выводится повторно*/

        System.out.println("\nВывод с удалением 2-го элемента после вывода 3-го:");
        for (int i = 0; i < strArray.size(); i++) {
            System.out.print(strArray.get(i) + "; ");
            if (i == 2) strArray.remove(1);
        }

        System.out.println("\nРезультат:");
        strArray.forEach(s -> System.out.print(s + "; "));
        /*Размер strArray уменьшается на единицу, цикл
         не доходит до последнего элемента*/

        //===================================================

        System.out.println("\nЗадание 3");
        System.out.println("Работа с словарём HashMap<String, String>");

        HashMap<String, String> strMap = new HashMap<>();
        for (int i = 1; i < 4; i++)
            strMap.put("Ключ " + i, "Строка " + i);

        System.out.println("Вывод с применением foreach:");
        strMap.forEach((k, v) -> System.out.print("(" + k + ": " + v + "); "));

        strMap.put("Ключ 3", "new");

        System.out.println("\nВывод с применением for, аналогичного foreach:");
        for (Map.Entry<String, String> entry : strMap.entrySet())
            System.out.print("(" + entry.getKey() + ": " + entry.getValue() + "); ");


        System.out.println("\nРабота с словарём HashMap<User, String>");
        HashMap<User, String> userMap = new HashMap<>();
        for (int i = 1; i < 4; i++)
            userMap.put(new User(i, "Ключ " + i), "Строка " + i);

        System.out.println("Вывод с применением foreach:");
        userMap.forEach((k, v) -> System.out.print("(" + k + ": " + v + "); "));

        userMap.put(new User(3, "Ключ 3"), "new");

        System.out.println("\nВывод с применением for, аналогичного foreach:");
        for (Map.Entry<User, String> entry : userMap.entrySet())
            System.out.print("(" + entry.getKey() + ": " + entry.getValue() + "); ");

        //===================================================

        System.out.println("\nЗадание 4");
        TreeSet<String> strSorted = new TreeSet<>();
        strSorted.add("Н");
        strSorted.add("А");
        strSorted.add("П");
        System.out.println("Отсортированное множество строк:");
        strSorted.forEach(s -> System.out.print(s + "; "));

        TreeSet<User> usersSorted = new TreeSet<>();
        usersSorted.add(new User(1, "Н"));
        usersSorted.add(new User(2, "А"));
        usersSorted.add(new User(3, "П"));
        System.out.println("\nОтсортированное мн-во пользовательских классов:");
        usersSorted.forEach(u -> System.out.print(u + "; "));

        //===================================================

        System.out.println("\nЗадание 5");

        TreeMap<String, String> strSortedMap = new TreeMap<>();
        strSortedMap.put("Н", "П");
        strSortedMap.put("А", "Ю");
        strSortedMap.put("П", "Н");
        System.out.println("Отсортированный словарь с ключами-строками:");
        strSortedMap.forEach((k, v) -> System.out.print("(" + k + ": " + v + "); "));

        TreeMap<User, String> usersSortedMap = new TreeMap<>();
        usersSortedMap.put(new User(1, "Н"), "П");
        usersSortedMap.put(new User(2, "А"), "Ю");
        usersSortedMap.put(new User(3, "П"), "Н");
        System.out.println("\nОтсортированный словарь с ключами-классами:");
        usersSortedMap.forEach((k, v) -> System.out.print("(" + k + ": " + v + "); "));

    }
}