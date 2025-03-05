package pet_demo;

public class Feral extends Cat {
    public Feral(String name, String sound){
        super(name,sound);
    }

    @Override
    public String toString(){
        return String.format("My name is %s and I hiss alot",super.getName());
    }
}
