package animal_demo;

public class Mammal extends Animal{

    private String hairType;

    public Mammal(String name, int age, String hairType){
        super(name,age);
        this.hairType = hairType;
    }

    public void move(){
        System.out.printf("%s moved", this.getName());
    }

}
