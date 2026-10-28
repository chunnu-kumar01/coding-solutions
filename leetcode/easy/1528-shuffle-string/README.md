# Shuffle String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` and an integer array `indices` of the  **same length**. The string `s` will be shuffled such that the character at the `ith` position moves to `indices[i]` in the shuffled string.

Return  *the shuffled string*.

 

 **Example 1:** 

```
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

```

 **Example 2:** 

```
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.

```

 

 **Constraints:** 

- s.length == indices.length == n
- 1 <= n <= 100
- s consists of only lowercase English letters.
- 0 <= indices[i] < n
- All values of indices are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 12.81%)  
**Memory:** 45.2 MB (beats 86.18%)  
**Submitted:** 2026-10-28T10:07:51.229Z  

```java
class Solution {
    public String restoreString(String s, int[] indices) {

        int n = s.length();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = indices[i];
            arr[index] = ch;

        }
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);

            
        }

    return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/shuffle-string/)