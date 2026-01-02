class Codechef {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 4, 5};
        boolean sorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}
