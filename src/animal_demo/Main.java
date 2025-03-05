package animal_demo;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();

        Animal animal1 = new Animal("Fish",2);
        System.out.println(animal1);

        Animal mammal1 = new Mammal("Platypus", 5, "insulating");
        Poodle poodle1 = new Poodle("Poodle", 2, "fluffy", 10);
        Poodle poodle2 = (Poodle) poodle1;
        ((Poodle) poodle1).prance();


    }
}