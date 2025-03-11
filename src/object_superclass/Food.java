package object_superclass;

public class Food {

    private String name;
    private int calories;

    public Food(String name, int calories){
        this.name = name;
        this.calories = calories;
    }

    public String getName(){
        return name;
    }

    public int getCalories(){
        return calories;
    }


    public String toString(){
        return String.format("Food name: %s\nCalories: %d", this.name, this.calories);
    }

    public boolean equals(Food f){
        return f.getCalories() == this.getCalories() && f.getName().equals(this.getName());
    }

}
