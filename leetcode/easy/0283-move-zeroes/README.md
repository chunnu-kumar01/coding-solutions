# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 22.82%)  
**Memory:** 46.8 MB (beats 98.83%)  
**Submitted:** 2026-11-07T17:14:05.366Z  

```java
class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int j=0;

        for(int i=0;i<n;i++){
            
            if(nums[i]!= 0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j++]=temp;
                
            }
        }

        //  int idx=0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] != 0) {
        //       nums[idx++]=nums[i];
        //     }
        // }

        // while (idx < n) {

        //     nums[idx++] = 0;   

        // }

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)