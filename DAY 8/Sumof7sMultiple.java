public class Sumof7sMultiple {
    public static void main(String[] args) {
        int A=752897668;
        int B=997260055;
        long first = A % 7 == 0 ? A : A + (7 - A % 7); 
        long last = B - B % 7; 
        
        long count = (last - first) / 7 + 1;
        
        long sum = count * (first + last) / 2; 
        
        System.out.println(sum);
    }
}
