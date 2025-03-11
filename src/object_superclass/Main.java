package object_superclass;

public class Main {
    public static void main(String[] args){
        Food cheesePizzaOne = new Food("Cheese Pizza", 285);
        System.out.println(cheesePizzaOne);
        Food pepperoniPizzaOne = new Food("Pepperoni Pizza", 246);
        Food pepperoniPizzaTwo = new Food("Pepperoni Pizza", 246);

        System.out.println(pepperoniPizzaOne.equals(pepperoniPizzaTwo));



    }
}
