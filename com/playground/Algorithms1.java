package com.playground;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
  public static void main(String[] args) {
    Character[] letters = {'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M'};
    List<Character> list = Arrays.asList(letters);
    System.out.println("The list contains:");
    output(list);

    Collections.reverse(list);
    System.out.printf("%nAfter reversing:%n");
    output(list);

    Character[] arrayCopy = new Character[8];
    List<Character> listCopy = Arrays.asList(arrayCopy);

    Collections.copy(listCopy, list);
    System.out.printf("%nAfter copying from list%n");
    output(listCopy);

    Collections.fill(list, 'R');
    System.out.printf("%nAfter filling list with 'R':%n");
    output(list);

  }

  private static void output(List<Character> lists) {
    for (Character list : lists)
      System.out.printf("%c ", list);

    System.out.printf("%nMaximum value: %s", Collections.max(lists));
    System.out.printf("%nMinimum value: %s%n", Collections.min(lists));
  }

}
