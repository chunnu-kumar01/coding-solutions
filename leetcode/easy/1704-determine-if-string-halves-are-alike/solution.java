
class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n / 2; i++) {

            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(i + n / 2));

            if (isVowel(ch1)) {
                count++;
            }

            if (isVowel(ch2)) {
                count--;
            }
        }

        return count == 0;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u';
    }
}
