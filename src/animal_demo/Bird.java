package animal_demo;

public class Bird extends Animal{

    private String featherType;

    public Bird(String name, int age, String featherType){
        super(name, age);
        this.featherType = featherType;
    }

    public void flap(){
        System.out.printf("%s flapped", this.getName());
    }


}
