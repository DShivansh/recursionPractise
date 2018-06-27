public class returnSubsequenceOfStrings {
    public static void main(String[] args){
//        String[] output = combination("abc");
//        for(String i : output){
//            System.out.println(i);
//        }

    }

    public static String[] combination(String input){
        if(input.equals("")){
            String[] returnable = {""};
            return returnable;
        }
        String[] k = combination(input.substring(1));
        String[] j = new String[k.length*2];
        for(int i = 0; i < k.length; i++){
            j[i] = k[i];
        }
        for(int i = k.length; i < j.length; i++){
            j[i] = input.charAt(0)+k[i-k.length];
        }
        return j;
    }

}
