public class PalindromeInt {
    public static void main(String[] args) {
        int A=121521;
        int temp=A;
        int ans=0;
        while(temp>0){
            ans=(ans*10)+(temp%10);
            temp/=10;
        }
        if(ans==A) System.out.println(1);
        else System.out.println(0);
    }
}
