public class Project{
    private String name;
    private String description;
    private double initialCost;
    public Project(){
        this.name = "";
        this.description= "";
    }
    public void setName(String name){
        this.name = name;
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getInfo(){
        return ("Project name ("+ this.initialCost + ") is: " + this.name + ". Project description is: " + this.description);
    }
    public void setCost(double cost){
        initialCost = cost;
        System.out.println("Cost set " + cost);
    }
    public double getCost(){
        return initialCost;
    }   
}