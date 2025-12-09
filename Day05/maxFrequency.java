// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class maxFrequency {
    public static void main(String[] args) {
        int [] arr = {2,3,3,5,3,2,2};
        
        int [] frarr = new int [30];
        
        for (int i = 0; i < arr.length; i++){
            int val = arr[i];
            frarr[val]++;
        }
        
        for (int i = 0; i < frarr.length; i++) {
            if (frarr[i] > 0) {
                System.out.println(i + " appears " + frarr[i] + " times");
            }
        }
        
        int maxFreq = 0;
        int el = -1;
        
        for (int i = 0; i < frarr.length; i++) {
            if (frarr[i] > maxFreq) {
                maxFreq = frarr[i];
                el = i;
            }
        }
        System.out.println("Max Occurence: " + maxFreq + "\nElement: " + el);
    }
}
