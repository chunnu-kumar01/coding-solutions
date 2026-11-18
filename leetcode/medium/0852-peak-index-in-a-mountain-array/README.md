# Peak Index in a Mountain Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer  **mountain**  array `arr` of length `n` where the values increase to a  **peak element**  and then decrease.

Return the index of the peak element.

Your task is to solve it in `O(log(n))` time complexity.

 

Original
Java
 **Example 1:** 

 **Input:**  arr = [0,1,0]

 **Output:**  1

 **Example 2:** 

 **Input:**  arr = [0,2,1,0]

 **Output:**  1

 **Example 3:** 

 **Input:**  arr = [0,10,5,2]

 **Output:**  1

 

 **Constraints:** 

- 3 <= arr.length <= 105
- 0 <= arr[i] <= 106
- arr is guaranteed to be a mountain array.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 79.8 MB (beats 79.78%)  
**Submitted:** 2026-11-18T09:45:46.340Z  

```java
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans=-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid - 1 >= 0 && arr[mid] > arr[mid - 1] && mid + 1 < n && arr[mid] > arr[mid + 1]) {

                return mid;
            }
            else if(mid-1>=0 && arr[mid-1] > arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

            
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/peak-index-in-a-mountain-array/)