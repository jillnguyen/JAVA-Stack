public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String ans1 = manipulator.trimAndConCat("   It's ", "   Null");
        System.out.println(ans1);
        Integer ans2 = manipulator.getIndexOrNull("Sunny and Shining", "o");
        if(ans2 != -1){
            System.out.println(ans2);
        } else {
            System.out.println("Null");
        }
        Integer ans3 = manipulator.getIndexOrNull("Hello, who's it?", "who");
        if(ans3 != -1){
            System.out.println(ans3);
        } else {
            System.out.println("Null");
        }
        String ans4 = manipulator.concatSubString("I don't know when it's done", 3, 8, "Fine");
        System.out.println(ans4);
    }
}