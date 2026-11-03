# Distinct palindromic substrings

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**  of lowercase English letters. The task is to find all the  **distinct** continuous  **palindromic sub-strings**  which are present in the string  **s**.

 **Note:**  You can return the Palindromic sub-strings in any order but the driver code will print the result in  **sorted**  order.

 **Examples:** 

```
Input: s = "abaaa"
Output: ["a", "aa", "aaa", "aba", "b"]
Explanation: All 5 distinct continuous palindromic sub-strings are listed above.
```

```
Input: s = "geek"
Output: ["e", "ee", "g", "k"]
Explanation: All 4 distinct continuous palindromic sub-strings are listed above.
```

 **Constraints** :
1 ≤ s.length() ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T09:16:18.053Z  

```java

class Solution {

    public void solve(int i, int j, String s, HashSet<String> hst) {

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {

            hst.add(s.substring(i, j + 1));

            i--;
            j++;
        }
    }

    public ArrayList<String> palindromicSubstr(String s) {

        HashSet<String> hst = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindromes
            solve(i, i, s, hst);

            // Even length palindromes
            solve(i, i + 1, s, hst);
        }

        ArrayList<String> ans = new ArrayList<>(hst);

        Collections.sort(ans);

        return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distinct-palindromic-substrings5141/1)