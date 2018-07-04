public class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project();
        project1.setName("StudyJava");
        Project project2 = new Project("Finish Projects", "Complete Python, MEAN and create Java projects");
        project2.setCost(200);
        String info2 = project2.getInfo();
        System.out.println(info2);
    }
}