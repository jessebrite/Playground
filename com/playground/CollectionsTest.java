package com.playground;

import java.util.*;

public class CollectionsTest {
  public static void main(String[] args) {
    String[] cars1 = {"Toyota", "Honda", "Mitsubishi", "Opel", "Benz", "BMW"};
    List<String> list1 = new LinkedList<>();
    Collections.addAll(list1, cars1);

    System.out.printf("Initial cars in list1:%n");
    printList(list1);

    String[] cars2 = {"Jeep", "Kantanka", "Innoson", "Kia", "Hyundai"};

    List<String> list2 = new LinkedList<>(Arrays.asList(cars2));

    list1.addAll(list2);
    System.out.println("After adding list2 to list1");
    printList(list1);

    convertToUpperCase(list1);
    System.out.printf("Convert to upper case:%n");
    printList(list1);

    System.out.printf("Deleting elements 4 to 6...%n");
    removeItems(list1, 4, 6);
    printList(list1);

    System.out.println("Calling printReservsed()");
    printReservedList(list1);

  }

  private static void printReservedList(List<String> list) {
    ListIterator<String> iterator = list.listIterator(list.size());
    while (iterator.hasPrevious())
      System.out.printf("%s ", iterator.previous());
  }

  private static void removeItems(List<String> list, int start, int end) {
    list.subList(start, end).clear();
  }

  private static void convertToUpperCase(List<String> list1) {
    ListIterator<String> iterator = list1.listIterator();
    while (iterator.hasNext()) {
      String car = iterator.next();
      iterator.set(car.toUpperCase());
    }
  }

  private static void printList(List<String> list1) {
    for (String car : list1)
      System.out.printf("%s ", car);
    System.out.println();
  }
}
