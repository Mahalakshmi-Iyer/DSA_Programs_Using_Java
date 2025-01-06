package Backtracking;

public class FindSubsetsOfString {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }

    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            System.out.println((ans == "") ? "null" : ans);
            return;
        }
        // recursion step
        findSubsets(str, ans + str.charAt(i), i + 1); // case 1 : Yes ie. when char choses to be in the ans
        findSubsets(str, ans, i + 1); // case 2 : No ie. when char choses not to be in the ans
    }
}
