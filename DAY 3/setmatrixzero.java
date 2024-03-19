import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setmatrixzero {
    public static void main(String[] args) {
        Integer[][] A={{1,0,1},{1,1,1},{1,1,1}};
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(Integer[] i:A){
            ArrayList<Integer> B=new ArrayList<>(Arrays.asList(i));
            a.add(B);
        }
        Set<Integer> rows =new HashSet<>();
        Set<Integer> col=new HashSet<>();

        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                if(a.get(i).get(j)==0){
                    rows.add(i);
                    col.add(j);
                }
            }
        }
        for(int i:rows){
            for(int j=0;j<a.get(i).size();j++){
                a.get(i).set(j,0);
            }
        }
        for(int i:col){
            for(int j=0;j<a.size();j++){
                a.get(j).set(i,0);
            }
        }
        System.out.println(a);
    }
}
