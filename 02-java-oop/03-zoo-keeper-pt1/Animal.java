public class Animal{
    //private String type;
    //private int strength;
    //private int speed;
    //private String color;
    //private int health = 100;
    private String name;
    private int energy = 100;
    
    public int displayEnergy() {
        System.out.println("Energy: " + this.energy);
        return energy;
    }

    //contructor
    //public Animal(String type, int strength, int speed, String color, int health) {
        //this.type = type;
        //this.strength = strength;
        //this.speed = speed;
        //this.color = color;
        //this.health = health;
    //constructor
    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public Animal () {

    }
    public String getName(String name) {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEnergy() {
        return this.energy;
    }

    //public void climb() {
    //}

    //public void throwBanana() {
    //}

    //public void eatBanana() {
    //}
public void battle(String attack){
    int energy = this.energy;
    if(attack.equals("fly")){
        energy -= 50;
    }else if (attack.equals("Eats human")){
        energy += 25;
    }else if (attack.equals("attacks the town")){
        energy -= 100;
    }else {
        System.out.println("move not recongnized");
        return;
    }
    this.energy = energy;
    System.out.println(this.energy);
}
public void movement(String activity){
    int energy = this.energy;
    if (activity.equals("Throw Something")){
        energy -= 5;
    }else if (activity.equals("Eat banana")){
        energy += 10;
    }else if (activity.equals("climb")){
        energy -= 10;
    }else {
        System.out.println("move not recongnized");
        return;
    }
    this.energy = energy;
    System.out.println(this.energy);
}
}
//public void attackTown() {
//}

//public void fly() {
//}

//public void eatHuman() {
//}
//}

    
    
    //public void setStrength(int strength) {
        //this.strength = strength;
    //}
    //public void setType(String type) {
        //this.type = type;
    //}
    //public void setSpeed(int speed) {
        //this.speed = speed;
    //}
    //public void setColor(String color) {
        //this.color = color;
    //}
    //public int getHealth(){
        //return this.health;
    //}
    

    //public String getType(){
        //return this.type;
    //}
    //public int getStrength(){
        //return this.strength;
    //}
    //public int getSpeed(){
        //return this.speed;
    //}
    //public String getColor(String color){
        //return this.color;
    //}
    // animal object can interact and attack another animal object
    //public void battle(Animal target, String powerMove){
        //define how the animal attacks
        //int damage;
        //if(powerMove.equals("fireball")){
            //damage = 3;
        //}else if(powerMove.equals("axe kick")){
            //damage = 4;
        //}else if(powerMove.equals("knockout blow")){
            //damage = 5;
        //}else {
           // System.out.println("move not recognized");
            //return;
        //}
        //muiltiply by strengthx damage
        //int effectiveDamage = this.strength * damage;
        //reduce the targets health by effective damgage
        //int targetsHealth = target.getHealth();
        //targetsHealth -= effectiveDamage;
        //target.setHealth(targetsHealth);
	

        //print to the console what just happened use formatted string
        //System.out.println("%s attacks %s for %d health points", this.type, this.getType(), effectiveDamage());
        //}
    //}
