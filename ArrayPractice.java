/**
 * Name: <your name here>
 *
 *
 * Core Topics: Creating Arrays of Primitives/Strings, Passing Arrays of Primitives/Strings as Parameters, Returning Arrays of Primitives/Strings
 * from Methods, Arrays static class methods (sort and toString())
 */
public class ArrayPractice {

    public static void main(String[] args) {
        int[] arr1 = createEvenArray(5);

        // TODO: create a String of bracketed elements in arr1 using a for loop and then print the string 

        // TODO: print out elements in arr1 using Arrays.toString()


        // use an initializer list to create an array of doubles
        double[] grades = {67.5, 45.3, 98.2, 78.5, 98.5};

        // call calcAverage and pass the decimal array and print the returned average of the grades
        double avg = calcAverage(grades);
        // print the average to 2 decimal places using printf
        System.out.printf("Grade Average: %.2f\n" , avg);

                
        // TODO: sort and then print out the grades array
        
        //TODO: use an initializer list to create an array of integers


         //TODO: SKIP/OPTIONAL use a random number generator to create an array of integers
        
        // TODO call calcAverage and pass an integer array and print the returned average of the numbers

        // TODO: use an initializer list to create an array of names
        
        // TODO: call reverseStrings and pass the array of names and print the returned array
        
        // TODO: call stringLength and pass the array of names and print the returned array



    }

    /**
     * This method will create an integer array of even numbers starting at 2.  The size indicates how many
     * even numbers will be placed in the array.  For example the call: createEvenArray(5) will return the 
     * integer array [2, 4, 6, 8, 10]
     * The method throws an IllegalArgumentException if the size < 0
     * @param size number of elements in array 
     * @return integer array filled with even numbers of length size
     */
    public static int[] createEvenArray(int size){

      return null;
    }

    /**
     * This method calculates the average of the numbers in the array
     * This method throws an IllegalArgumentException if nums.length = 0
     * @param nums array of decimal numbers
     * @return the average of the nums
     */
    public static double calcAverage(double[] nums){
        return 0.0;
    }

    /**
     * This method calculates the average of the numbers in the array
     * This method throws an IllegalArgumentException if nums.length = 0
     * @param nums array of integer numbers
     * @return the average of the nums
     */
     // TODO: finish this method
    public static double calcAverage(int[] nums){
        return 0.0;
    }

    /**
     * This method constructs and returns an array of Strings that contains all of the strings passed to the method in reverse. 
     * @param names array of strings with names
     * @return array of strings (names in reverse)
     */
    public static String[] reverseStrings(String[] names){
        return null;
    }

    /**
     * This method constructs and returns an array of integers that contains all the lengths of the strings passed to the method. 
     * @param names array of strings with names
     * @return array of integers holding the lengths of the names
     */
  // TODO: finish this method
    public static int[] stringLength(String[] names){
        return null;
    }

}
