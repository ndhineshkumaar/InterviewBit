import java.util.ArrayList;
import java.util.Arrays;

public class MaxDistance {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(3, 5, 4, 2));
        int i=0;
        int j=A.size()-1;
        int maxDiff=Integer.MIN_VALUE;
        while(i<j){
            if(A.get(i)<=A.get(j)){
                if((j-i)>maxDiff){
                    maxDiff=j-i;
                }
            }
            j--;
            if(j==i){
                i++;
                j=A.size()-1;
            }
        }
        System.out.println(maxDiff);
    }
}
