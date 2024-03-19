public class reverseintegr {
    public static void main(String[] args) {
        int A=-321515;
        int B=Math.abs(A);
        int ans=0;
        while(B>0){
            int digit=B%10;
            ans=(ans*10)+digit;
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)){
                System.out.println(0);
                return;
            }
            B/=10;
        }
        if(A<0) System.out.println(ans*-1);
        else{
            System.out.println(ans);
        }
    }
}
