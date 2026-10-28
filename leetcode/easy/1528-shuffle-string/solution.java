class Solution {
    public String restoreString(String s, int[] indices) {

        int n = s.length();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int index = indices[i];
            arr[index] = ch;

        }
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);

            
        }

    return sb.toString();
    }
}