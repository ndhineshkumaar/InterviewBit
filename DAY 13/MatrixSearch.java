public class MatrixSearch {
    public static void main(String[] args) {
        int[][] A={{1,   3,  5,  7},
                   {10, 11, 16, 20},
                   {23, 30, 34, 50},};
        int B=5;
        int rows=A.length;
        int cols=A[0].length;
        int first=0;
        int last=rows * cols -1;
        while(first<=last){
            int mid=(first+last)/2;
            int curr=A[mid/cols][mid%cols];
            if(curr==B){
                System.out.println(1);
                return;
            }
            else if(B<curr){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        System.out.println(0);
        return;
    }
}
