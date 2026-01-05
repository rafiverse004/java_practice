import java.util.ArrayList;

public class Pet {
    String name;
    String type;
    String owner;

    public static ArrayList<Pet> allPets = new ArrayList<>();

    public Pet(String name, String type){
        this.name = name;
        this.type = type;
        allPets.add(this);
    }

    public Pet(String name, String type, String owner){
        this.name = name;
        this.type = type;
        this.owner = owner;
        allPets.add(this);
    }

    public static void showReport(){
        for(Pet p : allPets){
            System.out.println("Name: " + p.name);
            System.out.println("Type: " + p.type);
            if(p.owner!=null){
                System.out.println("Owner: " + p.owner);
            }
        }
    }

    public void describe(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        if(owner!=null){
            System.out.println("Owner: " + owner);
        }
    }

    public void describe(Boolean showOwner){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        if(showOwner && owner!=null){
            System.out.println("Owner: " + owner);
        }
    }
}
