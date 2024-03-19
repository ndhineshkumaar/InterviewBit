public class PowerofTwoIntegers {
    public static void main(String[] args) {
        int A = 1024000000;
        if (isPower(A)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean isPower(int A) {
        if (A == 1) return true;

        for (int i = 2; (long) i * i <= A; i++) {
            int temp = A;
            while (temp % i == 0) {
                temp /= i;
                if (temp == 1) return true;
            }
        }
        return false;
    }
}
