class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n= arr.length-1;
        return arr[n];
    }
}
