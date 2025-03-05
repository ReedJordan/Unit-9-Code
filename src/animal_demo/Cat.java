package animal_demo;

public class Cat extends Mammal{

    private int numClaws;

    public Cat(String name, int age, String hairType, int numClaws){
        super(name,age,hairType);
        this.numClaws = numClaws;
    }

    public void meow(){
        System.out.printf("%s meowed", this.getName());
    }

}
