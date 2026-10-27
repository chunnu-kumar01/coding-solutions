class Solution {
    public static String reverseString(String s) {
        // code here

        StringBuilder sb= new StringBuilder(s);
        
        sb.reverse();
        return sb.toString();
    }
}