public class SmallerorEqual {
    public static void main(String[] args) {
        int[] A={1, 3, 4, 4, 6};
        int B = 5;
        int first=0;
        int last=A.length-1;
        int mid=(first+last)/2;
        while(first<=last){
            if(mid==A.length-1){
                if(A[mid]<=B){
                    System.out.println(mid+1);
                    return;
                }
                else{
                    System.out.println(mid);
                    return;
                }
            }
            else if(A[mid]<=B && A[mid+1]>B){
                System.out.println(mid+1);
                return;
            }
            else if(B<A[mid]){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
            mid=(first+last)/2;
        }
        System.out.println(0);
        return ;
    }
}
