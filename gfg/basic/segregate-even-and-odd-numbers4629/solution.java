
class Solution {
    void segregateEvenOdd(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        // Step 1: Put even numbers before odd numbers
        while (i <= j) {
            if (arr[i] % 2 == 0) {
                i++;
            } 
            else if (arr[j] % 2 != 0) {
                j--;
            } 
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        // Step 2: Sort even and odd parts separately
        Arrays.sort(arr, 0, i);
        Arrays.sort(arr, i, arr.length);
    }
}