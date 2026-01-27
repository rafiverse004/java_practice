/*
PROBLEM 12:
Implement a plugin architecture:
- Define a Plugin interface
- Implement multiple plugins
- Load and execute them polymorphically
*/

// WHAT YOU ARE LEARNING:
// Interfaces, Polymorphism, Dynamic Behavior, Loose Coupling

// Plugin interface → defines common behavior
interface Plugin {
    void execute();
}

// HelloPlugin → prints a greeting
class HelloPlugin implements Plugin {

    @Override
    public void execute() {
        System.out.println("Hello Plugin executed!");
    }
}

// TimePlugin → prints current system time
class TimePlugin implements Plugin {

    @Override
    public void execute() {
        System.out.println("Time Plugin executed: " + java.time.LocalTime.now());
    }
}

// Main class comes last
public class PluginArchitectureMain {

    public static void main(String[] args) {

        // Polymorphic plugin list
        Plugin[] plugins = { new HelloPlugin(), new TimePlugin() };

        // Execute all plugins dynamically
        for (Plugin p : plugins) {
            p.execute();
        }
    }
}
