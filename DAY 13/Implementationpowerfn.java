public class Implementationpowerfn {
    public static void main(String[] args) {
        int x=5;
        int n=2;
        int d=6;

        if(n==0){
            System.out.println(1%d);
            return;
        }

        long res=1;
        long base=(x%d);

        while(n>0){
            if(n%2==1){
                res=(res*base)%d;
            }
            base=(base*base)%d;
            n/=2;
        }
        System.out.println((res+d)%d);
    }
}
