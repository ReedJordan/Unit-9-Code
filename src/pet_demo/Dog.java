package pet_demo;

public class Dog extends Pet{
    private String sound;

    public Dog(String name, String sound){
        super(name);
        this.sound = sound;
    }
    @Override
    public String speak(){
        return sound;
    }

    public void dig(){
        System.out.println(super.getName() +" is digging");
    }
}
