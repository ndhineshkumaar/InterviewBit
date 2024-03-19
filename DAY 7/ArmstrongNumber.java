public class ArmstrongNumber {
    public static void main(String[] args) {
        int A=371;
        int n=(Integer.toString(A)).length();
        int temp=371;
        int strong=0;
        while(temp>0){
            int last=temp%10;
            temp=temp/10;
            strong+=(Math.pow(last, n));
        }
        if(strong==A) System.out.println(1);
        else System.out.println(0);
    }
}
