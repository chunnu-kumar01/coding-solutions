# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 61.23%)  
**Memory:** 44.2 MB (beats 77.12%)  
**Submitted:** 2026-10-28T09:44:30.837Z  

```java
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z' )|| (ch >= 'a' && ch <= 'z' )||(ch>='0' && ch<='9') ) {

                if(ch >= 'A' && ch <= 'Z' ){
                    ch=(char) ('a' +ch-'A');
                }
                sb.append(ch);
            }

        }
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false ;

            }
            i++;
            j--;
        }
        return true;


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)