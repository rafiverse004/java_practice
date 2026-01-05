public class Cat extends Animal {
    String breed;
    
    public Cat(String name, int age, String color, String breed){
        super(name, age, color);
        this.breed = breed;
    }

    @Override
    public String info() {
        return "Name: " + name + "\nAge: " + age + "\nColor:" + color+ "\nBreed: " + breed + "\n";
    }

    @Override
    public void makeSound() {
        System.out.println(color + " color " + name + " is meowing\n");
    }
}
