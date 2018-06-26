public class FizzBuzzTest{
    public static void main(String[] args){
        FizzBuzz test = new FizzBuzz();
        String myResult1 = test.fizzBuzz(25);
        String myResult2 = test.fizzBuzz(14);
        String myResult3 = test.fizzBuzz(24);
        String myResult4 = test.fizzBuzz(150);
        System.out.println("25: " + myResult1 + "; 14: "+ myResult2 + "; 24: "+ myResult3 + "; 150: " + myResult4);
    }
}