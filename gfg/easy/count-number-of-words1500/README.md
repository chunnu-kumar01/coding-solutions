# Count Words in String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting of lowercase English alphabets, spaces, tab characters (\t), and newline characters (\n),  **count**  the total number of  **words**  present in the string. A word is defined as a continuous sequence of lowercase English letters, while spaces, tabs, and newline characters act as separators between words.

 **Examples:** 

```
Input: s = "abc def"
Output: 2
Explanation: There is a space at 4th position which works as a seperator between "abc" and "def".

```

```
Input: s = "a\nyo\t"
Output: 2
Explanation: There are two words in the string: "a" and "yo". The characters \n and \t act as separators, splitting the string into words.
```

 **Constraints:** 
2 <= Length of String <= 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T09:58:02.850Z  

```java
class Solution {
	public int countWords(String s) {
		// code here
		
		int count = 0;
		
		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ' || ch == '\n' || ch == '\t')
				continue;
				
			if (i == 0 || s.charAt(i - 1) == ' ' || s. charAt(i - 1) == '\n' || s.charAt(i - 1) == '\t')
				count++;
		}
		return count;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-number-of-words1500/1)