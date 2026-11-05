# Find Occurrences of an Element in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`, an integer array `queries`, and an integer `x`.

For each `queries[i]`, you need to find the index of the `queries[i]th` occurrence of `x` in the `nums` array. If there are fewer than `queries[i]` occurrences of `x`, the answer should be -1 for that query.

Return an integer array `answer` containing the answers to all queries.

 

 **Example 1:** 

 **Input:**  nums = [1,3,1,7], queries = [1,3,2,4], x = 1

 **Output:**  [0,-1,2,-1]

 **Explanation:** 

- For the 1st query, the first occurrence of 1 is at index 0.
- For the 2nd query, there are only two occurrences of 1 in nums, so the answer is -1.
- For the 3rd query, the second occurrence of 1 is at index 2.
- For the 4th query, there are only two occurrences of 1 in nums, so the answer is -1.

 **Example 2:** 

 **Input:**  nums = [1,2,3], queries = [10], x = 5

 **Output:**  [-1]

 **Explanation:** 

- For the 1st query, 5 doesn't exist in nums, so the answer is -1.

 

 **Constraints:** 

- 1 <= nums.length, queries.length <= 105
- 1 <= queries[i] <= 105
- 1 <= nums[i], x <= 104

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 27.08%)  
**Memory:** 172.7 MB (beats 43.52%)  
**Submitted:** 2026-11-05T18:35:27.357Z  

```java
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        int n = nums.length;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                indexes.add(i);
            }
        }

      int[] ans = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int k= queries[i];

            if( k<=indexes.size()){
                ans[i]=indexes.get(k-1);
            }
            else{
                ans[i]=-1;
            }


        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/)