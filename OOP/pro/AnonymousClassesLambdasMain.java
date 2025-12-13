/*
PROBLEM 19:
Use anonymous class and lambda expression to implement Action interface
*/

// WHAT YOU ARE LEARNING:
// Anonymous Classes, Lambda Expressions, Functional Interfaces, Lightweight OOP

interface Action {
    void execute();
}

// Main class comes last
public class AnonymousClassesLambdasMain {

    public static void main(String[] args) {

        // Anonymous class
        Action a1 = new Action() {
            @Override
            public void execute() {
                System.out.println("Anonymous class executed");
            }
        };
        a1.execute();

        // Lambda expression → functional interface
        Action a2 = () -> System.out.println("Lambda executed");
        a2.execute();
    }
}
