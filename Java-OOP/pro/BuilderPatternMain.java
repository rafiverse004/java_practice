/*
PROBLEM 22:
Implement Builder pattern for House class with optional parameters
*/

// WHAT YOU ARE LEARNING:
// Builder Pattern, Fluent API, Optional Parameters in OOP

class House {

    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    // Builder inner class
    static class HouseBuilder {
        private int windows;
        private int doors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public void showDetails() {
        System.out.println("House [windows=" + windows + ", doors=" + doors
                + ", garage=" + hasGarage + ", swimmingPool=" + hasSwimmingPool + "]");
    }
}

// Main class comes last
public class BuilderPatternMain {

    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .setWindows(4)
                .setDoors(2)
                .setGarage(true)
                .build();

        house.showDetails();
    }
}
