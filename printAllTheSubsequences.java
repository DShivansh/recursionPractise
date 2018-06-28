public class printAllTheSubsequences {
    public static void main(String[] args){
//        printingCombinations("abc","");
    }
    public static void printingCombinations(String input, String answer){
        if(input.equals("")){
            System.out.println(answer);
            return;
        }

        printingCombinations(input.substring(1), answer);
        printingCombinations(input.substring(1), answer+input.charAt(0));

    }
}
