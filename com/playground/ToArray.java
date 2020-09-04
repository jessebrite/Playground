package com.playground;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ToArray {
  public static void main(String[] args) {
    String[] colors = {"Green", "Orange", "White", "Black", "Blue", "Ash"};
    LinkedList<String> list = new LinkedList<>(Arrays.asList(colors));

    list.addLast("Magenta");
    list.add("Grey");
    list.addLast("Blue-black");

    System.out.printf("%nBefore sorting%n");
    printColors(list);

    Collections.sort(list);
    System.out.printf("%nAfter sorting %n");
    printColors(list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.printf("%nAfter sorting in descending order%n");
    printColors(list);

    colors = list.toArray(new String[list.size()]);
  }

  private static void printColors(LinkedList<String> colors) {
    for (String list : colors)
      System.out.printf("%s ", list);
  }

}
