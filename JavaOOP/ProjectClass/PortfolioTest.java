import java.util.ArrayList;
public class PortfolioTest{
    public static void main(String[] args){
        Portfolio testPortfolio = new Portfolio();
        Project number1 = new Project("Have fun");
        Project number2 = new Project("Master Java", "Complete all assignments up to Java on the Web");
        Project number3 = new Project("Build portfolio", "Deploy and put on resume");
        number2.setCost(200);
        number1.setCost(100);
        number3.setCost(300);
        testPortfolio.addProjects(number1);
        testPortfolio.addProjects(number2);
        testPortfolio.addProjects(number3);
        testPortfolio.getPortfolioCost();
        testPortfolio.showPortfolio();
        testPortfolio.getProjects();
    }
}