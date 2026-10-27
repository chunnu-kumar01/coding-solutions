# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 61.22%)  
**Memory:** 42.5 MB (beats 91.53%)  
**Submitted:** 2026-10-27T10:23:52.498Z  

```java
class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean arr[] = new boolean[26];
        int n=sentence.length();
        int count =0;

        for(int i=0;i<n;i++){
            char ch= sentence.charAt(i);

            if(arr[ch-'a']==false)
            count++;
            arr[ch-'a']=true;
        }

           return count==26; 
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)