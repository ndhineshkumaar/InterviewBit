public class BullsAndCows {
    public static void main(String[] args) {
        String A = "1807";
        String B = "7810";
        int count1 = 0, count2 = 0;
        
        // Counting bulls
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i)) {
                count1++;
            }
        }
        
        // Counting cows
        int[] freqA = new int[10];
        int[] freqB = new int[10];
        
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                freqA[A.charAt(i) - '0']++;
                freqB[B.charAt(i) - '0']++;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            count2 += Math.min(freqA[i], freqB[i]);
        }
        
        System.out.println(count1 + "A" + count2 + "B");
    }
}
