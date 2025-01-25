package Stacks;

import java.util.*;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        String simplePath = simplifyPath(path);
        System.out.println("Simplified path : " + simplePath);
    }

    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<String>();
        String ans = "";

        ans += "/"; // every path starts with /
        int n = path.length();

        for (int i = 0; i < n; i++) {
            String currDir = "";
            while (i < n && path.charAt(i) == '/')
                i++;
            while (i < n && path.charAt(i) != '/') {
                currDir += path.charAt(i);
                i++;
            }

            if (currDir.equals("..")) {
                if (!s.isEmpty())
                    s.pop(); // previous directory
            } else if (currDir.equals("."))
                continue; // current directory
            else if (currDir.length() != 0)
                s.push(currDir);
        }

        Stack<String> temp = new Stack<String>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        while (!temp.isEmpty()) {
            if (temp.size() != 1)
                ans = ans + temp.pop() + "/";
            else
                ans += temp.pop();
        }

        return ans;

    }
}
