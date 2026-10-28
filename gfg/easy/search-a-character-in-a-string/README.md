# Search a Character in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a program to search for a given character in a string. If the character is found, print the  **index/position**  where it first appears in the string. If the character is not found, print  **-1**.

 **Examples:** 

```
Input: s = "geeksforgeeks", ch = 'k'
Output: 3
Explanation: The character 'k' is present at index 3 and 11 in "geeksforgeeks", so the first index is 3.
```

```
Input: s = "geeksforgeeks", ch = 'z'
Output: -1
Explanation: The character 'z' is not present in "geeksforgeeks".

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T09:03:34.464Z  

```java
class Solution {
	// Function to search for a character in the string
	public int searchCharacter(String s, char ch) {
		// code here
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
		
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-a-character-in-a-string/1)