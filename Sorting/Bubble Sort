# 02 - Bubble Sort

## Definition

**Bubble Sort is a simple sorting algorithm that compares two adjacent elements and swaps them if they are in the wrong order. This process is repeated until the array is sorted.**

---

## Hindi Meaning

Bubble Sort ek simple sorting algorithm hai jo **adjacent (paas-paas ke) elements ko compare karta hai**. Agar elements galat order me hote hain, to unhe **swap** kar deta hai. Ye process tab tak repeat hota hai jab tak array sort na ho jaye.

---

## Example

### Before Sorting


5 3 8 4 2


### After Sorting (Ascending Order)


2 3 4 5 8




## Why is it called Bubble Sort?

After every pass, the **largest unsorted element** moves to its correct position at the end of the array, just like a bubble rises to the top.

---

## Algorithm

1. Start from the first element.
2. Compare two adjacent elements.
3. If the left element is greater than the right element, swap them.
4. Continue comparing adjacent elements until the end of the array.
5. After one pass, the largest element reaches its correct position.
6. Repeat the process for the remaining unsorted part of the array.
7. Stop when the array becomes sorted.

---

## Approach

* Compare adjacent elements.
* Swap them if they are in the wrong order.
* Repeat this process for every pass.
* After each pass, one element is placed in its correct position.

---

## Java Code

```java
class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

## Time Complexity

* **Best Case:** O(n) *(with optimization)*
* **Average Case:** O(n²)
* **Worst Case:** O(n²)

---

## Space Complexity

**O(1)**

---

## Advantages

* Easy to understand and implement.
* Does not require extra memory.
* Suitable for small datasets.

---

## Disadvantages

* Slow for large datasets.
* Performs many unnecessary comparisons.
* Not efficient compared to Merge Sort or Quick Sort.

---

## Key Points

* Compares **adjacent elements**.
* Swaps elements if they are in the wrong order.
* After each pass, the largest element reaches its correct position.
* Uses nested loops.
* It is an **in-place sorting algorithm** because it uses constant extra space.

---

## Interview Definition

**Bubble Sort is a simple sorting algorithm that compares adjacent elements and swaps them if they are in the wrong order. This process continues until the array is sorted.**
