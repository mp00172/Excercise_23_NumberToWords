public class NumberToWords {

    public static void numberToWords (int number) {
        int numberOfDigits = getDigitCount(number);
        int reversedNumber = 0;
        if (numberOfDigits == -1) {
            System.out.println("Invalid Value");
        } else {
            reversedNumber = reverse(number);
        }
        int digitToProcess = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            digitToProcess = reversedNumber % 10;
            if (digitToProcess == 1) {
                System.out.println("One");
            } else if (digitToProcess == 2) {
                System.out.println("Two");
            } else if (digitToProcess == 3) {
                System.out.println("Three");
            } else if (digitToProcess == 4) {
                System.out.println("Four");
            } else if (digitToProcess == 5) {
                System.out.println("Five");
            } else if (digitToProcess == 6) {
                System.out.println("Six");
            } else if (digitToProcess == 7) {
                System.out.println("Seven");
            } else if (digitToProcess == 8) {
                System.out.println("Eight");
            } else if (digitToProcess == 9) {
                System.out.println("Nine");
            } else {
                System.out.println("Zero");
            }
            reversedNumber -= digitToProcess;
            reversedNumber /= 10;
        }
    }


    public static int reverse (int number) {
        int numberToProcess = number;
        if (numberToProcess < 0) {
            numberToProcess *= -1;
        }
        int reversedNumber = 0;
        int lastDigit = 0;
        while (numberToProcess > 0) {
            reversedNumber *= 10;
            lastDigit = numberToProcess % 10;
            reversedNumber += lastDigit;
            numberToProcess -= lastDigit;
            numberToProcess /= 10;
        }
        if (number < 0) {
            reversedNumber *= -1;
            return reversedNumber;
        } else {
            return reversedNumber;
        }
    }



    public static int getDigitCount (int number) {
        int digitCount = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int numberToProcess = number;
            while (numberToProcess != 0) {
                digitCount ++;
                numberToProcess -= (numberToProcess % 10);
                numberToProcess /= 10;
            }
        }
        return digitCount;
    }




}
