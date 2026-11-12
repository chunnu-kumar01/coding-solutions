# Search in Rotated Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is an integer array `nums` sorted in ascending order (with  **distinct**  values).

Prior to being passed to your function, `nums` is  **possibly left rotated**  at an unknown index `k` (`1 <= k < nums.length`) such that the resulting array is `[nums[k], nums[k+1],..., nums[n-1], nums[0], nums[1],..., nums[k-1]]` (**0-indexed**). For example, `[0,1,2,4,5,6,7]` might be left rotated by `3` indices and become `[4,5,6,7,0,1,2]`.

Given the array `nums`  **after**  the possible rotation and an integer `target`, return  *the index of* `target` *if it is in* `nums` *, or* `-1` *if it is not in* `nums`.

You must write an algorithm with `O(log n)` runtime complexity.

 

Original
Java
 **Example 1:** 

```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

```

 **Example 2:** 

```
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

```

 **Example 3:** 

```
Input: nums = [1], target = 0
Output: -1

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- -104 <= nums[i] <= 104
- All values of nums are unique.
- nums is an ascending array that is possibly rotated.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.2 MB (beats 86.21%)  
**Submitted:** 2026-11-12T14:09:24.533Z  

```java
class Solution {
    public int search(int[] nums, int target) {
        // int ans=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         ans =i;
        //     }

        // }
        // return ans;
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                return mid;

            }
            // for left half sorted

            if (nums[low] <= nums[mid] ) {

                if (target >=nums[low]&&target<nums[mid] ) 
                {
                     high = mid - 1;
                } 
                else 
                {
                    low = mid + 1;
                   
                }

            }

            //for right half sorted
            else {

                if (target > nums[mid] && target <= nums[high]) 
                {
                    low = mid + 1;
                } else
                {
                    high = mid - 1;
                }

            }

        }

        return -1;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/)