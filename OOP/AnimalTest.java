public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("Tiger", 5, 50, true, false, true);
        Animal b = new Animal("Lion", 8, 70, true, false, true);
        Animal c = new Animal("Bear", 10, 120, true, false, true);
        Animal d = new Animal("Oh my!", 10, 120, true, false, true);
        System.out.println(a.getSpecies());
        Animal.show();
        a.run();
        a.run();
        a.run();
        
    }
}
