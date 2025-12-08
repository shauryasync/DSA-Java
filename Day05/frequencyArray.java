class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,2,1,4};
        int [] farr = new int [arr.length];
        for (int i = 0; i < arr.length; i++){
            int val = arr[i];
            farr[val]++;
        }
        for(int i = 0; i < farr.length; i++){
            if (farr[i] > 0){
                System.out.println(i+": "+farr[i]);
            }
        }
    }
}
