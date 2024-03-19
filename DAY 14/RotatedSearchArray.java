public class RotatedSearchArray {
    public static void main(String[] args) {
        int[] A={101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        int B=202;
        int first=0;
        int last=A.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(A[mid]==B){
                System.out.println(mid);
                return;
            }
            if(A[first]<=A[mid]){
                if(B>=A[first] && B<A[mid]){
                    last=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
            else{
                if(B>=A[mid] && B<A[last]){
                    first=mid+1;
                }
                else{
                    last=mid-1;
                }
            }
        }
        System.out.println(-1);
    }
}
