# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array `nums` with `n` objects colored red, white, or blue, sort them  **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Original
Java
 **Example 1:** 

 **Input:**  nums = [2,0,2,1,1,0]

 **Output:**  [0,0,1,1,2,2]

 **Explanation:** 

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

 **Example 2:** 

 **Input:**  nums = [2,0,1]

 **Output:**  [0,1,2]

 **Explanation:** 

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

 

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.2 MB (beats 67.18%)  
**Submitted:** 2026-11-14T19:13:44.188Z  

```java
class Solution {
    public void sortColors(int[] nums) {

       	int n = nums.length;
		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int i = 0;
		
		while (i<n) {
			if (nums[i] == 0) {
				c0++;
				
			}
			else if (nums[i] == 1) {
				c1++;
			}
			else {
				c2++;
			}
            i++;
		}
		i=0;
		while (i<c0) {
			nums[i++] = 0;
		}
        while (i<c0+c1) {
			nums[i++] = 1;
		}
        while (i<n) {
			nums[i++] = 2;
		}
		 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)