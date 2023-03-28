import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int num = input.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}

//EXPLANATION
// The program checks whether a given number is an Armstrong number or not. An Armstrong number is a number that is equal to the sum of its digits raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

// The program first asks the user to enter a number to check. Then, it uses a function isArmstrong to determine whether the number is an Armstrong number or not. The isArmstrong function takes an integer argument num, which is the number to be checked, and returns a boolean value indicating whether the number is an Armstrong number or not.

// The isArmstrong function first creates a copy of the input number using int originalNum = num;. It also initializes a variable sum to 0 to hold the sum of the cubes of the digits in the number.

// The function then calculates the number of digits in the input number using int numDigits = String.valueOf(num).length();. It uses this value to calculate the sum of the cubes of each digit in the input number using a while loop.

// Inside the loop, the function extracts each digit from the number using the modulo operator %. It calculates the cube of the digit using the Math.pow() method and adds the result to the sum variable. It then removes the rightmost digit from the number by dividing it by 10.

// The function then compares the sum variable to the original input number to check if it's an Armstrong number. If the two values are equal, the function returns true, indicating that the input number is an Armstrong number. Otherwise, it returns false.

// Finally, the program prints whether the input number is an Armstrong number or not based on the value returned by the isArmstrong function.
