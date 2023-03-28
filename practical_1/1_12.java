public class MatrixOperations {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // first array
        int[][] arr2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}}; // second array
        
        // Adding two arrays
        int[][] sum = new int[3][3]; // initialize the sum array with 0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j]; // add corresponding elements of arr1 and arr2
            }
        }
        System.out.println("Sum of two matrices: ");
        printMatrix(sum); // helper function to print the matrix
        
        // Subtracting two arrays
        int[][] diff = new int[3][3]; // initialize the difference array with 0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                diff[i][j] = arr1[i][j] - arr2[i][j]; // subtract corresponding elements of arr1 and arr2
            }
        }
        System.out.println("Difference of two matrices: ");
        printMatrix(diff); // helper function to print the matrix
    }
    
    // helper function to print the matrix
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


// ouput

// Sum of two matrices: 
// 10 10 10 
// 10 10 10 
// 10 10 10 

// Difference of two matrices: 
// -8 -6 -4 
// -2 0 2 
// 4 6 8 
