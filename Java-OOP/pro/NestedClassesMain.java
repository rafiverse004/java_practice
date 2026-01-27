/*
PROBLEM 18:
Demonstrate static nested class and non-static inner class
*/

// WHAT YOU ARE LEARNING:
// Inner Classes, Nested Classes, Scope and Access Rules

class Outer {

    private String outerName = "OuterClass";

    // Static nested class → cannot access instance members directly
    static class StaticNested {
        void show() {
            System.out.println("I am a static nested class");
        }
    }

    // Non-static inner class → can access outer instance members
    class Inner {
        void show() {
            System.out.println("I am an inner class inside " + outerName);
        }
    }
}

// Main class comes last
public class NestedClassesMain {

    public static void main(String[] args) {

        // Static nested class → no Outer instance needed
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.show();

        // Inner class → requires Outer instance
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
