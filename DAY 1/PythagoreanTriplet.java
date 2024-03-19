public class PythagoreanTriplet {
    public static void main(String[] args) {
        int A=13;
        int count=0;
        for (int i=1;i<=A;i++){
            for (int j=i+1;j<=A;j++){
                int temp=(i*i)+(j*j);
                int sqrt=(int)Math.sqrt(temp);
                if(sqrt<=A && sqrt*sqrt==temp ) count++;
            }
        }
        System.out.println(count);
    }
}
