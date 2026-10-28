class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int write = 0;

        while (i < chars.length) {
            char letter = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == letter) {
                count++;
                i++;
            }

            chars[write++] = letter;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}