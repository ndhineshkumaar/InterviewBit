public class SortedInsertPosition {
    public static void main(String[] args) {
        int[] A={1, 3, 5, 6};
        int B=7;
        int first=0;
        int last=A.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(A[mid]==B){
                System.out.println(mid);
                return;
            }
            else if(B<A[mid]){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        System.out.println(first);
    }
}
