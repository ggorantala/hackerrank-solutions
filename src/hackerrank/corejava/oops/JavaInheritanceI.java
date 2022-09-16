package hackerrank.corejava.oops;

interface asd {
    void sing();
}

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal implements asd {
    void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}

public class JavaInheritanceI {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
