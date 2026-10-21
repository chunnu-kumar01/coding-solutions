# Pascal's Triangle II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `rowIndex`, return the `rowIndexth` (**0-indexed**) row of the  **Pascal's triangle**.

In  **Pascal's triangle**, each number is the sum of the two numbers directly above it as shown:

 

 **Example 1:** 

```
Input: rowIndex = 3
Output: [1,3,3,1]

```

 **Example 2:** 

```
Input: rowIndex = 0
Output: [1]

```

 **Example 3:** 

```
Input: rowIndex = 1
Output: [1,1]

```

 

 **Constraints:** 

- 0 <= rowIndex <= 33

 

 **Follow up:**  Could you optimize your algorithm to use only `O(rowIndex)` extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.7 MB (beats 99.73%)  
**Submitted:** 2026-10-21T08:38:22.855Z  

```java
class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List <Integer> ans= new ArrayList<>();
        ans.add(1);
        long prev=1;

        for(int col=1; col<rowIndex;col++){
            long new_el=prev*(rowIndex-col);
            new_el/=col;
            ans.add((int)new_el);
            prev=new_el;

        }
        return ans;


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/pascals-triangle-ii/)