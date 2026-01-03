public class Dog extends Animal {
    String dogType;
    
    public Dog(String name, int age, String color, String dogType){
        super(dogType, age, dogType);
        this.dogType = dogType;
    }

    @Override
    public void makeSound() {
        System.out.println(dogType + " makes a sound");
    }
}
