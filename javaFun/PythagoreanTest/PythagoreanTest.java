public class PythagoreanTest{
    public static void main(String[] args){
        Pythagorean myCal = new Pythagorean();
        double myResult = myCal.getHypotenuse(3,4);
        System.out.println("Hypotenuse is: " + myResult);
    }
}