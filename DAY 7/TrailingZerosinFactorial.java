public class TrailingZerosinFactorial {
    public static void main(String[] args) {
        int A=10;
        int count=0;
        for(int i=5;A/i>=1;i*=5){
            count+=A/i;
        }
        System.out.println(count);
    }
}
