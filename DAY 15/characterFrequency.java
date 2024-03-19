import java.util.LinkedHashMap;

public class characterFrequency {
    public static void main(String[] args) {
        String A="scaler";
        LinkedHashMap<Character,Integer> hsh=new LinkedHashMap<>();
        for(int i=0;i<A.length();i++){
            hsh.put(A.charAt(i), hsh.getOrDefault(A.charAt(i), 0)+1);
        }
        int[] res =new int[hsh.size()];
        int j=0;
        for(int i : hsh.values()){
            res[j++]=i;
        }
        for(int i:res){
            System.out.println(i+" ");
        }
    }
}
