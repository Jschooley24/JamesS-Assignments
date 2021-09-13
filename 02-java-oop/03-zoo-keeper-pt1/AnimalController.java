public class AnimalController extends Animal {
    

    public static void main(String[] args) {
        //for when constructor has type,strength,speed,color,energy level
        //Animal dragon = new Animal("Dragon", 10, 4,"Blue", 100);
        //Animal unicorn = new Animal("Unicorn", 15, 5, "white", 100);
        //Animal gorilla = new Animal("monkey" , 20, 3, "Gray", 100);
        Animal gorilla = new Animal("bob", 100);
        Animal bat = new Animal ("dracula", 300);
        
        gorilla.movement("Throw Something");
        gorilla.movement("Eat banana");
        gorilla.movement("climb");
        bat.battle("fly");
        
    }

}
