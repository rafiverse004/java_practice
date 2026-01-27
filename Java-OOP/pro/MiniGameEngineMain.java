/*
PROBLEM 13:
Build a mini game engine:
- Abstract Entity class
- Player and NPC subclasses
- Updatable interface
- Event dispatching
*/

// WHAT YOU ARE LEARNING:
// Abstract Classes, Interfaces, Inheritance, Polymorphism, Game Loop Concept

import java.util.ArrayList;
import java.util.List;

// Updatable interface → anything that can be updated each frame
interface Updatable {
    void update();
}

// Abstract Entity → base class for all game objects
abstract class Entity implements Updatable {

    protected String name;

    public Entity(String name) {
        this.name = name;
    }

    // Abstract update method → implemented by subclasses
    public abstract void update();
}

// Player entity
class Player extends Entity {

    public Player() {
        super("Player");
    }

    @Override
    public void update() {
        System.out.println(name + " moves based on player input.");
    }
}

// NPC entity
class NPC extends Entity {

    public NPC(String npcName) {
        super(npcName);
    }

    @Override
    public void update() {
        System.out.println(name + " performs AI behavior.");
    }
}

// EventDispatcher → manages all updatable entities
class EventDispatcher {

    private List<Updatable> entities = new ArrayList<>();

    public void addEntity(Updatable e) {
        entities.add(e);
    }

    public void runFrame() {
        for (Updatable e : entities) {
            e.update();
        }
    }
}

// Main class comes last
public class MiniGameEngineMain {

    public static void main(String[] args) {

        EventDispatcher dispatcher = new EventDispatcher();

        // Add entities
        dispatcher.addEntity(new Player());
        dispatcher.addEntity(new NPC("Goblin"));
        dispatcher.addEntity(new NPC("Dragon"));

        // Simulate a single frame update
        dispatcher.runFrame();
    }
}
