package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";

        String ans = compress(str);
        System.out.println("Compressed string is : " + ans);
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        int n = str.length();
        Integer count;

        for (int i = 0; i < n; i++) {
            count = 1;
            while (i <= (n - 2) && (str.charAt(i) == str.charAt(i + 1))) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(Integer.toString(count));
            }
        }

        return sb.toString();
    }
}
