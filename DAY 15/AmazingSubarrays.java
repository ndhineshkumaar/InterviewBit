import java.util.ArrayList;
import java.util.Arrays;

public class AmazingSubarrays {
    public static void main(String[] args) {
        String A="ABEC";
        ArrayList<Character> lst=new ArrayList<>(Arrays.asList('a','e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int j=0;
        int i=0;
        int count=0;
        while(i<A.length()){
            String sub=A.substring(j, i+1);
            i++;
            if(i==(A.length())){
                j++;
                i=j;
            }
            if(lst.contains(sub.charAt(0))) count++;
        }
        System.out.println(count);
    }
}
