/*
 * Question:
 * Write a Java program to find the maximum element in an array.
 *
 * Approach:
 * 1. Assume the first element of the array is the maximum.
 * 2. Traverse the array from the second element.
 * 3. Compare each element with the current maximum.
 * 4. If a larger element is found, update the maximum.
 * 5. After traversal, print the maximum element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ArrayMaxElement {

    public static void main(String[] args) {

        int[] arr = {10, 40, 20, 30, 50};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element = " + max);
    }
}
