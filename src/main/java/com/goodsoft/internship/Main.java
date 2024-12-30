package com.goodsoft.internship;

import java.util.ArrayList;
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

        //===================================================

        System.out.println("Задание 2");

        ArrayList<String> strArray = new ArrayList<>();
        for (int i=1; i<4; i++)
            strArray.add("Строка " + i);

        System.out.println("Вывод с применением for, аналогичного foreach:");
        for (String s : strArray)
            System.out.print(s + "; ");

        System.out.println("\nВывод с добавлением элемента на 2-ую позицию после вывода 3-го:");
        for (int i=0; i<strArray.size();i++) {
            System.out.print(strArray.get(i) + "; ");
            if (i==2) strArray.add(1, "new");
        }

        System.out.println("\nРезультат:");
        strArray.forEach(s->System.out.print(s + "; "));
        /*Размер strArray и позиция последнего элемента
        увеличивыаются на единицу, последний элемент выводится повторно*/

        System.out.println("\nВывод с удалением 2-го элемента после вывода 3-го:");
        for (int i=0; i<strArray.size();i++) {
            System.out.print(strArray.get(i) + "; ");
            if (i==2) strArray.remove(1);
        }

        System.out.println("\nРезультат:");
        strArray.forEach(s->System.out.print(s + "; "));
        /*Размер strArray уменьшается на единицу, цикл
         не доходит до последнего элемента*/

    }
}