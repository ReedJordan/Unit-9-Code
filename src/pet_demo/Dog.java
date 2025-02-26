package pet_demo;

public class Dog extends Pet{
    public Dog(){
        super("Fido");
    }

    public Dog(String name){
        super(name);
    }
    @Override
    public String speak(){
        return "Bark";
    }
}
