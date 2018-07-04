import java.util.Arrays;

public class printSubsetOfArray {
    public static void main(String[] args){
        int[] arr = {15, 20, 12};
        int[] passable = {};
        print(arr, passable);
    }
    public static void print(int[] input, int[] output){
        if(input.length == 0){
            for(int i : output){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        print(Arrays.copyOfRange(input, 1, input.length), output);
        print(Arrays.copyOfRange(input, 1, input.length), insertingAnElement(input[0], output));

        return;
    }
    public static int[] insertingAnElement(int number, int[] arr){
        int length = arr.length;
        int[] newArr = new int[length+1];
        newArr[length] = number;
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
