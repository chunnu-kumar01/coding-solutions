
class Solution {

    public void solve(int i, int j, String s, HashSet<String> hst) {

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {

            hst.add(s.substring(i, j + 1));

            i--;
            j++;
        }
    }

    public ArrayList<String> palindromicSubstr(String s) {

        HashSet<String> hst = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindromes
            solve(i, i, s, hst);

            // Even length palindromes
            solve(i, i + 1, s, hst);
        }

        ArrayList<String> ans = new ArrayList<>(hst);

        Collections.sort(ans);

        return ans;
    }
}
