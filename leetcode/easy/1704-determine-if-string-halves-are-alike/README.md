# Determine if String Halves Are Alike

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` of even length. Split this string into two halves of equal lengths, and let `a` be the first half and `b` be the second half.

Two strings are  **alike**  if they have the same number of vowels (`'a'`, `'e'`, `'i'`, `'o'`, `'u'`, `'A'`, `'E'`, `'I'`, `'O'`, `'U'`). Notice that `s` contains uppercase and lowercase letters.

Return `true` *if* `a` *and* `b` *are  **alike***. Otherwise, return `false`.

 

 **Example 1:** 

```
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

```

 **Example 2:** 

```
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.

```

 

 **Constraints:** 

- 2 <= s.length <= 1000
- s.length is even.
- s consists of uppercase and lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 68.26%)  
**Memory:** 42.6 MB (beats 87.92%)  
**Submitted:** 2026-11-03T10:49:45.707Z  

```java

class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n / 2; i++) {

            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(i + n / 2));

            if (isVowel(ch1)) {
                count++;
            }

            if (isVowel(ch2)) {
                count--;
            }
        }

        return count == 0;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u';
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/determine-if-string-halves-are-alike/)