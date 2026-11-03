class Solution {
    public String addStrings(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();

        int i = n - 1;
        int j = m - 1;
        int c = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || c > 0) {

            int sum = c;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 10);

            c = sum / 10;
        }

        return sb.reverse().toString();
    }
}