public class AllocateBooks {
    public static void main(String[] args) {
        int[] A={5, 17, 100, 11};
        int B=4;
        int first=Integer.MAX_VALUE;
        int last=0;
        for(int i: A){
            if(i<first){
                first=i;
            }
            last+=i;
        }
        int res=-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(ispossible(A,B,mid)){
                res=mid;
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        System.out.println(res);
    }
    public static boolean ispossible(int[] A,int B,int mid){
        int person=1;
        int perpage=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>mid){
                return false;
            }
            if(perpage+A[i]<=mid){
                perpage+=A[i];
            }
            else{
                person++;
                if(person>B) return false;
                perpage=A[i];
            }
        }
        return true;
    }
}
