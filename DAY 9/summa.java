import java.util.HashMap;
import java.util.Map;

public class summa {
    public static void main(String[] args) {
        String A="dhineshkumaar";
        Map<Character,Integer> hsh=new HashMap<>();
        for(int i=0;i<A.length();i++){
            char b=A.charAt(i);
            hsh.put(b,hsh.getOrDefault(b, 0)+1);
        }
        System.out.println(hsh);
    }
}
