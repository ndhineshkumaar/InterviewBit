public class SearchinBiotonic{
    public static void main(String[] args) {
        int [] A = {5, 6, 7, 8, 9, 10, 3, 2, 1};
        int B = 1;
        int first=0;
        int midlen=A.length/2;
        int last=A.length-1;
        if(A[midlen]==B){
            System.out.println(midlen);
            return;
        }
        while(first<=midlen){
            int midtemp=(first+midlen)/2;
            if(A[midtemp]==B){
                System.out.println(midtemp);
                return;
            }
            else if(B<A[midtemp]){
                midlen=midtemp-1;
            }
            else{
                first=midtemp+1;
            }
        }
        first = midlen + 1;
        midlen = (first + last) / 2;
        while (first <= last) {
            if (A[midlen] == B) {
                System.out.println(midlen);
                return;
            } else if (B < A[midlen]) {
                first = midlen + 1;
            } else {
                last = midlen - 1;
            }
            midlen = (first + last) / 2;
        }
        System.out.println(-1);
    }
}
