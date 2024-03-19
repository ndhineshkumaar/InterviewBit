import java.util.*;
public class NobleInteger {
    public static void main(String[] args) {
        int[] A={1, 1, 3, 3};
        Arrays.sort(A);
        boolean found=false;
        for(int i=0;i<A.length;i++){
            if(A[i]==(A.length-i-1)){
                System.out.println(1);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println(-1);
        }

    }
    
}
