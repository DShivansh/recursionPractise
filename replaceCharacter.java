public class replaceCharacter {
    public static void main(String[] args){
        System.out.println(replace("abacd","a", "x"));
    }
    public static String replace(String input, String Relace, String Replace){
        if(input.equals("")){
            return "";
        }
        String n = replace(input.substring(1), Relace, Replace);
        if(input.charAt(0) == Relace.charAt(0)){
            n=Replace+n;
        }else{
            n=input.charAt(0)+n;
        }
        return n;
    }

}
