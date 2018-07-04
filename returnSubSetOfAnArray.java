import java.util.Arrays;

public class returnSubSetOfAnArray {
    public static void main(String[] args){
        int[] arr = {15,20,12};
        int[][] outputchecking = checkingSlicing(arr);
    }
    public static int[][] checkingSlicing(int[] input){
        if(input.length == 0){
            int[][] returnable = {{}};
            return returnable;
        }
        int[][] got = checkingSlicing(Arrays.copyOfRange(input, 1, input.length));
        int[][] changed;
        int length = got.length;
        if(got.length == 1) {
            changed = new int[2][];
        }else{
            changed = new int[length*2][];
        }
        for(int i = 0; i < length; i++){
            changed[i] = got[i];
        }
        for(int i = 0; i < length; i++){
            int length1 = got[i].length;
            int[] arr = new int[length1+1];
            arr[0] = input[0];
            for(int j = 0; j < length1; j++){
                arr[j+1] = got[i][j];
            }
            changed[length+i] = arr;
        }
        return changed;
    }
}
