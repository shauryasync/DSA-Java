public class countOccurrences {
    public static void main(String[] args) {
        int[] arr = {11,34,1,34,1,45};
        int target = 34;
        int occ = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                occ++;
            }
        }

        System.out.println("Occurrences: " + occ);
    }
}
