
public class SumAllDigits {
    // Main method
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        // Read a number
        System.out.print("Enter an integer between 0 and 999: ");
        int number = input.nextInt();

        // Find all digits in number
        int lastDigit = number % 10;
        int remainingNumber = number / 10;
        int secondLastDigit = remainingNumber % 10;
        remainingNumber = number / 100;
        int thirdLastDigit = remainingNumber;

        // Obtain the sum of all digit/
        int sum = lastDigit + secondLastDigit + thirdLastDigit;

        // Display results
        System.out.println("The sum of all digits in " + number
                + " is " + sum);
    }
}

/**
 * Enter an integer between 0 and 999: 999
 * The sum of all digits in 999 is 27
 *
 * Enter an integer between 0 and 999: 123
 * The sum of all digits in 123 is 6
 */