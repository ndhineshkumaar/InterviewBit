import java.util.*;


public class RepeatNumber {
    public static void main(String[] args) {
        Integer[] values = {1, 2, 3, 1, 1};
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(values));
        Map<Integer,Integer> hsh=new HashMap<>();
        int n = a.size() / 3;
        for (Integer num : a) {
            hsh.put(num, hsh.getOrDefault(num, 0) + 1);
        }
        boolean found=false;
        for (int key : hsh.keySet()) {
            if (hsh.get(key) > n) {
                System.out.println(key);
                found=true;
                break;
            }
        }
        if(!found){
        System.out.println(-1);
        }
    }
}
