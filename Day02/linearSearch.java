public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {11,21,34,1,45};
        int target = 4;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Not Found");
        }
    }
}
