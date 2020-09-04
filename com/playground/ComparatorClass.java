package com.playground;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass implements Comparator<Student> {

  @Override
  public int compare(Student student1, Student student2) {
    return student1.getAge() - student2.getAge();
  }
}

class SortByName implements Comparator<Student> {

  @Override
  public int compare(Student student1, Student student2) {
    return student1.getName().compareTo(student2.getName());
  }
}

@Data
@AllArgsConstructor
class Student {
  private String name;
  private String department;
  private int age;

  public String toString() {
    return String.format("%s %s %s %s %s %d%n", "Name:", getName(),
      "Department:", getDepartment(), "Age:", getAge());
  }
}

class Test {
  public static void main(String[] args) {
    List<Student> list = Arrays.asList(
      new Student("James", "Computer Science", 17),
      new Student("Anane", "Engineering", 14),
      new Student("Zidane", "CMathematics", 16),
      new Student("Steve", "Engineering", 19),
      new Student("Kelvin", "Social Sciences", 12),
      new Student("Zelda", "Humanities", 14)
    );

    System.out.println("Unsorted List");
    printOutput(list);

    System.out.println("\nSorting by getAge()");
    list.sort(new ComparatorClass());
    printOutput(list);

    System.out.println("\nSorting by getAge()");
    list.sort(new SortByName());
    printOutput(list);
  }

  private static void printOutput(List<Student> list) {
    for (Student student : list)
      System.out.printf("%s ", student);
  }
}
