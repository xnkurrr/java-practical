public class SumOfPrimes {
    public static void main(String[] args) {
        int count = 0; // counter to keep track of number of primes
        int sum = 0; // variable to keep track of the sum of primes
        int number = 2; // starting number to check for prime
        while (count < 20) { // loop until 20 primes are found
            boolean isPrime = true; // assume number is prime
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) { // if number is divisible by i, it's not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { // if number is prime, add it to the sum
                sum += number;
                count++;
            }
            number++; // check next number
        }
        System.out.println("The sum of first 20 prime numbers is: " + sum);
    }
}


//OUPUT

//The sum of first 20 prime numbers is: 639
