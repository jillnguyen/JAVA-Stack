public class Mammal{
    public int energyLevel;
    public Mammal(){
        this.energyLevel = 100;
    }
    public int displayEnergy(){
        String showInfo = "Energy level is " + Integer.toString(this.energyLevel);
        System.out.println(showInfo);
        return energyLevel;
    }

}