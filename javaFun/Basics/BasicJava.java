import java.util.ArrayList;

public class BasicJava{
    public static void main(String [] args){
        // Print odd between 1-255
        for (int i=1; i< 256 ; i++){
            if ((i % 2) == 1){
                System.out.println(i);
            }
        };
        // Print Sum
        int thesum = 0;
        for (int i=1; i < 256; i++){
            thesum += i;
            System.out.println("New number: " + i + " Sum: " + thesum);
        };

        // Iterate through an array
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(2);
        myArray.add(32);
        myArray.add(14);
        myArray.add(-8);
        myArray.add(3);
        for (int value: myArray){
            System.out.println(value);
        };
    
        // Find max
        int themax = myArray.get(0);
        for (Integer value: myArray){
            if(value>themax){
                themax=value;
            }
        }
        System.out.println("Maximum value is: " + themax);
    
        // Get average
        double theaverage = thesum / myArray.size();
        System.out.println("Average value is " + theaverage);
        // Array with odd numbers
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for (int i=1; i<256; i+=2){
            oddArray.add(i); 
        }
        System.out.println(oddArray);
    }
    
    // Greater than Y
    public int greaterThanY(int[] checkArray, int number){
        int countValue = 0;
        for (Integer value: checkArray){
            if(value>number){
                countValue ++;
            }
        }
        return countValue;
    }
    // Square the values
    public ArrayList<Integer> squareValues(ArrayList<Integer> squareArray){
        ArrayList<Integer> squaredResult = new ArrayList<Integer>();
        for(int value: squareArray){
            squaredResult.add(value*value);
        }
        return squaredResult;
    }
    // Exchange Negative Numbers by 0
    public ArrayList<Integer> eliminateValues(ArrayList<Integer> eliminateArray){
        for (Integer i: eliminateArray){
            if (i<0){
                i = 0;
            }
        }
        return eliminateArray;
    }
    public ArrayList<Double> maxMinAverage(ArrayList<Integer> numberArray){
        double mysum = 0;
        double mymax = numberArray.get(0);
        double mymin = numberArray.get(0);
        for (double x: numberArray){
            mysum += x;
            if(x>mymax){
                mymax = x;
            }
            if (x<mymin){
                mymin = x;
            }
        }
        ArrayList<Double> result = new ArrayList<Double>();
        result.add(mysum);
        result.add(mymax);
        result.add(mymin);
        return result;
    }
    public ArrayList<Integer> shiftArray(ArrayList<Integer> arrayToShift){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0 ; i < arrayToShift.size() - 1 ; i++){
            newArray.add(arrayToShift.get(i+1));
        }
        return newArray;
    }

    
}