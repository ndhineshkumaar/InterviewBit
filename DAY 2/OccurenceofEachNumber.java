import java.util.*;
public class OccurenceofEachNumber {
    public static void main(String[] args) {
        Integer[] arr={4,3,3};
        ArrayList<Integer> A= new ArrayList<>(Arrays.asList(arr));
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<A.size();i++){
            h.put(A.get(i),h.getOrDefault(A.get(i),0)+1);
        }
       
        ArrayList<Integer> al = new ArrayList<>(h.keySet());
        ArrayList<Integer> bl = new ArrayList<>();
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            bl.add(h.get(al.get(i)));
        }
        for (int res: bl){
            System.out.print(res+" ");
        }
    }
    
}
