package animal_demo;

public class Dalmatian extends Dog{

    private int numSpots;

    public Dalmatian(String name, int age, String hairType, int numSpots){
        super(name, age, hairType, "Dalmatian");
        this.numSpots = numSpots;
    }

    public void work(){
        System.out.printf("%s worked", this.getName());
    }
}
