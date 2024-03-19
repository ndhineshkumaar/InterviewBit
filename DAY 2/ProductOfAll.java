import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfAll {
    public static void main(String[] args) {
        ArrayList<Integer> A =new ArrayList<>(Arrays.asList(0, 2, 3, 4,0));
        long n=A.size();
        ArrayList<Integer> list =new ArrayList<>();
        long product=1;
        long product2=1;
        long zeroes=0;
        long mod = 1000000000+7;
        for(int i=0;i<n;i++){
            product=(product*A.get(i))%mod;
        }
        for(int i=0;i<n;i++){
            if(A.get(i)!=0){
            product2=(product2*A.get(i))%mod;
            }
            else{
                zeroes++;
            }
    }
        for(int i=0;i<n;i++){
            if(A.get(i)!=0){
            long temp=(product/A.get(i))%mod;
            list.add((int)temp);
            }
            else{
                if(zeroes==1){
                list.add((int)product2);
                }
                else{
                    list.add(0);
                }
            }
        }
        System.out.println(list);
        
    }
}