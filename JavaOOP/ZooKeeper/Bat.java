public class Bat extends Mammal{
    public Bat(){
        this.energyLevel = 300;
    }
    public void attackTown(){
        System.out.println("Attack town");
        energyLevel -= 100;
    }
    public void eatHumans(){
        System.out.println("Eat humans");
        energyLevel += 25;
    }
    public void fly(){
        System.out.println("Flying");
        energyLevel -= 50;
    }
}