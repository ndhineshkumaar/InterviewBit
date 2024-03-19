public class IsRectange {
    public static void main(String[] args) {
        int A=1;
        int B=5;
        int C=1;
        int D=2;
        if(A==B){
            if(C==D) System.out.println(1);
            else System.out.println(0);
        }
        else if(A==C){
            if(B==D) System.out.println(1);
            else System.out.println(0);
        }
        else if(A==D){
            if(B==C) System.out.println(1);
            else System.out.println(0);
        }
        else{
            System.out.println(0);
        }
    }
}
