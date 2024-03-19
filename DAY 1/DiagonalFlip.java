public class DiagonalFlip {
    public static void main(String[] args) {
        int[][] A={{1,0},{1,0}};
        int[][] B=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                B[j][i]=A[i][j];
            }

        }
        for (int[] i:B){
            for (int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
