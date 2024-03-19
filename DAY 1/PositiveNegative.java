public class PositiveNegative {
    public static void main(String[] args) {
        int[] A={1,0,-1};
        int n=A.length;
        int[] B=new int[2];
        for (int i=0;i<n;i++){
            if(A[i]>0) B[0]++;
            else if(A[i]<0) B[1]++;
        }
        for (int i:B){
        System.out.print(i + " ");
        }
    }
}
