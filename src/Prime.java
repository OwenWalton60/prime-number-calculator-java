import java.util.ArrayList;

/**
 * function which passes in an array list of integers and returns an array list of the integers that were prime
 *
 * @author Owen Walton
 */

public class Prime {

    public static ArrayList<Integer> onlyPrimes(ArrayList<Integer> numbers) {

        // declare variables
        ArrayList<Integer> primes = new ArrayList<>();

        // defends against null input
        if(numbers != null) {

            // loops through each number in the array to be checked
            for (Integer x : numbers) {

                // stores whether the current number in the loop is prime
                boolean isPrime = true; //assumes the number is prime until it is shown to be divisible

                // 1, 0 and negatives are not prime
                if(x > 1) {

                    // loops through all numbers (not 1) smaller than the square route of x to see if its divisible
                    for (int j = 2; j <= x / 2; j++) {


                        // if there is no remainder when dividing
                        if (x % j == 0) {

                            // number is not prime
                            isPrime = false;

                            // breaks out of for loop because number is not prime and no longer needs to be checked
                            break;
                        }

                    }
                }
                else{
                    // number is 1 or less so not prime
                    isPrime = false;
                }

                // if current number is a prime
                if (isPrime) {

                    // adds the number to array list of primes
                    primes.add(x);

                }

            }
        }

        // returns array list of primes
        return primes;
    }

    public static void main(String[] args)
    {
        // creates a sample lists
        ArrayList<Integer> numbers = new ArrayList<>();

        // add some numbers
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        // prints the output when sample array is used
        System.out.println(onlyPrimes(numbers));

    }
}
