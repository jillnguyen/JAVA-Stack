import java.lang.Math;
public class Pythagorean{
    public double getHypotenuse(int legA, int legB){
        double squareC = legA * legA + legB * legB;
        double legC = Math.sqrt(squareC);
        return legC;
    }
}