# Sum Numbers in String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** containing alphanumeric characters. You have to calculate the sum of all the numbers present in the string.

 **Examples:** 

```
Input: s = "1abc23"
Output: 24
Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.

```

```
Input: s = "geeks4geeks"
Output: 4
Explanation: 4 is the only number, so the sum is 4.
```

 **Constraints:** 
1 ≤ |s|≤ 105
The sum of Numbers ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T10:34:10.367Z  

```java
class Solution {
	public static int findSum(String s) {
		int sum = 0;
		int i = 0;
		int n = s.length();
		
		while (i < n) {
			char ch = s.charAt(i);
			
			if (ch >= '0' && ch <= '9') {
				int num = 0;
				
				while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					num = num * 10 + (s.charAt(i) - '0');
					i++;
				}
				
				sum += num;
			} else {
				i++;
			}
		}
		
		return sum;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1)