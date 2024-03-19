public class ChipsFactory {
    public static void main(String[] args) {
        int[] A = {0, 1, 8, 5, 5, 2, 0, 7, 7, 10, 4, 5, 9, 0, 0, 5, 7, 0, 4, 0, 4, 7, 6, 10, 9, 5, 1, 7, 4, 7, 10, 8, 2, 0, 8, 3, 6, 8, 10, 4, 2, 10, 7, 8, 7, 0, 6, 9, 2, 4, 8, 5, 2, 3, 3, 1, 5, 9, 10, 0, 9, 5, 5, 3, 10, 5, 2, 0, 10, 0, 5, 4, 3, 10, 5, 5, 10, 0, 8, 8, 9, 1, 0, 7, 9, 6, 8, 7, 10, 9, 2, 3, 3, 5, 6, 9, 4, 9, 2, 4};
        int n = A.length;
        
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                A[nonZeroIndex++] = A[i];
            }
        }
        while (nonZeroIndex < n) {
            A[nonZeroIndex++] = 0;
        }
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
