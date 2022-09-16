package hackerrank.corejava.dataStructures;

public class GenericExample {
    public static void main(String[] args) {
        printArray(1);
        printArray(2);
        printArray(3);
        printArray("Hello");
        printArray("World");
    }

    static <T> void printArray(T data) {
        System.out.println(data);
    }
}
