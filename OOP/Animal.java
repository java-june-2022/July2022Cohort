import java.util.ArrayList;

public class Animal {
    private static ArrayList<Animal> all = new ArrayList<>();

   

    private String species;
    private int height;
    private int weight;
    private int stamina;
    private boolean hasFur;
    private boolean hasWings;
    private boolean isLiving;

    

    public Animal() {}

    // Overloading the constructor
    public Animal(String species, int height, int weight, boolean hasFur, boolean hasWings, boolean isLiving) {
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.hasFur = hasFur;
        this.hasWings = hasWings;
        this.isLiving = isLiving;
        this.stamina = 100;
        create(this.species);
        Animal.addToList(this);
    }

    public void create(String species) {
        System.out.println("You have created a " + species);
    }

    public void run() {
        this.stamina-=3;
        System.out.println(this.stamina);
    }

    



    // Getters and Setters

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public boolean isLiving() {
        return isLiving;
    }

    public void setLiving(boolean isLiving) {
        this.isLiving = isLiving;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Static methods

    public static ArrayList<Animal> getAll() {
        return all;
    }

    public static void setAll(ArrayList<Animal> all) {
        Animal.all = all;
    }

    public static void show() {
        for (Animal animal : Animal.getAll()) {
            System.out.println(animal.getSpecies());
        }
    }

    public static void addToList(Animal animal) {
        Animal.all.add(animal);
    }

    
}