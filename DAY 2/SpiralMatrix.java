
public class SpiralMatrix {
    public static void main(String[] args) {
        int[] A={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int B=3;
        int C=3;
        int index=0;
        int direction=0;
        int[][] spiral=new int[B][C];
        int top=0,bottom=B-1,left=0,right=C-1;
        while(left<=right && top<=bottom){
            if(direction==0){
                for(int i=left;i<=right;i++){
                    spiral[top][i]=A[index++];
                }
                top++;
            }
            else if(direction==1){
                for(int i=top;i<=bottom;i++){
                    spiral[i][right]=A[index++];
                }
                right--;
            }
            else if(direction==2){
                for(int i=right;i>=left;i--){
                    spiral[bottom][i]=A[index++];
                }
                bottom--;
            }
            else if(direction==3){
                for(int i=bottom;i>=top;i--){
                    spiral[i][left]=A[index++];
                }
                left++;
            }
            direction=(direction+1)%4;
        }
        for(int[] i:spiral){
            for(int j:i){
                
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
