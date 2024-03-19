public class Digitalroot {
    public static void main(String[] args) {
        int A=99;
        int c=0;
        while(A!=0){
            int rem=A%10;
            c+=rem;
            A=A/10;
            if(c>9 && A==0){
                A=c;
                c=0;
            }
        }
        System.out.println(c);
    }
}
