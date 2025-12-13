/*
PROBLEM 10:
Create a Singleton class ConfigManager:
- Only one instance allowed
- Provides global access
*/

// WHAT YOU ARE LEARNING:
// Singleton Pattern, Encapsulation, Lazy Initialization

import java.util.HashMap;
import java.util.Map;

class ConfigManager {

    // Private static instance → only one exists
    private static ConfigManager instance;

    // Private data store
    private Map<String, String> settings;

    // Private constructor → prevents external instantiation
    private ConfigManager() {
        settings = new HashMap<>();
    }

    // Public method → provides access to single instance
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    // Set a configuration value
    public void set(String key, String value) {
        settings.put(key, value);
    }

    // Get a configuration value
    public String get(String key) {
        return settings.get(key);
    }
}

// Main class comes last
public class SingletonConfigManagerMain {

    public static void main(String[] args) {

        // Access the singleton instance
        ConfigManager cfg1 = ConfigManager.getInstance();
        ConfigManager cfg2 = ConfigManager.getInstance();

        // Set configuration
        cfg1.set("env", "production");

        // Access configuration from another reference
        System.out.println(cfg2.get("env")); // prints "production"

        // Confirm both references are the same instance
        System.out.println(cfg1 == cfg2); // true
    }
}
