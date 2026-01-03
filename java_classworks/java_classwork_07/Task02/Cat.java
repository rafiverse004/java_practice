public class Cat extends Animal {
    String catType;
    
    public Cat(String name, int age, String color, String catType){
        super(catType, age, catType);
        this.catType = catType;
    }

    @Override
    public void makeSound() {
        System.out.println(catType + " makes a sound");
    }
}
