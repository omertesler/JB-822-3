package johnbrice;



import java.util.Scanner;

public class rotations {
    public static void main(String[] args) {
        final int maximumInputAllowed = 1_000_000_000;

        Scanner input = new Scanner(System.in);

        System.out.println("First number");
        System.out.print("Enter a number in the range [0.." + maximumInputAllowed + "]: ");
        int firstNumber = input.nextInt();
        while (firstNumber < 0 || firstNumber > maximumInputAllowed) {
            System.out.print("Enter a number in the range [0.." + maximumInputAllowed + "]: ");
            firstNumber = input.nextInt();
        }

        System.out.println("Second number");
        System.out.print("Enter a number in the range [0.." + maximumInputAllowed + "]: ");
        int secondNumber = input.nextInt();
        while (secondNumber < 0 || secondNumber > maximumInputAllowed) {
            System.out.print("Enter a number in the range [0.." + maximumInputAllowed + "]: ");
            secondNumber = input.nextInt();
        }

        if (firstNumber == secondNumber) {
            System.out.println("Invalid input: the 2 numbers are identical");
            return;
        }

        // check the length
        int tempNumber1 = firstNumber;
        int firstNumberLength = 0;
        while (tempNumber1 != 0) {
            tempNumber1 /= 10;
            firstNumberLength++;
        }

        int tempNumber2 = secondNumber;
        int secondNumberLength = 0;
        while (tempNumber2 != 0) {
            tempNumber2 /= 10;
            secondNumberLength++;
        }

        // set the length to the maximum between the two
        int length = firstNumberLength;
        if (secondNumberLength > length) {
            length = secondNumberLength;
        }

        // add the digits to an array
        byte[] firstNumberDigits = new byte[length];
        byte[] secondNumberDigits = new byte[length];

        tempNumber1 = firstNumber;
        tempNumber2 = secondNumber;
        for (int i = length - 1; i >= 0; i--) {
            firstNumberDigits[i] = (byte)(tempNumber1 % 10);
            tempNumber1 /= 10;

            secondNumberDigits[i] = (byte)(tempNumber2 % 10);
            tempNumber2 /= 10;
        }

        int rotations = 1;
        boolean rotationFound = false;
        while (rotations < length && (!rotationFound)) {
            // assume that in this rotation the numbers will be identical
            rotationFound = true;
            for (int index = 0; index < length && rotationFound; index++) {
                int indexOfSecondNumberDigit = (index + rotations) % length;
                if (firstNumberDigits[index] != secondNumberDigits[indexOfSecondNumberDigit]) {
                    rotationFound = false;
                }
            }
            if (!rotationFound) {
                rotations++;
            }
        }

        if (!rotationFound) {
            System.out.println("We cannot get from " + firstNumber + " to " + secondNumber
                                       + " by performing any number of rotations");
        } else {
            System.out.println("The number " + firstNumber +
                                       " can be rotated " + rotations +
                                       " time(s) to get the number " + secondNumber);
        }
    }
}