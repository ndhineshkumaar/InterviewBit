public class ConvertToPalindrome {

    public static boolean ifpossible(String S) {
        int fst = 0, lst = S.length() - 1;
        while (fst < lst) {
            if (S.charAt(fst) != S.charAt(lst)) {
                return false;
            }
            fst++;
            lst--;
        }
        return true;
    }

    public static void main(String[] args) {
        String A = "jvwcfflufnztzreji";
        int fst = 0, lst = A.length() - 1;
        while (fst < lst) {
            if (A.charAt(fst) != A.charAt(lst)) {
                String s1 = A.substring(fst, lst);
                String s2 = A.substring(fst + 1, lst + 1);
                if (ifpossible(s1) || ifpossible(s2)) {
                    System.out.println(1);
                    return;
                } else
                    System.out.println(0);
                    return;
            }
            lst--;
            fst++;
        }
        System.out.println(1);
    }
}
