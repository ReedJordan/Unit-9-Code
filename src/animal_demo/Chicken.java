package animal_demo;

public class Chicken extends Bird{

    private boolean hasGobble;

    public Chicken(String name, int age, String featherType, boolean hasGobble){
        super(name,age,featherType);
        this.hasGobble = hasGobble;
    }

    public void peck(){
        System.out.printf("%s pecked", this.getName());
    }

}
