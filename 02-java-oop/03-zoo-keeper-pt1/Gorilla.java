public class Gorilla extends Animal {
    public Gorilla(int energy) {
        setEnergy(100);
        }
        public void throwBanana() {
            System.out.println("Gorilla throws banana.");
            setEnergy(-5);
        }
        public void eatBanana() {
            System.out.println("Gorilla looks full.");
            setEnergy(+10);
        }
        public void climb() {
            System.out.println ("Gorilla is tired.");
            setEnergy(-10);
        }
}
