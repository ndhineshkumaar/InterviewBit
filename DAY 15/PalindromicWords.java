import java.util.ArrayList;

public class PalindromicWords {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String A = "the fastest racecar";
        ArrayList<String> lst = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == ' ') {
                String sub = A.substring(j, i);
                j = i + 1;
                lst.add(sub);
            }
            if (i == A.length() - 1) {
                String sub = A.substring(j, i + 1);
                lst.add(sub);
            }
        }
        int count = 0;
        for (String word : lst) {
            if (isPalindrome(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
