public class rangeSumQuery {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int L = 1;
        int R = 3;

        int rangeSum;
        if (L == 0) {
            rangeSum = prefix[R];
        } else {
            rangeSum = prefix[R] - prefix[L - 1];
        }

        System.out.println("Range Sum [" + L + ", " + R + "] = " + rangeSum);
    }
}
