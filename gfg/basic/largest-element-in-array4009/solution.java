class Solution {
    public static int largest(int[] arr) {
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        return arr[n-1];
        
    }
}
