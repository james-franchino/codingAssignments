package Assignment;

public class codingAssignment {
    public static void main(String[] args) {
        // 1. Creating our int array
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1.a. Subtracting the first element from the last
        int result = ages[ages.length - 1] - ages[0];
        System.out.println(result);

        // 1b. Create int array ages2 with 9 elements
        int[] ages2 = new int[9];
        // 1b.1 add 9 elements to ages2 (I'm using the numbers from above and adding another)
        ages2[0] = 3;
        ages2[1] = 9;
        ages2[2] = 23;
        ages2[3] = 64;
        ages2[4] = 2;
        ages2[5] = 8;
        ages2[6] = 28;
        ages2[7] = 93;
        ages2[8] = 7;

        // 1b.2 Repeating subtraction from 1a
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println(result2);

        // 1b.3 Proving that using index values is dynamic. I will create a method to subtract the first element
        // from the last of an array. Results below
        int result3 = subtractFirstLast(ages);
        System.out.println(result3);

        int result4 = subtractFirstLast(ages2);
        System.out.println(result4);

        int[] ages3 = {4, 75, 9564};
        int result5 = subtractFirstLast(ages3);
        System.out.println(result5);

        // Method successfully runs on arrays of any size

        // 1c. Create a loop to iterate through the array and find the average ages

        // adding the ages together
        int sumeAge = 0;
        for (int age : ages) {
            sumeAge += age;
        }
        // Getting the average
        double averageAge = sumeAge / ages.length;
        System.out.println(averageAge);

        System.out.println("-------------------------------------------");

        // 2.  Create String array names
        String[] names = {"Sam", "Tommy", "Tim", "Jack", "Sally", "Buck", "Bob"};

        // 2.a Calculate average number of letters per name using a loop
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        // calculate the average
        double averageLetters = totalLetters / names.length;
        System.out.println(averageLetters);

        // 2.b Use a loop to iterate through the array again and concatenate all the names together,
        // separated by spaces, and print the result to the console.
        // For this I will use a StringBuilder for efficiency
        StringBuilder concatNames = new StringBuilder();
        //loop
        for (String name : names) {
            concatNames.append(name).append(" ");
        }
        // Print the result
        System.out.println(concatNames.toString());

        System.out.println("-------------------------------------------");

        // 3
        // int last = array[array.length - 1]

        //4
        // int first = array[0]

        //5 Create nameLengths array
        int[] nameLengths = new int[names.length];

        // iterate over names and add the length of each name to nameLengths
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        // Print the nameLengths array
        System.out.println("Name lengths ");
        for (int length : nameLengths) {
            System.out.println(length + " ");
        }

        System.out.println("-------------------------------------------");

        // 6 Write a loop to iterate over the nameLengths array and calculate the sum of all
        // the elements in the array. Print the result to the console.
        // Int to hold the sum
        int lengthSum = 0;
        // Enhanced for loop to iterate over nameLemngths amd add the sum to lengthSum
        for (int length : nameLengths) {
            lengthSum += length;
        }
        // Printing the sum
        System.out.println(lengthSum);

        System.out.println("-------------------------------------------");

        // 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word
        // concatenated to itself n number of times.

        // The word (and what's for dinner!)
        String word = "Chicken";

        // How many times we want to repeat the word
        int n = 5;

        // Calling the method
        String wordResult = concatWords(word, n);

        // Printing the result
        System.out.println(wordResult);

        System.out.println("-------------------------------------------");

        // 8. Write a method that takes two Strings, firstName and lastName, and returns a
        // full name (the full name should be the first and the last name as a String separated by a space).
        String firstName = "Bob";
        String lastName = "Ross";
        System.out.println(fullName(firstName, lastName));

        System.out.println("-------------------------------------------");

        // 9. Write a method that takes an array of int and returns true if the sum of all the ints
        // in the array is greater than 100.
        // Setting up our numbers
        int[] numbers3 = {10, 20, 30, 40, 5};
        // Calling the method
        boolean result6 = greaterThan(numbers3);
        // Printing the result
        System.out.println("Is the number greater than 100? " + result6);

        System.out.println("-------------------------------------------");

        // 10. Write a method that takes an array of double and returns the average
        // of all the elements in the array.
        // Numbers
        double[] numbers4 = {1.1, 2.2, 3.3, 4.4, 5.5};
        // Call the method
        double result7 = doubleAverage(numbers4);
        // Print the result
        System.out.println(result7);

        System.out.println("-------------------------------------------");


        // 11. Write a method that takes two arrays of double and returns true if the average of the elements
        // in the first array is greater than the average of the elements in the second array.
        double[] array1 = {10.0, 20.0, 30.0, 40.0};
        double[] array2 = {5.0, 15.0, 25.0, 35.0};
        boolean result8 = firstOrSecondArray(array1, array2);
        System.out.println(result8);

        System.out.println("-------------------------------------------");

        // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
        // and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

        boolean isHotOutside = true;
        double moneyInPocket = 15.00;
        boolean result9 = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println("Will buy drink: " + result9);

        System.out.println("-------------------------------------------");

        // 13. Create a method of your own that solves a problem. In comments,
        // write what the method does and why you created it.
        int number = 7;
        String result10 = checkEvenOrOdd(number);
        System.out.println("The number " + number + " is: " + result10);



    }
    // Methods

    // This method subtracts the first element from the last
    public static int subtractFirstLast(int[] array) {
        return array[array.length - 1] - array[0];
    }
    // This method takes a String word and an int n as parameters. It uses a StringBuilder
    // to concatenate the word to itself n times

    public static String concatWords(String word, int n) {
        StringBuilder concatenatedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            concatenatedWord.append(word);
        }
        return concatenatedWord.toString();
    }

    // This method takes two Strings; firstName, and lastName and returns a full name
    // (firstName + " " + lastName)
    // StringBuilder allows us to append the string fullName rather than the need to create new strings
    // for each full name
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    // This method takes an array of int called array and initializes a variable sum 0 to store the sum of the
    // array elements. It then returns true if the sum is over 100 and false if it is not.
    public static boolean greaterThan(int[] array) {
        int sum = 0;
        for (int num: array) {
            sum += num;
        }
        return sum > 100;
    }
    // This method takes an array and sums the numbers inside and then calculates the average
    static public double doubleAverage(double[] array) {
        double sums = 0;
        for (double num: array) {
            sums += num;
        }
        return sums / array.length;
    }

    // This method is very similar to the last method except that it takes in 2 arrays, determines the sum of
    // each and the average of each and then compares the averages to see, which is larger. Returns true
    // if the first array is larger.
    public static boolean firstOrSecondArray (double[] array1, double[] array2) {
        double sum1 = 0;
        for (double num: array1) {
            sum1 += num;
        }
        double average1 = sum1 / array1.length;

        double sum2 = 0;
        for (double num: array2) {
            sum2 += num;
        }
        double average2 = sum2 / array2.length;

        return average1 > average2;
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }


    /*
            * This method checks if a given number is even or odd.
     * An even number is divisible by 2 with no remainder.
     * An odd number is not divisible by 2 evenly.
     *
     * I created this method because I've read that determining whether a number is even or odd
     * is a common task in programming.
     */
// This method checks if a number is divisible by 2 or not.
// If it is then, it returns even, otherwise it returns odd.
public static String checkEvenOrOdd(int number) {
    if (number % 2 == 0) {
        return "even";
    } else {
        return "odd";
    }
}
}




