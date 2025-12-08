public class MinMaxFinder {

    public static void main(String[] args) {
        int[] num = {45, 12, 98, 33, 27, 5, 80};

        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i]; 
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
