public class GreaterOfLesser {
    public static void main(String[] args) {
        int[] A={1,10,100};
        int[] B={9,9,9};
        int C = 50 ;
        int countgreat=0;
        int countless=0;
        for(int i:A){
            if (i>C) {
                countgreat++;
            }
        }
        for(int i:B){
            if (i<C) {
                countless++;
            }
        }
        System.out.print(Math.max(countgreat, countless));
        }
}
