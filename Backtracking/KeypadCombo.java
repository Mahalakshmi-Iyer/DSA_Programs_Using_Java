package Backtracking;

public class KeypadCombo {
    public static void main(String[] args) {
        String key[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String digits1 = "23";
        String digits2 = "2";
        String digits3 = "";

        findCombos(digits1, key, "");
    }

    public static void findCombos(String digits, String key[], String combo) {
        int n = digits.length();
        // base case
        if (digits.length() == 0)
            return;
        if (combo.length() == n) {
            System.out.println(combo);
            return;
        }
        // recursion
        int currDigit = Character.getNumericValue(digits.charAt(0));
        String currKey = key[currDigit];
        for (int i = 0; i < currKey.length(); i++) {
            findCombos(digits.substring(1), key, combo + currKey.charAt(i));
        }
    }
}
