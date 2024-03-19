import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        Integer[] A={ 4, 0, 2, 1, 3 };
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(A));
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            b.add(a.get(a.get(i)));
        }

        for(int i=0;i<a.size();i++){
            a.set(i,b.get(i));
        }

        System.out.println(a);
    }
}
