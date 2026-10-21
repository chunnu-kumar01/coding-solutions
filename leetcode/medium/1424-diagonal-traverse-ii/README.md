# Diagonal Traverse II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a 2D integer array `nums`, return  *all elements of* `nums` *in diagonal order as shown in the below images*.

 

 **Example 1:** 

```
Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,4,2,7,5,3,8,6,9]

```

 **Example 2:** 

```
Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i].length <= 105
- 1 <= sum(nums[i].length) <= 105
- 1 <= nums[i][j] <= 105

## Solution

**Language:** Java  
**Runtime:** 41 ms (beats 22.26%)  
**Memory:** 126.6 MB (beats 29.05%)  
**Submitted:** 2026-10-21T09:24:41.747Z  

```java
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        HashMap<Integer, List<Integer>> hp = new HashMap<>();
        int total = 0;

        //Always the sum of diagonals is equals.

        for(int i=nums.size()-1; i>=0;i--){
            for(int j=0;j<nums.get(i).size();j++){
                int ele =nums.get(i).get(j);
                int dia=i+j;

                if(!hp.containsKey(dia)){
                    hp.put(dia,new ArrayList<Integer>());
                }
                hp.get(dia).add(ele);
                total++;
            }
        }
        int []ans=new int [total];
        int index=0;
        int key=0;

        while(hp.containsKey(key)){
            for(int el:hp.get(key)){
                ans[index]=el;
                index++;
            }
            key++;
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/diagonal-traverse-ii/)