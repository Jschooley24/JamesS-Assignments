public class Animal{
    private String type;
    private int strength;
    private int speed;
    private String color;
    private int health = 100;

    public Animal(String type, int strength, int speed, String color, int health){
        this.type = type;
        this.strength = strength;
        this.speed = speed;
        this.color = color;
        this.health = health;
    }
    public int setHealth(int health){
        return this.health;
    }
    public int setStrength(int strength){
        return this.strength;
    }
    public int setType(string type){
        return this.type;
    }
    public int setSpeed(int speed){
        return this.speed;
    }
    public int setColor(string color){
        return this.color;
    }
    public int getHealth(){
        return this.health;
    }
    

    public int getType(){
        return this.type;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getSpeed(){
        return this.speed;
    }
    public int getColor(){
        return this.color;
    }
    // animal object can interact and attack another animal object
    public void battle(Animal target, String powerMove){
        //define how the animal attacks
        int damage;
        if(powerMove.equals("fireball")){
            damage = 3;
        }else if(powerMove.equals("axe kick")){
            damage = 4;
        }else if(powerMove.equals("knockout blow")){
            damage = 5;
        }else {
            System.out.println("move not recognized");
            return;
        }
        //muiltiply by strengthx damage
        int effectiveDamage = this.strength * damage;
        //redude the targets health by effective damgage
        int targetsHealth = target.getHealth();
        targetsHealth -= effectiveDamage;
        target.setHealth(targetsHealth);

        //print to the console what just happened use formatted string
        System.out.println("%s attacks %s for %d health points", this.type, this.getType(), effectiveDamage())
        }
    }
}