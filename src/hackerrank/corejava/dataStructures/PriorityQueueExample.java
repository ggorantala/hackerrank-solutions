package hackerrank.corejava.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {
  private static final Scanner scan = new Scanner(System.in);
  private static final Priorities priorities = new Priorities();

  public static void main(String[] args) {
    int totalEvents = Integer.parseInt(scan.nextLine());
    List<String> events = new ArrayList<>();

    while (totalEvents-- != 0) {
      String event = scan.nextLine();
      events.add(event);
    }

    List<StudentPQ> students = priorities.getStudents(events);

    if (students.isEmpty()) {
      System.out.println("EMPTY");
    } else {
      for (StudentPQ st : students) {
        System.out.println(st.getName());
      }
    }
  }
}

class StudentPQ implements Comparable<StudentPQ> {
  String name = "";
  double cgpa;
  int id;

  public StudentPQ(String name, double cgpa, int id) {
    this.name = name;
    this.cgpa = cgpa;
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public int compareTo(StudentPQ s) {
    if (cgpa == s.cgpa) {
      if (name.compareTo(s.name) == 0) {
        if (id == s.id) return 0;
        else if (id > s.id) return 1;
        else return -1;
      } else return name.compareTo(s.name);
    } else if (cgpa > s.cgpa) return -1;
    else return 1;
  }
}

class Priorities {
  public ArrayList<StudentPQ> getStudents(List<String> events) {
    PriorityQueue<StudentPQ> pq = new PriorityQueue<>();
    for (String i : events) {
      String[] s;
      s = i.split("\\s");
      if (s.length > 1) {
        pq.add(new StudentPQ(s[1], Double.parseDouble(s[2]), Integer.parseInt(s[3])));
      } else {
        pq.poll();
      }
    }
    while (pq.size() > 1) {
      System.out.println(pq.poll().name);
    }
    return new ArrayList<>(pq);
  }
}
