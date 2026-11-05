class Solution {
    public int maximumCount(int[] nums) {
        int n= nums.length;
        int pos=0;
        int neg=0;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos++;
            }
            else if(nums[i]<0){
                neg++;
            }
        }

        if(pos>neg){
            return pos;
        }
        else{
            return neg;
        }

        

        
    }
}