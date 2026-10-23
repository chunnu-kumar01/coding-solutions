# Most Frequent in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array  **arr[]**, return the element which occurs maximum times. If multiple such elements exists return the maximum element.

 **Example:** 

```
Input: arr[] = [1, 2, 2, 2, 4, 1]
Output: 2
Explanation: 2 is most frequent element of this array with 3 occurrences.
```

```
Input: arr[] = [1, -5, 8, 1]
Output: 1
Explanation: 1 is most frequent element of this array with 2 occurrences.
```

```
Input: arr[] = [3, 0, 0, 3, 8]
Output: 3
Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T09:48:19.553Z  

```java
class Solution {
    public int mostFreqEle(int[] arr) {
        // code here

        Arrays.sort(arr);

        int n = arr.length;
        int len=1;
        int max_freq=1;
        int el = arr[0];
        for(int i=1;i<n;i++){

           if(arr[i] == arr[i-1]){
               len++;
           }else{
               len=1;
           }
           if(len>=max_freq){
               max_freq = len;
               el = arr[i];
           }
        }
        return el;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1)