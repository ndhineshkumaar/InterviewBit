public class StepByStep {
    public static void main(String[] args) {
        int A=-5;
        A=Math.abs(A);
        int i=(int)(Math.sqrt(1 + 8*A) - 1) / 2;
        int runningsum=(i*(i+1))/2;
        while ((runningsum < A) || (runningsum - A) % 2 != 0){
            i += 1;
            runningsum += i;
        }
        System.out.println(i);
    }
}
