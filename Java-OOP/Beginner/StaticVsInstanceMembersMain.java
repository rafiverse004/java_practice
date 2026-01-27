/*
PROBLEM 17:
Demonstrate difference between static and instance variables
*/

// WHAT YOU ARE LEARNING:
// Static vs Instance Members, Class vs Object Scope

class Counter {

    // Static → shared by all objects
    static int staticCount = 0;

    // Instance → separate for each object
    int instanceCount = 0;

    public void increment() {
        staticCount++;
        instanceCount++;
    }

    public void showCounts() {
        System.out.println("Static Count: " + staticCount + ", Instance Count: " + instanceCount);
    }
}

// Main class comes last
public class StaticVsInstanceMembersMain {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        c1.showCounts(); // Static:1, Instance:1

        c2.increment();
        c2.showCounts(); // Static:2, Instance:1

        c1.showCounts(); // Static:2, Instance:1
    }
}
