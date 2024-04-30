import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size ;i++){
            arr[i] = s.nextInt();
        }
        int[] newArr = new int[size];
        int j = 0;
        for (int i = 0 ; i < size; i++){
            if(arr[i] != 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        while (j < size) {
            newArr[j] = 0;
            j++;
        }
        System.out.println("Array after moving zero to end: " + Arrays.toString(newArr));
    }
}