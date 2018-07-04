public class Gorilla extends Mammal{
    public void throwSomething(){
        System.out.println("Throw things at people");
        energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println("Eat bananas");
        energyLevel += 10;
    }
    public void climb(){
        System.out.println("Climbing");
        energyLevel -= 10;
    }
}