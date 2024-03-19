import java.util.*;

public class Repeatandmssing {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 2, 5, 3};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Long> res = new ArrayList<>(Arrays.asList(0L, 0L));
        Collections.sort(A);
        for(int i=0;i<A.size();i++){
            int current=A.get(i);
            if ((i + 1) != current) {
                res.set(1,(long) i+1 );
            }
            if(i>0 && A.get(i).equals(A.get(i-1))){
                res.set(0,(long)A.get(i));
            }

        }
        System.out.println(res);
    }
}
