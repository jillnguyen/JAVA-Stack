import java.util.ArrayList;
public class Portfolio{
    private ArrayList<Project> myPortfolio;
    public void addProjects(Project projectname){
        myPortfolio.add(projectname);
    }
    public void getProjects(){
        for(Project project: myPortfolio){
            project.getInfo();
        }
    }
    public double getPortfolioCost(){
        double sum = 0;
        for(Project project: myPortfolio){
            sum += project.getCost();
        }
        return sum;
    }
    public String showPortfolio(){
        String myShow = "";
        for(Project project: myPortfolio){
            myShow.concat(project.getInfo());
        }
        String cost = Double.toString(this.getPortfolioCost());
        myShow.concat(cost);
        return myShow;
    }
}