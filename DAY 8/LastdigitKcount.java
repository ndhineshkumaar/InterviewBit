public class LastdigitKcount {
    public static void main(String[] args) {
        int A=1;
        int B=9;
        int C=0;
        for(int i=A;i<=B;i++){
            if(i%10==C){
                System.out.println((B-i)/10+1);
                break;
            }
        }

    }
}
