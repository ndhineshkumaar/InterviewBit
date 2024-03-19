import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        Integer[][] A={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<ArrayList<Integer>> a= new ArrayList<>();
        for(Integer[] i:A){
            ArrayList<Integer> B= new ArrayList<>(Arrays.asList(i));
            a.add(B) ;
        }
        for(int i=0;i<a.size();i++){
            for(int j=i;j<a.get(0).size();j++){
                int temp= a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,temp);
            }
        }
        for(int i=0;i<a.size()/2;i++){
            for(int j=0;j<a.get(0).size();j++){
                int temp= a.get(j).get(i);
                a.get(j).set(i,a.get(j).get(a.size()-i-1));
                a.get(j).set(a.get(j).size()-i-1,temp);
            }
        }


        System.out.println(a);


    }
}
