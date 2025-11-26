package org.example.colproj.labs.lab4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) { //створення об'єктів різних типів номерів

        Economy e11 = new Economy(1L, "Економ", 1, 800);
        Family f21 = new Family(2L, "Сімейний", 5, 1000);
        Standard s31 = new Standard(3L, "Стандарт", 7, 900);
        Lux l41 = new Lux(4L, "Люкс", 3, 1500);
        LuxPlus lp51 = new LuxPlus(5L, "Люкс плюс", 2, 2000);
        Family f22 = new Family(22L, "Сімейний", 3, 1100);
        Economy e12 = new Economy(12L, "Економ", 5, 750);
        Standard s33 = new Standard(33L, "Стандарт", 4, 910);

        List<Room> list1 = new ArrayList<>(); //створення колекції List для певних номерів
        list1.add(e11);
        list1.add(s31);
        list1.add(l41);

        Set<Room> set1 = new HashSet<>(); //створення колекції Set для певних номерів
        set1.add(e12);
        set1.add(f21);
        set1.add(s33);
        set1.add(lp51);
        set1.add(f22);

        System.out.println("=== Усі номери в list1 ==="); //вивід всіх номерів з колекції List
        list1.forEach(r -> System.out.println(r));

        System.out.println("\n=== Номери з ціною > 1000 ==="); //вивід номерів з колекції Set, у яких ціна більша 1000
        set1.stream()
                .filter(r -> r.getPrice() > 1000)
                .forEach(r -> System.out.println(r));

    }
}
