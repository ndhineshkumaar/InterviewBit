public class findlastDigit {
    public static void main(String[] args) {
        String A="11";
        String B="11";
        int a=Integer.parseInt(A.substring(A.length()-1));
        int b=Integer.parseInt(B.substring(B.length()-2));
        b=(b%4)+4;
        int res=(int)Math.pow(a, b);
        System.out.println(res%10);
    }
}
