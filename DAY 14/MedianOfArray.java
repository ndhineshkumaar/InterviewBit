import java.util.*;

public class MedianOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(-50, -41, -40, -19, 5, 21, 28));
        ArrayList<Integer> b=new ArrayList<>(Arrays.asList(-50, -21, -10));

        int length=a.size()+b.size();

        int[] arr=mergeArray(a,b,length);
    

        if(length%2==0){
            System.out.println((double) (arr[length/2]+arr[(length/2)-1])/2);
        } 
        else{
            
            System.out.println((double)(arr[length/2]));
        } 



    }

    public static int[] mergeArray(ArrayList<Integer> A,ArrayList<Integer> B,int len){

        int[] mergedArray=new int[len];

        int ptr1=0;
        int ptr2=0;
        int ptr3=0;

        while(ptr1<A.size() &&  ptr2<B.size() && ptr3<len ){
            if(A.get(ptr1)<B.get(ptr2)){
                mergedArray[ptr3++]=A.get(ptr1++);
            }
            else{
                mergedArray[ptr3++]=B.get(ptr2++);
            }
        }

        while(ptr1<A.size()){
            mergedArray[ptr3++]=A.get(ptr1++);
        }

        while(ptr2<B.size()){
            mergedArray[ptr3++]=B.get(ptr2++);
        }

        return mergedArray;
    }
}
