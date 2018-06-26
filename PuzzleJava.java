import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava{
    public static void main(String[] args){

    }
    // Create an array. Print Sum and another array of values greater than 10
    public static void sumAndGreaterThan10(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        int mysum = 0;
        myArray.add(3);
        myArray.add(5);
        myArray.add(1);
        myArray.add(2);
        myArray.add(7);
        myArray.add(9);
        myArray.add(8);
        myArray.add(13);
        myArray.add(25);
        myArray.add(32);
        for (int value: myArray){
            mysum += value;
            if(value>10){
                greaterthan10.add(value);
            }
        };
        System.out.println(mysum);
        System.out.println(greaterThan10);
    }
    // Shuffle array of names and return array of names longer than 5 characters
    public static void nameArray(){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> selectednames = new ArrayList<String>();
        names.add("Lucy");
        names.add("Harry");
        names.add("Albert");
        names.add("Jillie");
        names.add("George");
        names.add("Max");
        Collections.shuffe(names);
        for(String name: names){
            System.out.println(name);
            if (name.length()>5){
                selectednames.add(name)
            };
        };
    }
    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message
    public static void letterArray(){
        ArrayList<Char> letters = new ArrayList<Char>();
        String vowels = "eauio";
        letters.add("a");
        letters.add("b");
        Collections.shuffle(letters);
        System.out.println(letters);
        if (volwels.contain(letters.get(0))){
            System.out.println("First Letter Is Vowel");
        }
    }
    // Generate and return an array with 10 random numbers between 55-100.
    public static void randomNumber(){
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (i=0;i<10;i++){
            Random ran = new Random();
            int x = ran.nextInt(45) + 55;
            randomList.add(x);
        }
        System.out.println(randomList);
    }
    // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public static void sortNumber(){
        ArrayList<Integer> sortList = new ArrayList<Integer>();
        for (i=0;i<10;i++){
            Random ran = new Random();
            int x = ran.nextInt(45) + 55;
            sortList.add(x);
        }
        Collections.sort(sortList);
        System.out.println(sortList);
    }
    // Create a random string that is 5 characters long.
    public static String randomString(int[] rndArray){
        int rnd = new Random().nextInt(5);
        return rndArray[rnd];
    }
    
}