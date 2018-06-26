public class sumOfArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = summation(arr, 0);
        System.out.println(k);
    }
    public static int summation(int[] input, int index){
        if(index == input.length-1){
            return input[index];
        }
        int n = summation(input, index+1);
        return n+input[index];
    }
}
