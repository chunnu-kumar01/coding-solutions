# Segregate Even and Odd numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **a**  **rr**, write a program segregating even and odd numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.

 **Note** :- You don't need to return the array, you need to modify it in-place.

 **Example:** 

```
Input: arr[] = [12, 34, 45, 9, 8, 90, 3]
Output: [8, 12, 34, 90, 3, 9, 45]
Explanation: Even numbers are 12, 34, 8 and 90. Rest are odd numbers.

```

```
Input: arr[] = [0, 1, 2, 3, 4]
Output: [0, 2, 4, 1, 3]
Explanation: 0 2 4 are even and 1 3 are odd numbers.

```

```
Input: arr[] = [10, 22, 4, 6]
Output: [4, 6, 10, 22]
Explanation: Here all elements are even, so no need of segregataion
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T17:50:26.560Z  

```java

class Solution {
    void segregateEvenOdd(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        // Step 1: Put even numbers before odd numbers
        while (i <= j) {
            if (arr[i] % 2 == 0) {
                i++;
            } 
            else if (arr[j] % 2 != 0) {
                j--;
            } 
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        // Step 2: Sort even and odd parts separately
        Arrays.sort(arr, 0, i);
        Arrays.sort(arr, i, arr.length);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1)