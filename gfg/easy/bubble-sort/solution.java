class Solution {
    public void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (arr[j - 1] > arr[j]) {

                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}