# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T09:27:02.672Z  

```java
class Solution {
	public static String reverseString(String s) {
		// code here
		
		// StringBuilder sb= new StringBuilder(s);
		
		// sb.reverse();
		// return sb.toString();
		char[] arr = s.toCharArray();
		
		
		int st = 0;
		int ed = arr.length-1;
		
		while (st<ed) {
			char temp = arr[st];
			arr[st] = arr[ed];
			arr[ed] = temp;
			st++;
			ed--;
		}
		
		return new String(arr);
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)