public class removeDuplicates {
    public static void main(String[] args){
        System.out.println(removal("aaabccba"));
    }

    public static String removal(String replace){
        if(replace.length() == 1){
            return replace;
        }
        String t = removal(replace.substring(1));
        if(t.charAt(0) != replace.charAt(0)){
            t = replace.charAt(0)+t;
        }
        return t;
    }

}
