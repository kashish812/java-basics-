/**
 * -------------------------------------------------------
 *                Selection Sort - Introduction
 * -------------------------------------------------------
 *
 * Definition:
 * Selection Sort is a simple comparison-based sorting algorithm.
 * It repeatedly selects the smallest element from the unsorted
 * part of the array and places it at the beginning.
 *
 * Working:
 * 1. Divide the array into sorted and unsorted parts.
 * 2. Assume the first unsorted element is the minimum.
 * 3. Compare it with the remaining elements.
 * 4. Find the actual minimum element.
 * 5. Swap it with the first unsorted element.
 * 6. Repeat until the array becomes sorted.
 *
 * Example:
 * Input  : [64, 25, 12, 22, 11]
 *
 * Pass 1 : [11, 25, 12, 22, 64]
 * Pass 2 : [11, 12, 25, 22, 64]
 * Pass 3 : [11, 12, 22, 25, 64]
 * Pass 4 : [11, 12, 22, 25, 64]
 *
 * Output : [11, 12, 22, 25, 64]
 *
 * Time Complexity:
 * Best Case    : O(n²)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * Space Complexity:
 * O(1)
 *
 * Stable:
 * No
 *
 * In-Place:
 * Yes
 *
 * Applications:
 * • Small datasets
 * • When memory usage should be minimal
 * • Educational purposes to understand sorting
 *
 * Advantages:
 * • Simple to implement
 * • In-place sorting
 * • Performs at most (n - 1) swaps
 *
 * Disadvantages:
 * • Slow for large datasets
 * • Not stable
 * • Time complexity remains O(n²) even for sorted arrays
 
