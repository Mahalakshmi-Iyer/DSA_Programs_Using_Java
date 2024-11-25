package Strings;

public class PascalCase {
    public static void main(String[] args) {
        String str = "hi, I am mahalakshmi iyer";
        System.out.println("The string in Pascal Case is : " + toUpperCase(str));
    }

    public static String toUpperCase(String str) {
        int n = str.length();
        StringBuilder ans = new StringBuilder("");
        ans.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < n; i++) {
            ans.append(str.charAt(i));
            if (str.charAt(i) == ' ' && i != (n - 1)) {
                i++;
                ans.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return ans.toString();
    }
}
