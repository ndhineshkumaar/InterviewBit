public class SearchForaRange {
    public static void main(String[] args) {
        int[] A = {5, 7,7, 8, 10};
        int B = 8;
        int[] res = searchaRange(A, B);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] searchaRange(int[] A, int B) {
        int[] res = {-1, -1};
        res[0] = findLeftMostIndex(A, B);
        if (res[0] != -1) {
            res[1] = findRightMostIndex(A, B);
        }
        return res;
    }

    private static int findLeftMostIndex(int[] A, int B) {
        int index = -1;
        int low = 0, high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] >= B) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (A[mid] == B) {
                index = mid;
            }
        }
        return index;
    }

    private static int findRightMostIndex(int[] A, int B) {
        int index = -1;
        int low = 0, high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] <= B) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (A[mid] == B) {
                index = mid;
            }
        }
        return index;
    }
}
