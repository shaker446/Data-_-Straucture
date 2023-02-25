import java.util.Arrays;

public class Q_Tow {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int[] arr2 = new int[100];
        
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        
        System.out.println(Arrays.toString(arr2));
    }
}