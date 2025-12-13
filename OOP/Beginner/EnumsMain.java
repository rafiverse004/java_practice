/*
PROBLEM 20:
Create an enum Day with a method isWeekend()
*/

// WHAT YOU ARE LEARNING:
// Enums, Encapsulation in Enums, Method in Enum

enum Day {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Method to check if the day is weekend
    boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

// Main class comes last
public class EnumsMain {

    public static void main(String[] args) {

        for (Day d : Day.values()) {
            System.out.println(d + " is weekend? " + d.isWeekend());
        }
    }
}
