public class Bat extends Animal {
    public Bat (int energyLevel){
        setEnergy (300);
    }
    public void fly(){
        System.out.println("fly away");
        setEnergy(-50);
    }
    public void eatHuman(){
        System.out.println("Bat looks....messy");
        setEnergy(+25);
    }
    public void attackTown(){
        System.out.println("roaring fire Snap crackle pop");
        setEnergy(-100);
    }

}