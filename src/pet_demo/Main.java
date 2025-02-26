package pet_demo;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cat c2 = new Cat("Winston");
        Dog d = new Dog();
        Dog d2 = new Dog("Oscar");
        Pet p = new Pet("Millie");
        Pet p2 = new Pet();
        System.out.println(c);
        System.out.println(c2);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(p);
        System.out.println(p2);
    }
}
