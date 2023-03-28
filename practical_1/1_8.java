// NOTE: FORMAT MAYBE DIFFERENT IN MANUAL.

public class OneDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 1-D array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements of the array using indexes
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);

        // Updating elements of the array
        numbers[1] = 10;
        numbers[3] = 20;

        // Printing all elements of the array using a loop
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


//ouput

// Element at index 0: 1
// Element at index 2: 3
// Elements of the array:
// 1
// 10
// 3
// 20
// 5
