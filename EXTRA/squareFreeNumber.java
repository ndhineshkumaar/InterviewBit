import java.util.ArrayList;
public class squareFreeNumber {
    public static void main(String[] args) {
        int A=72;
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=2;i<=A;i++){
            if(A%i==0) lst.add(i);
        }
        System.out.println(lst);
    }
}
