import java.util.*;

public class WaterCan {
    public static void main(String[] args) {
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        ArrayList<Integer> in=new ArrayList<>();
        ArrayList<Long> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            in.add(dk.nextInt());
        }
        long cost=dk.nextInt();
        long costper=0;
        int startindex=0;
        
        for(int j=1;j<=n;j++){
            int index=in.indexOf(j)+1;
            costper+=((Math.abs(index-startindex))*cost);
            startindex=index;
            res.add(costper);
        }
        for(long i:res){
            System.out.print(i+" ");
        }
    }
}
