package com.playground;

public class Array {

  private final int[] items;
  private int count;

  public Array (int length) {
    items = new int[length];
  }

  public void print() {
    for (int i = 0; i < count; i++) {
      System.out.println(items[i]);
    }
  }
}
