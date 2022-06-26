package hackerrank.corejava.dataStructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortStudents {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int T = sc.nextInt();
    sc.nextLine();
    List<Student> listOfStudents = new ArrayList<>();

    while (T-- > 0) {
      int studentId = sc.nextInt();
      String firstName = sc.next();
      double cgpa = sc.nextDouble();

      Student student = new Student(studentId, firstName, cgpa);
      listOfStudents.add(student);
    }

    sortStudents(listOfStudents);
    sc.close();
  }

  public static void sortStudents(List<Student> list) {
    list.sort(
        Comparator.comparing(Student::getCgpa)
            .reversed()
            .thenComparing(Student::getName)
            .thenComparing(Student::getMarks));

    for (Student s : list) {
      System.out.println(s.getName());
    }
  }
}

class Student {
  private int id;
  private String name;
  private double cgpa;

  public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }

  public int getMarks() {
    return id;
  }

  public void setMarks(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCgpa() {
    return cgpa;
  }

  public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
  }
}
