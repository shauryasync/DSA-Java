public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
    }
}
