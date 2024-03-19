public class squareRootInt {
    public static void main(String[] args) {
        int A=2147483647;
        long first=0;
        long last=A/2;
        long res=-1;
        while(first<=last){
            long mid=first+(last-first)/2;
            if(mid*mid<=A){
                res=mid;
                first=mid+1;
            }
            else if(mid*mid>A){
                last=mid-1;
            }
        }
        System.out.println(res);
    }
}
