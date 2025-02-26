package pet_demo;

public class Cat extends Pet {
    public Cat(){
        super("Mittens");
    }
    public Cat(String name){
        super(name);
    }
    @Override
    public String speak(){
        return "Meow";
    }
}
