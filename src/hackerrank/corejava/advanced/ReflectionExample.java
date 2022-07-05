package hackerrank.corejava.advanced;

import hackerrank.corejava.dataStructures.Student;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class ReflectionExample {
  public static void main(String[] args) {
    Class<Student> student = Student.class; // uses class literal, not a function.
    Method[] methods = student.getDeclaredMethods();

    /* Get names from Methods */
    ArrayList<String> methodNames = new ArrayList<>();
    for (Method method : methods) {
      methodNames.add(method.getName());
    }

    /* Sort and print names */
    Collections.sort(methodNames);
    for (Object name : methodNames) {
      System.out.println(name);
    }
  }
}
