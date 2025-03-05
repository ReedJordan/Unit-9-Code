package pet_demo;

public class Pet {
    private String name;

    public Pet(String name){
        this.name = name; //default pet name
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return "";
    }

    @Override
    public String toString(){
        return String.format("My name is %s and I say %s",name,speak());
    }

}
