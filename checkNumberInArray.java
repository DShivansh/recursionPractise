public class checkNumberInArray {
    public static boolean checkNumber(int input[], int x, int index){
        if(input[index] == x){
            return true;
        }
        if(index == input.length-1){
            return false;
        }
        return checkNumber(input, x, index+1);
    }
}
