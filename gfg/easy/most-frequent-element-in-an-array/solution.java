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