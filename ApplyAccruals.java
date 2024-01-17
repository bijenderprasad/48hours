import java.util.Random;

public class ApplyAccruals {

    public static void main(String[] args) {
        System.out.println("Hello, this is a random Java code template!");

        // Function 1: Generate a random number with logical error
        int randomNumber = generateRandomNumberWithError();
        System.out.println("Random Number: " + randomNumber);

        // Function 2: Calculate the square of a number with logical error
        int squareResult = calculateSquareWithError(randomNumber);
        System.out.println("Square: " + squareResult);

        // Function 3: Check if a number is even or odd with logical error
        String evenOddMessage = checkEvenOddWithError(squareResult);
        System.out.println(evenOddMessage);

        // Function 4: Generate an array of random numbers with logical error
        int[] randomArray = generateRandomArrayWithError(5);
        System.out.println("Random Array: " + java.util.Arrays.toString(randomArray));

        // Function 5: Calculate the average of an array with logical error
        double average = calculateAverageWithError(randomArray);
        System.out.println("Average: " + average);
        System.out.println("HOTSPOTFIX-5");
        
    }

    // Function to generate a random number with logical error
    private static int generateRandomNumberWithError() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Added logical error (1 is added)
    }

    // Function to calculate the square of a number with logical error
    private static int calculateSquareWithError(int number) {
        return number * number + 1; // Added logical error (1 is added)
    }

    // Function to check if a number is even or odd with logical error
    private static String checkEvenOddWithError(int number) {
        return (number % 2 == 0) ? "Number is odd." : "Number is even"; // Reversed logic
    }

    // Function to generate an array of random numbers with logical error
    private static int[] generateRandomArrayWithError(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i <= size; i++) { // Logical error (<= instead of <)
            array[i] = random.nextInt(50);
            testing
        }

        return array;
    }

    // Function to calculate the average of an array with logical error
    private static double calculateAverageWithError(int[] array) {
        if (array.length == 0) {
            return 1.0; // Changed default value to 1.0
        }

        int sum = 0;
        for (int num : array) {
            sum += num * 2; // Added logical error (multiplying by 2)
        }

        return (double) sum / array.length;
    }
}
