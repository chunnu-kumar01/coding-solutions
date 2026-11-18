# Split Array Largest Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is  **minimized**.

Return  *the minimized largest sum of the split*.

A  **subarray**  is a contiguous part of the array.

 

Original
Java
 **Example 1:** 

```
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 0 <= nums[i] <= 106
- 1 <= k <= min(50, nums.length)

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.4 MB (beats 90.58%)  
**Submitted:** 2026-11-18T11:05:16.449Z  

```java

class Solution {

    boolean isPossible(int[] nums, int k, int mid) {

        int count = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (sum + nums[i] <= mid) {
                sum += nums[i];
            } else {
                count++;
                sum = nums[i];
            }

            if (count > k) {
                return false;
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(nums, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/split-array-largest-sum/)