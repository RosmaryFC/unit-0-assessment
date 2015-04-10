package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
        System.out.print("printHelloWorld: ");
        printHelloWorld();
        System.out.println("returnPrimitiveBooleanTrue: " + returnPrimitiveBooleanTrue());
        System.out.println("returnPrimitiveInt1729: " + returnPrimitiveInt1729());
        System.out.println("returnPrimitiveDoubleThreePointOneFour: " + returnPrimitiveDoubleThreePointOneFour());
        System.out.println("returnPrimitiveCharZ: " + returnPrimitiveCharZ());
        System.out.print("printSumOf1Upto10UsingForLoop: ");
        printSumOf1Upto10UsingForLoop();
        System.out.print("printSumOf1Upto10000UsingForLoop: ");
        printSumOf1Upto10000UsingForLoop();
        System.out.println("isOdd: " + isOdd(1234560));
        System.out.println("isMultipleOfThree: " + isMultipleOfThree(9));
        System.out.println("isOddAndIsMultipleOfThree: " + isOddAndIsMultipleOfThree(24));
        System.out.println("repeatStringXTimes: " + repeatStringXTimes("potato", 5));
        System.out.println("returnStringUntilQ: " + returnStringUntilQ("ubiquitous"));
    }

    public static void printHelloWorld() {//complete

        System.out.println("Hello World");
    }

    public static Boolean returnPrimitiveBooleanTrue() { //complete

        return true;
    }

    public static int returnPrimitiveInt1729() { //complete

        int primitiveInt = 1729;
        return primitiveInt;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() { //complete

        double ThreePointOneFour = 3.14;
        return ThreePointOneFour;
    }

    public static char returnPrimitiveCharZ() { // complete

        char primitiveCharZ = 'Z';
        return primitiveCharZ;
    }

    public static void printSumOf1Upto10UsingForLoop() { // todo: check again

        int num = 0;
        for(int i =1; i <= 10; i++){
            num += i;
            //System.out.print(num + " ");
        }
        System.out.println(num);
    }

    public static void printSumOf1Upto10000UsingForLoop() {//todo: check again

        int num = 0;
        for(int i =1; i <= 10000; i++){
            num += i;
            //System.out.print(num + " ");
        }
        System.out.println(num);
    }

    public static boolean isOdd(int n) { // complete

        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMultipleOfThree(int n) { //complete

        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) { // complete

        if(n % 3 == 0 && n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".

        String inputMultipliedByTimes = "";
        for(int i = 0; i < times; i++) {
            inputMultipliedByTimes += input;
        }

        return inputMultipliedByTimes;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        String inputStopsAtQ = "";
        for(int i = 0; i < input.length()-1; i++){
            
        }
        for(int i = 0; i <= input.length() -1; i++){
            if (input.charAt(i) == 'q') {
                break;
            }
            inputStopsAtQ += input.charAt(i);

        }
        return inputStopsAtQ;
    }

    public static Person declareAndReturnPersonNamedAda() {
      return null;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      return null;
    }

    public static boolean isFromLondon(Person person) {
      return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
