package pet_demo;

public class Cat extends Pet {
    private String sound;

    public Cat(String name, String sound){
        super(name);
        this.sound = sound;
    }
    @Override
    public String speak(){
        return sound;
    }

    public void claw(){
        System.out.println(super.getName()+" is clawing.");
    }

    @Override
    public String toString(){
        return super.toString()+" and I like to claw.";
    }
}
