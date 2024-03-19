public class PalindromeString {
    public static void main(String[] args) {
        String A="A man, a plan, a canal: Panama";
        A=A.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        int left = 0;
        int right = A.length() - 1;
        while (left < right) {
            if (A.charAt(left++) != A.charAt(right--)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
