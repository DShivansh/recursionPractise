public class checkAB {
    public static void main(String[] args){
        System.out.println(checkAB("ab"));

    }
    public static boolean checkAB(String input){
        if(input.length() == 0){
            return true;
        }
        boolean t = false;
        if(input.charAt(0) == 'a'){
            t = checkAB(input.substring(1));
        }
        if(input.length() >= 2){
        if(input.charAt(0) == 'b' && input.charAt(1) == 'b'){
            t = checkAB(input.substring(2));
        }}

        return t;


    }
}
