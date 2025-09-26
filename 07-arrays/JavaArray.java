public class JavaArray {
    
    public static void main(String[] args) {
        // Declare and initialize an array/list
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements
        int n = numbers[0]; // First element
        // numbers.length; // Size of the array

        numbers[1] = 25; // Modifying the second element

        int[] newArray = new int[5]; // Declaring an array of size 5
        newArray[0] = 5; // Assigning value to the first element
        newArray[1] = 15; // Assigning value to the second element

        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int element = matrix[1][2]; // Accessing element at row 1, column 2 (value 6)
    }
}
