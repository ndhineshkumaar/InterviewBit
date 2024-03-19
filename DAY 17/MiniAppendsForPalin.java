public class MiniAppendsForPalin {
    public static void main(String[] args) {
        String A = "abede";
        int i = 0, j = A.length() - 1, req = 0;
        while (i <= j) {
            if (A.charAt(i) == A.charAt(j)) {
                i++;
                j--;
            }
            else{
                req=i+1;
                i++;
                j=A.length()-1;
            }
            
        }
        System.out.println(req);
    }
}
