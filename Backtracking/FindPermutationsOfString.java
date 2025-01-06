package Backtracking;

public class FindPermutationsOfString {
    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }

    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion step
        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + str.charAt(i));
        }
    }
}
