class Solution {
    public static int largest(int[] arr) {
        // code here
        int lar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }
}
